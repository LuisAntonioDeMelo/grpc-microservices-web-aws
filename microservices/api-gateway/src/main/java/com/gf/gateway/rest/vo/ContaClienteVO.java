package com.gf.gateway.rest.vo;

import com.grpc.proto.ContaClienteDTO;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class ContaClienteVO {

    private Long id;
    private Long clienteId;
    private Integer banco;
    private String numeroConta;
    private Double saldo;
    private String digito;
    private Double debitoPedente;
    private Integer conta;

    public static ContaClienteVO toVO(ContaClienteDTO dto){
        return ContaClienteVO.builder()
                .id(dto.getId())
                .clienteId(dto.getClienteId())
                .digito(dto.getDigito())
                .numeroConta(dto.getNumeroConta())
                .saldo(dto.getSaldo())
                .banco(dto.getBanco())
                .conta(dto.getTipoConta())
                .build();
    }
    public ContaClienteDTO buildProto() {
        return ContaClienteDTO.newBuilder()
                .setId(getId())
                .setTipoConta(getConta())
                .setClienteId(getClienteId())
                .setBanco(getBanco())
                .setDigito(getDigito())
                .setSaldo(getSaldo())
                .setNumeroConta(getNumeroConta())
                .build();
    }

    public ContaClienteDTO buildNewProto() {
        return ContaClienteDTO.newBuilder()
                .setTipoConta(getConta())
                .setClienteId(getClienteId())
                .setBanco(getBanco())
                .setDigito(getDigito())
                .setSaldo(getSaldo())
                .setNumeroConta(getNumeroConta())
                .build();
    }

    public static List<ContaClienteVO> toList(List<ContaClienteDTO> dtos){
        List<ContaClienteVO> clienteVOS = new ArrayList<>();
        dtos.stream().forEach(dto -> {
            clienteVOS.add(toVO(dto));
        });
        return clienteVOS;
    }
}
