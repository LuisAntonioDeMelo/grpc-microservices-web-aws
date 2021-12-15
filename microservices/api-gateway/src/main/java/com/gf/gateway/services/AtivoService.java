package com.gf.gateway.services;

import com.gf.gateway.rest.vo.AtivoVO;
import com.grpc.proto.AtivoDTO;
import com.grpc.proto.AtivoRequest;
import com.grpc.proto.AtivosReponse;
import com.grpc.proto.AtivoServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtivoService {

    @GrpcClient(value = "financeiro-service")
    private AtivoServiceGrpc.AtivoServiceBlockingStub blockingStub;

    public List<AtivoVO> findAll(Long idCliente){
        AtivosReponse ativosReponse = blockingStub.obterAtivos(AtivoRequest.newBuilder().setId(idCliente).build());
        return AtivoVO.toList(ativosReponse.getAtivosList());
    }

    public AtivoVO adicionarAtivo(AtivoVO ativoVO){
        AtivoDTO ativosReponse = blockingStub.adicionarAtivo(ativoVO.buildNewAtivo());
        return AtivoVO.toVo(ativosReponse);
    }
}
