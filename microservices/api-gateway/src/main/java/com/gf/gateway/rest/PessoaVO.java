package com.gf.gateway.rest;

import com.grpc.proto.PessoaDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaVO {
    private Long id;
    private String nome;


}
