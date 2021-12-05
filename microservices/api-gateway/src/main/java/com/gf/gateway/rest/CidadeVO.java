package com.gf.gateway.rest;

import com.grpc.proto.cidadeDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class CidadeVO {

    private Long codigo;
    private String nome;


    public static List<CidadeVO> toList(List<cidadeDTO> cidades) {
        List<CidadeVO> cidadeVOS = new ArrayList<>();
        cidades.stream().forEach(c -> {
            cidadeVOS.add(new CidadeVO(c.getCodigo(),c.getNome()));
        });
        return cidadeVOS;
    }
}
