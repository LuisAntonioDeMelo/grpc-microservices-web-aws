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
        LancamentoRequest resquest =  LancamentoRequest.newBuilder().setCodigo(codigo.intValue()).build();
        LancamentoResponse response =  blockingStub.obterLancamento(resquest);
        LancamentoDTO dto  = response.getLancamento();
        return LancamentoVO.toVO(dto);
    }

    public LancamentoVO salvarLancamento(LancamentoVO lancamentoVO){
        LancamentoResponse response = blockingStub.salvarLancamento(lancamentoVO.buildProto());
        return LancamentoVO.toVO(response.getLancamento());
    }

    public List<LancamentoVO> listarTodos(Long id) {
        pesquisaRequest pesquisaRes =  pesquisaRequest.newBuilder().setIdPessoa(id).build();
        LancamentosResponse response = blockingStub.listar(pesquisaRes);
        return LancamentoVO.toList(response.getLancamentosList());
    }
}
