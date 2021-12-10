package com.financeiro.corporative.service;

import com.financeiro.corporative.model.Cliente;
import com.financeiro.corporative.model.ContaCliente;
import com.financeiro.corporative.model.enums.TipoConta;
import com.financeiro.corporative.repository.ContaClienteRepository;
import com.grpc.proto.*;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class ContaClienteService extends ContaClienteServiceGrpc.ContaClienteServiceImplBase {

    @Autowired
    private ContaClienteRepository contaClienteRepository;

    @Override
    public void cadastrarConta(ContaClienteDTO request, StreamObserver<ContaClienteDTO> responseObserver) {
       try {
           ContaCliente contaCliente = new ContaCliente();
           Cliente cliente = new Cliente();
           cliente.setId(request.getClienteId());
           contaCliente.setCliente(cliente);
           contaCliente.setBanco(request.getBanco());
           contaCliente.setNumeroConta(request.getNumeroConta());
           contaCliente.setDigito(request.getDigito());
           contaCliente.setSaldo(request.getSaldo());
           contaCliente.setConta(TipoConta.CORRENTE.getByValue((int) request.getTipoConta()));
           ContaCliente contaClienteSaved = contaClienteRepository.save(contaCliente);
           responseObserver.onNext(getBuild(contaClienteSaved));
           responseObserver.onCompleted();
       }catch (Exception e ){
           responseObserver
                   .onError(new StatusRuntimeException(
                           Status.ABORTED.withDescription("Não foi possivel salvar Cliente" + e.getMessage()))
                    );
       }
    }

    @Override
    public void obterContasCliente(ContaRequest request, StreamObserver<ResponseContas> responseObserver) {
        List<ContaCliente> contaClientes = contaClienteRepository
                .obterContasPorIdCliente(request.getIdCliente());
        List<ContaClienteDTO>  contaClienteDTOS =
                contaClientes
                .stream()
                .map(c -> getBuild(c))
                .collect(Collectors.toList());
        ResponseContas responseContas = ResponseContas.newBuilder().addAllContasClientes(contaClienteDTOS).build();
        responseObserver.onNext(responseContas);
        responseObserver.onCompleted();
    }

    @Override
    public void obterContaCliente(ContaRequest request, StreamObserver<ContaClienteDTO> responseObserver) {
       Optional<ContaCliente> contaCliente = contaClienteRepository.findById(request.getIdCliente());
       if(contaCliente.isPresent()){
           responseObserver.onNext(getBuild(contaCliente.get()));
       }
        responseObserver.onCompleted();
    }


    private ContaClienteDTO getBuild(ContaCliente contaCliente){
        return ContaClienteDTO.newBuilder()
                .setClienteId(contaCliente.getId())
                .setBanco(contaCliente.getBanco())
                .setDigito(contaCliente.getDigito())
                .setClienteId(contaCliente.getCliente().getId())
                .setSaldo(contaCliente.getSaldo())
                .setTipoConta(contaCliente.getConta().getCodigo())
                .build();
    }
}
