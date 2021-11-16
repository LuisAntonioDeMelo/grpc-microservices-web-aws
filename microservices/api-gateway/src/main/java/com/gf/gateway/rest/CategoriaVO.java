package com.gf.gateway.rest;

import com.grpc.proto.CategoriaDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaVO {

    private Long id;
    private String nome;

//    public static CategoriaDTO buildProto(){
//        return CategoriaDTO.newBuilder().setId(id).setNome(nome).build();
//    }

    public static CategoriaVO toVO(CategoriaDTO dto){
        return CategoriaVO.
                builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .build();
    }
}

