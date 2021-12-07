package com.gf.gateway.rest;

import com.grpc.proto.LancamentoDTO;
import com.grpc.proto.TipoLancamento;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class LancamentoVO {

    private Long codigo;
    private String descricao;
    private String dataPagamento;
    private String dataVencimento;
    private Long idCliente;
    private Long idCategoria;
    private Double valor;
    private String observacao;
    private int tipo;


    public LancamentoDTO buildProto() {
        return LancamentoDTO.newBuilder()
                .setIdCliente(this.getIdCliente())
                .setObservacao(this.getObservacao())
                .setIdCategoria(this.idCategoria)
                .setDescricao(this.getDescricao())
                .setValor(this.getValor())
                .setDataPagamento(this.getDataPagamento())
                .setDataVencimento(this.getDataVencimento())
                .setTipo(TipoLancamento.forNumber(tipo))
                .build();
    }

    public static LancamentoVO toVO(LancamentoDTO dto){
        return LancamentoVO.builder()
                .codigo(dto.getCodigo())
                .descricao(dto.getDescricao())
                .observacao(dto.getObservacao())
                .valor(dto.getValor())
                .idCliente(dto.getIdCliente())
                .idCategoria(dto.getIdCategoria())
                .dataPagamento(dto.getDataPagamento())
                .tipo(dto.getTipo().getNumber())
                .build();
    }

    public static List<LancamentoVO> toList(List<LancamentoDTO> lancamentoDto){
        List<LancamentoVO> lancamentoVOS = new ArrayList<>();
        lancamentoDto.stream().forEach(dto -> {
            lancamentoVOS.add(toVO(dto));
        });
        return lancamentoVOS;
    }

}


