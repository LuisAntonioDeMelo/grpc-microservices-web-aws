package com.authentication.service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRestDTO {

    private Long id;
    private Long idPessoa;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private Boolean ativo;

}
