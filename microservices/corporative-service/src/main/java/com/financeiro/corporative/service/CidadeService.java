package com.financeiro.corporative.service;

import com.financeiro.corporative.model.Cidade;
import com.financeiro.corporative.repository.CidadeRepository;
import com.grpc.proto.CidadeServiceGrpc;
import com.grpc.proto.CidadesResponse;
import com.grpc.proto.cidadeDTO;
import com.grpc.proto.emptyCidade;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;


@GrpcService
public class CidadeService extends CidadeServiceGrpc.CidadeServiceImplBase {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public void obterCidades(emptyCidade request, StreamObserver<CidadesResponse> responseObserver) {
        List<Cidade> cidades = cidadeRepository.findAll();
        if (!CollectionUtils.isEmpty(cidades)) {
            List<cidadeDTO> cidadeDTOS = cidades.stream().map(c -> getBuild(c)).collect(Collectors.toList());
            CidadesResponse response = CidadesResponse.newBuilder().addAllCidades(cidadeDTOS).build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }


    private cidadeDTO getBuild(Cidade c) {
        return cidadeDTO.newBuilder().setCodigo(c.getCodigo()).setNome(c.getNome()).build();
    }
}
