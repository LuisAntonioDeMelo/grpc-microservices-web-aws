package com.gf.gateway.rest;

import com.grpc.proto.EstadoDTO;
import com.grpc.proto.cidadeDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
public class EstadoVO {

    private Long codigo;
    private String nome;


    public static List<EstadoVO> toList(List<EstadoDTO> estados) {
        List<EstadoVO> estadoVOS = new ArrayList<>();
        estados.stream().forEach(e -> {
            estadoVOS.add(new EstadoVO(e.getCodigo(),e.getNome()));
        });
        return estadoVOS;
    }
}
