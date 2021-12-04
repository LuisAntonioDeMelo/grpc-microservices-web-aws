package com.gf.gateway.rest;

import com.grpc.proto.ClienteDTO;
import com.grpc.proto.PessoaDTO;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private String complemento;
    private String bairro;
    private String cep;
    private String email;
    private String telefone;
    private String cpf;
    private String rg;
    private String logradouro;
    private String numero;
    private Long cidade;
    private Long estado;


    public static List<ClienteVO> toList(List<ClienteDTO> clientesList) {
        List<ClienteVO> clienteVOS = new ArrayList<>();
        clientesList.stream().forEach(c -> {
            clienteVOS.add(toVO(c));
        });
        return clienteVOS;
    }

    public ClienteDTO buildProto() {
        return ClienteDTO.newBuilder()
                .setId(id)
                .setIdPessoa(idPessoa)
                .setLimite(limite)
                .setCredito(credito)
                .setDiaVencimento(diaVencimento)
                .build();
    }

    public PessoaDTO buildPessoaDTO(){
        return PessoaDTO.newBuilder()
                .setId(idPessoa)
                .setNome(nome)
                .setCep(cep)
                .setBairro(bairro)
                .setLogradouro(logradouro)
                .setComplemento(complemento)
                .setEmail(email)
                .setNumero(numero)
                .setEstado(estado)
                .setCpf(cpf)
                .setCidade(cidade)
                .setRg(rg)
                .setTelefone(telefone)
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
