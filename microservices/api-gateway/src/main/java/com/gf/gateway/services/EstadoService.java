package com.gf.gateway.services;

import com.gf.gateway.rest.EstadoVO;
import com.grpc.proto.EstadoServiceGrpc;
import com.grpc.proto.EstadosResponse;
import com.grpc.proto.emptyEstado;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @GrpcClient("corporative-service")
    private EstadoServiceGrpc.EstadoServiceBlockingStub blockingStub;

    public List<EstadoVO> obterEstados(){
        EstadosResponse dto = blockingStub.obterEstados(emptyEstado.newBuilder().build());
        return EstadoVO.toList(dto.getEstadosList());
    }
}
