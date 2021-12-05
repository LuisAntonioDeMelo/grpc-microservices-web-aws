package com.gf.gateway.services;

import com.gf.gateway.rest.ClienteVO;
import com.grpc.proto.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @GrpcClient("corporative-service")
    private ClienteServiceGrpc.ClienteServiceBlockingStub clienteServiceBlockingStub;

    @GrpcClient("corporative-service")
    private PessoaServiceGrpc.PessoaServiceBlockingStub pessoaServiceBlockingStub;


    @Autowired
    private PessoaService pessoaService;

    public ClienteVO obterPorCodigo(Long codigo) {
        ClienteRequest request = ClienteRequest.newBuilder().setCodigo(codigo).build();
        ClienteResponse response = clienteServiceBlockingStub.obterPorId(request);
        PessoaResponse pessoaResponse =
                pessoaServiceBlockingStub.obterPorId(
                    PessoaRequest.newBuilder().setCodigo(response.getCliente().getIdPessoa())
                .build());
        return ClienteVO.toVO(response.getCliente(), pessoaResponse.getPessoa());
    }

    public ClienteVO salvarCliente(ClienteVO clienteVO) {
        PessoaDTO pessoaDTO = pessoaService.enviarClientePessoa(clienteVO);
        clienteVO.setIdPessoa(pessoaDTO.getId());
        ClienteResponse clienteResponse = clienteServiceBlockingStub.salvarCliente(clienteVO.buildNewProto());
        return ClienteVO.toNewVO(clienteResponse.getCliente(), pessoaDTO);
    }


}
