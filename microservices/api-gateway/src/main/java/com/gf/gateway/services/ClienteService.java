package com.gf.gateway.services;

import com.gf.gateway.rest.ClienteVO;
import com.grpc.proto.ClienteDTO;
import com.grpc.proto.ClienteRequest;
import com.grpc.proto.ClienteResponse;
import com.grpc.proto.ClienteServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends ClienteServiceGrpc.ClienteServiceImplBase {

    @GrpcClient("corporative-service")
    private ClienteServiceGrpc.ClienteServiceBlockingStub clienteServiceBlockingStub;


    public ClienteVO obterPorCodigo(Long codigo){
        ClienteRequest request =  ClienteRequest.newBuilder().setCodigo(codigo).build();
        ClienteResponse response =  clienteServiceBlockingStub.obterPorId(request);
        ClienteDTO dto  = response.getCliente();
        return ClienteVO.toVO(dto);
    }

    public ClienteVO salvarCliente(ClienteVO clienteVO){
        ClienteResponse clienteResponse =
                clienteServiceBlockingStub.salvarCliente(clienteVO.buildProto());
        return ClienteVO.toVO(clienteResponse.getCliente());
    }


}
