package com.gf.gateway.services;

import com.gf.gateway.rest.vo.ContaClienteVO;
import com.grpc.proto.ContaClienteDTO;
import com.grpc.proto.ContaClienteServiceGrpc;
import com.grpc.proto.ContaRequest;
import com.grpc.proto.ResponseContas;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteContaService {

    @GrpcClient("corporative-service")
    private ContaClienteServiceGrpc.ContaClienteServiceBlockingStub  blockingStub;

    public List<ContaClienteVO> obterContas(Long idCliente){
        ContaRequest res = ContaRequest.newBuilder().setIdCliente(idCliente).build();
        ResponseContas responseContas = blockingStub.obterContasCliente(res);
        return ContaClienteVO.toList(responseContas.getContasClientesList());
    }

    public ContaClienteVO obterPorCodigo(Long codigo) {
        ContaRequest request = ContaRequest.newBuilder().setIdCliente(codigo).build();
        ContaClienteDTO dto = blockingStub.obterContaCliente(request);
        return ContaClienteVO.toVO(dto);
    }

    public ContaClienteVO salvarCliente(ContaClienteVO clienteVO) {
        ContaClienteDTO response = blockingStub.cadastrarConta(clienteVO.buildNewProto());
        return ContaClienteVO.toVO(response);
    }

}
