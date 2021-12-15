package com.gf.gateway.rest.vo;

import com.grpc.proto.AtivoDTO;
import com.grpc.proto.EstadoDTO;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class AtivoVO {

    private Long idAtivo;
    private Long idCliente;
    private String codigo;
    private Double quantidade;
    private String nome;
    private Double valorMoeda;
    private Double valorFracionado;


    public AtivoDTO buildNewAtivo(){
        return AtivoDTO.newBuilder().
                setClienteId(getIdCliente())
                .setCodigo(getCodigo())
                .setNome(getNome())
                .setQuantidade(getQuantidade())
                .setValorFracionado(getValorFracionado())
                .setValorMoeda(getValorMoeda())
                .build();
    }

    public static AtivoVO toVo(AtivoDTO dto){
        return AtivoVO.builder()
                .idAtivo(dto.getId())
                .idCliente(dto.getClienteId())
                .codigo(dto.getCodigo())
                .nome(dto.getNome())
                .valorMoeda(dto.getValorMoeda())
                .valorFracionado(dto.getValorFracionado())
                .quantidade(dto.getQuantidade())
                .build();
    }

    public static List<AtivoVO> toList(List<AtivoDTO> dtos) {
        List<AtivoVO> voList = new ArrayList<>();
        dtos.stream().forEach(dto -> voList.add(toVo(dto)));
        return voList;
    }
}
