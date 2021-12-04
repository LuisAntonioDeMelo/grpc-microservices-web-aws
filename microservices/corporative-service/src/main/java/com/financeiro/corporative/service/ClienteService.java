package com.financeiro.corporative.service;

import com.financeiro.corporative.model.Cliente;
import com.financeiro.corporative.model.Pessoa;
import com.financeiro.corporative.repository.ClienteRepository;
import com.financeiro.corporative.repository.PessoaRepository;
import com.grpc.proto.ClienteDTO;
import com.grpc.proto.ClienteRequest;
import com.grpc.proto.ClienteResponse;
import com.grpc.proto.ClienteServiceGrpc;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import utils.Utils;

import java.util.Optional;

@GrpcService
public class ClienteService extends ClienteServiceGrpc.ClienteServiceImplBase {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void obterPorId(ClienteRequest request, StreamObserver<ClienteResponse> responseObserver) {
        Optional<Cliente> cliente = clienteRepository.obterPorId(request.getCodigo());
        if (cliente.isPresent()) {
            ClienteDTO dto = getBuild(cliente.get());
            responseObserver.onNext(ClienteResponse.newBuilder().setCliente(dto).build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void salvarCliente(ClienteDTO request, StreamObserver<ClienteResponse> responseObserver) {
        try{
            Cliente cliente = new Cliente();
            cliente.setCredito(request.getCredito());
            cliente.setDiaVencimento(request.getDiaVencimento());
            cliente.setLimite(request.getLimite());
            Pessoa pessoa = pessoaRepository.getById(request.getIdPessoa());
            cliente.setPessoa(pessoa);
            Cliente clienteSalvo =  clienteRepository.save(cliente);
            ClienteResponse clienteResponse = ClienteResponse.newBuilder().setCliente(getBuild(clienteSalvo)).build();
            responseObserver.onNext(clienteResponse);
        }
        catch (Exception e){
            responseObserver.onError(
                    new StatusRuntimeException(
                            Status.ABORTED.withDescription("Não foi possivel salvar Cliente" + e.getMessage())
                    )
            );
        }
        responseObserver.onCompleted();
    }

    private ClienteDTO getBuild(Cliente cliente) {
        return ClienteDTO.newBuilder()
                .setId(cliente.getId())
                .setIdPessoa(cliente.getPessoa().getId())
                 .setNomeCliente(cliente.getPessoa().getNome())
                .setLimite(cliente.getLimite())
                .setDataCadastro(cliente.getDataCadastro().toString())
                .setDiaVencimento(cliente.getDiaVencimento())
                .setCredito(cliente.getCredito())
                .build();
    }
}
