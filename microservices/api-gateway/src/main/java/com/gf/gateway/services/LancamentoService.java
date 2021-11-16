package com.gf.gateway.services;
import com.gf.gateway.rest.LancamentoVO;
import com.grpc.proto.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoService extends LancamentoServiceGrpc.LancamentoServiceImplBase {

    @GrpcClient(value = "gestao-service")
    private LancamentoServiceGrpc.LancamentoServiceBlockingStub blockingStub;

    public LancamentoVO obterPorCodigo(Long codigo) {
        LancamentoResquest resquest =  LancamentoResquest.newBuilder().setCodigo(codigo.intValue()).build();
        LancamentoResponse response =  blockingStub.obterLancamento(resquest);
        LancamentoDTO dto  = response.getLancamento();
        return LancamentoVO.toVO(dto);
    }

    public LancamentoVO salvarLancamento(LancamentoVO lancamentoVO){
        LancamentoResponse response = blockingStub.salvarLancamento(lancamentoVO.buildProto());
        return LancamentoVO.toVO(response.getLancamento());
    }

    public List<LancamentoVO> listarTodos() {
        LancamentosResponse response = blockingStub.listar(emptyRequest.newBuilder().build());
        return LancamentoVO.toList(response.getLancamentosList());
    }
}
