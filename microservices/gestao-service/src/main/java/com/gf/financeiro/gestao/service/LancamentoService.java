package com.gf.financeiro.gestao.service;

import com.gf.financeiro.gestao.model.Lancamento;
import com.gf.financeiro.gestao.model.enums.TipoLancamento;
import com.gf.financeiro.gestao.repository.LancamentoRepository;
import com.grpc.proto.*;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.SneakyThrows;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import utils.Utils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.grpc.proto.TipoLancamento.forNumber;

@GrpcService
public class LancamentoService extends LancamentoServiceGrpc.LancamentoServiceImplBase {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @GrpcClient(value = "corporative-service")
    private ClienteServiceGrpc.ClienteServiceBlockingStub clienteServiceBlockingStub;

    @SneakyThrows
    @Override
    public void obterLancamento(LancamentoResquest request, StreamObserver<LancamentoResponse> responseObserver) {
        Optional<Lancamento> lancamento = lancamentoRepository.findById(new Long(request.getCodigo()));
        if (lancamento.isPresent()) {
            LancamentoDTO lancamentoDTO = getBuild(lancamento.get());
            responseObserver.onNext(LancamentoResponse.newBuilder().setLancamento(lancamentoDTO).build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void salvarLancamento(LancamentoDTO request, StreamObserver<LancamentoResponse> responseObserver) {
        try {
            Lancamento lancamento = new Lancamento();
            lancamento.setTipoLancamento(TipoLancamento.getByValue(request.getTipoValue()));
            lancamento.setDescricao(request.getDescricao());
            lancamento.setObservacao(request.getObservacao());
            lancamento.setCliente(new Cliente(request.getClienteId()));
            lancamento.setDataPagamento(Utils.formatDateTime(request.getDataPagamento()));
            lancamento.setDataVencimento(Utils.formatDateTime(request.getDataVencimento()));
            lancamento.setValor(request.getValor());
            obterCliente(request, lancamento);
            Lancamento lancamentoSalvo = lancamentoRepository.save(lancamento);
            LancamentoDTO lancamentoDTO = getBuild(lancamentoSalvo);
            LancamentoResponse response = LancamentoResponse.newBuilder().setLancamento(lancamentoDTO).build();
            responseObserver.onNext(response);
        } catch (Exception e) {
            onError(responseObserver, "Não foi possivél salvar Lançamento" + e.getMessage());
        }
        responseObserver.onCompleted();
    }

    private void obterCliente(LancamentoDTO request, Lancamento lancamento) {
        ClienteRequest clienteRequest = ClienteRequest.newBuilder().setCodigo(request.getClienteId()).build();
        ClienteResponse clienteResponse = clienteServiceBlockingStub.obterPorId(clienteRequest);
        lancamento.setCliente(new Cliente(clienteResponse.getCliente().getId()));
    }

    @Override
    public void listar(emptyRequest request, StreamObserver<LancamentosResponse> responseObserver) {
        List<Lancamento> lancamentos = lancamentoRepository.findAll();
        if (!CollectionUtils.isEmpty(lancamentos)) {
            List<LancamentoDTO> lancamentoDTOList =
                    lancamentos.stream()
                            .map(l -> getBuild(l))
                            .collect(Collectors.toList());

            LancamentosResponse response = LancamentosResponse.newBuilder().addAllLancamentos(lancamentoDTOList).build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();

    }

    private LancamentoDTO getBuild(Lancamento lancamento) {
        return LancamentoDTO.
                newBuilder()
                .setCodigo(lancamento.getCodigo())
                .setValor(lancamento.getValor())
                .setClienteId(lancamento.getCliente().getId())
                .setDescricao(lancamento.getDescricao())
                .setDataVencimento(lancamento.getDataVencimento() != null ? lancamento.getDataVencimento().toString() : "")
                .setDataPagamento(lancamento.getDataPagamento() != null ? lancamento.getDataPagamento().toString() : "")
                .setTipo(forNumber(lancamento.getTipoLancamento().getCodigo()))
                .setObservacao(lancamento.getObservacao())
                .build();
    }

    private void onError(StreamObserver<LancamentoResponse> responseObserver, String msg) {
        responseObserver.onError(new StatusRuntimeException(Status.ABORTED.withDescription(msg)));
    }


}
