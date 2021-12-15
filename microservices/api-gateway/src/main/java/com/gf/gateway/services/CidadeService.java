package com.gf.gateway.services;

import com.gf.gateway.rest.vo.CidadeVO;
import com.grpc.proto.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService  {

    @GrpcClient("corporative-service")
    private CidadeServiceGrpc.CidadeServiceBlockingStub blockingStub;

    public List<CidadeVO> obterCidades(){
        CidadesResponse dto = blockingStub.obterCidades(emptyCidade.newBuilder().build());
        return CidadeVO.toList(dto.getCidadesList());
    }
}
