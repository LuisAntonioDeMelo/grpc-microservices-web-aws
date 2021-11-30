package com.gf.gateway.rest;

import com.grpc.proto.CategoriaDTO;
import com.grpc.proto.LancamentoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaVO {

    private String nome;
    private long id;

    public  CategoriaDTO buildProto(){
        return CategoriaDTO.newBuilder().setId(this.id).setNome(nome).build();
    }

    public static CategoriaVO toVO(CategoriaDTO dto){
        return CategoriaVO.
                builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .build();
    }

    public static List<CategoriaVO> toList(List<CategoriaDTO> categorias){
        List<CategoriaVO> categoriaVOS = new ArrayList<>();
        categorias.stream().forEach(dto -> {
            categoriaVOS.add(toVO(dto));
        });
        return categoriaVOS;
    }
}

