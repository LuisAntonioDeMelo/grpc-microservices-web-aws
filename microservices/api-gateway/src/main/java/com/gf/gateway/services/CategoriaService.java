package com.gf.gateway.services;

import com.gf.gateway.rest.CategoriaVO;
import com.grpc.proto.CategoriaServiceGrpc;
import com.grpc.proto.categoriasResponse;
import com.grpc.proto.emptyCategoria;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService extends CategoriaServiceGrpc.CategoriaServiceImplBase {

    @GrpcClient(value = "gestao-service")
    private CategoriaServiceGrpc.CategoriaServiceBlockingStub blockingStub;


    public List<CategoriaVO> findAll() {
       categoriasResponse dto = blockingStub.obterCategorias(emptyCategoria.newBuilder().build());
       return CategoriaVO.toList(dto.getCategoriasList());
    }

}
