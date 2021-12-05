package com.financeiro.corporative.service;

import com.financeiro.corporative.model.Estado;
import com.financeiro.corporative.repository.EstadoRepository;
import com.grpc.proto.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class EstadoService extends EstadoServiceGrpc.EstadoServiceImplBase {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public void obterEstados(emptyEstado request, StreamObserver<EstadosResponse> responseObserver) {
        List<Estado> estados = estadoRepository.findAll();
        if (!CollectionUtils.isEmpty(estados)) {
            List<EstadoDTO> estadoDTOList = estados.stream().map(l -> getBuild(l)).collect(Collectors.toList());
            EstadosResponse response = EstadosResponse.newBuilder().addAllEstados(estadoDTOList).build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    private EstadoDTO getBuild(Estado e) {
        return EstadoDTO.newBuilder().setCodigo(e.getCodigo()).setNome(e.getNome()).build();
    }
}
