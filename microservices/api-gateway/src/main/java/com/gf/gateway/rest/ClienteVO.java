package com.gf.gateway.rest;

import com.grpc.proto.ClienteDTO;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ClienteVO {

    private Long id;
    private Long idPessoa;
    private Double limite;
    private String nome;
    private Integer diaVencimento;
    private Boolean credito;
    private String dataCadastro;

    public ClienteDTO buildProto() {
        return ClienteDTO.newBuilder()
                .setIdPessoa(idPessoa)
                .setLimite(limite)
                .setCredito(credito)
                .setDiaVencimento(diaVencimento)
                .build();
    }

    public static ClienteVO toVO(ClienteDTO dto) {
        return ClienteVO
                .builder()
                .id(dto.getId())
                .idPessoa(dto.getIdPessoa())
                .nome(dto.getNomeCliente())
                .dataCadastro(dto.getDataCadastro())
                .limite(dto.getLimite())
                .credito(dto.getCredito())
                .diaVencimento(dto.getDiaVencimento())
                .build();
    }
}
