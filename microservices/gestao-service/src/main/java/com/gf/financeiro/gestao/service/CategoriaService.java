package com.gf.financeiro.gestao.service;

import com.gf.financeiro.gestao.model.Categoria;
import com.gf.financeiro.gestao.repository.CategoriaRepository;
import com.grpc.proto.CategoriaDTO;
import com.grpc.proto.CategoriaServiceGrpc;
import com.grpc.proto.categoriasResponse;
import com.grpc.proto.emptyCategoria;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class CategoriaService extends CategoriaServiceGrpc.CategoriaServiceImplBase {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public void obterCategorias(emptyCategoria request, StreamObserver<categoriasResponse> responseObserver) {
        List<Categoria> categorias = categoriaRepository.findAll();
      //  if (!CollectionUtils.isEmpty(categorias)) {
            List<CategoriaDTO>  categoriaDTOS =
                    categorias.stream()
                            .map(c -> getBuild(c))
                            .collect(Collectors.toList());

            categoriasResponse response = categoriasResponse.newBuilder().addAllCategorias(categoriaDTOS).build();
            responseObserver.onNext(response);
       // }
        responseObserver.onCompleted();
    }

    @Override
    public void salvarCategoria(CategoriaDTO request, StreamObserver<CategoriaDTO> responseObserver) {
        try{
            Categoria categoria = new Categoria();
            categoria.setNome(request.getNome());
            categoria = categoriaRepository.save(categoria);
            responseObserver.onNext(getBuild(categoria));
        }catch (Exception e){
            responseObserver.onError(
                    new StatusRuntimeException(Status.ABORTED.withDescription("Não foi possivel salvar categoria"))
            );
        }
        responseObserver.onCompleted();
    }

    private CategoriaDTO getBuild(Categoria c) {
        return CategoriaDTO.newBuilder()
                .setNome(c.getNome())
                .setId(c.getCodigo())
                .build();
    }
}
