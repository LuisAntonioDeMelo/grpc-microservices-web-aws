package com.gf.gateway.services;

import com.gf.gateway.rest.ClienteVO;
import com.grpc.proto.PessoaDTO;
import com.grpc.proto.PessoaResponse;
import com.grpc.proto.PessoaServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @GrpcClient("corporative-service")
    private PessoaServiceGrpc.PessoaServiceBlockingStub pessoaServiceBlockingStub;

    public PessoaDTO enviarClientePessoa(ClienteVO vo){
        PessoaResponse pessoaResponse = pessoaServiceBlockingStub.atualizarPessoa(vo.buildPessoaDTO());
        return pessoaResponse.getPessoa();
    }


}
