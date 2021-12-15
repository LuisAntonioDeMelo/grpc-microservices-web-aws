package com.gf.financeiro.service;

import com.gf.financeiro.model.Ativo;
import com.gf.financeiro.model.shared.Cliente;
import com.gf.financeiro.repository.AtivoRepository;
import com.grpc.proto.AtivoDTO;
import com.grpc.proto.AtivoRequest;
import com.grpc.proto.AtivoServiceGrpc;
import com.grpc.proto.AtivosReponse;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;


@GrpcService
public class AtivoService extends AtivoServiceGrpc.AtivoServiceImplBase {

    @Autowired
    private AtivoRepository ativoRepository;

    @Override
    public void adicionarAtivo(AtivoDTO request, StreamObserver<AtivoDTO> responseObserver) {
        try {
            Cliente cliente = new Cliente();
            cliente.setId(request.getClienteId());
            Ativo ativo = Ativo.builder().codigo(request.getCodigo())
                    .nome(request.getNome())
                    .quantidade(request.getQuantidade())
                    .valorFracionado(request.getValorFracionado())
                    .valorMoeda(request.getValorMoeda())
                    .cliente(cliente)
                    .build();
            Ativo ativoSaved = ativoRepository.save(ativo);
            responseObserver.onNext(getBuild(ativoSaved));
        } catch (Exception e) {
            responseObserver.onError(
                    new StatusRuntimeException(Status.ABORTED.withDescription("Não foi possível salvar Ativo "))
            );
        }
        responseObserver.onCompleted();
    }

    private AtivoDTO getBuild(Ativo ativo){
        return AtivoDTO.newBuilder()
                .setId(ativo.getId())
                .setCodigo(ativo.getCodigo())
                .setNome(ativo.getNome())
                .setValorMoeda(ativo.getValorMoeda())
                .setValorFracionado(ativo.getValorFracionado())
                .setQuantidade(ativo.getQuantidade())
                .build();
    }

    @Override
    public void obterAtivos(AtivoRequest request, StreamObserver<AtivosReponse> responseObserver) {
        super.obterAtivos(request, responseObserver);
    }

    @Override
    public void obterPorId(AtivoRequest request, StreamObserver<AtivoDTO> responseObserver) {
        super.obterPorId(request, responseObserver);
    }
}
