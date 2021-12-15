package com.gf.gateway.rest.vo;

import com.grpc.proto.ClienteDTO;
import com.grpc.proto.PessoaDTO;
import lombok.Builder;
import lombok.Data;

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

    public static ClienteVO toVO(ClienteDTO dto, PessoaDTO pessoaDto) {
        return getClienteVO(dto, pessoaDto);
    }

    private static ClienteVO getClienteVO(ClienteDTO dto, PessoaDTO pessoaDto) {
        return ClienteVO
                .builder()
                .id(dto.getId())
                .idPessoa(pessoaDto.getId())
                .nome(pessoaDto.getNome())
                .dataCadastro(dto.getDataCadastro())
                // .credito(dto.getCredito())
                .limite(dto.getLimite())
                .rg(pessoaDto.getRg())
                .cidade(pessoaDto.getCidade())
                .estado(pessoaDto.getEstado())
                .complemento(pessoaDto.getComplemento())
                .email(pessoaDto.getEmail())
                .telefone(pessoaDto.getTelefone())
                .cpf(pessoaDto.getCpf())
                .bairro(pessoaDto.getBairro())
                .numero(pessoaDto.getNumero())
                .diaVencimento(dto.getDiaVencimento())
                .logradouro(pessoaDto.getLogradouro())
                .build();
    }

    public ClienteDTO buildNewProto() {
        return ClienteDTO.newBuilder()
                //.setId(id)
                .setIdPessoa(idPessoa)
                .setLimite(limite)
               // .setCredito(credito)
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
                .setCpf(cpf)
                .setRg(rg)
                .setTelefone(telefone)
                .setEstado(estado)
                .setCidade(cidade)
                .build();
    }

    public static ClienteVO toNewVO(ClienteDTO dto, PessoaDTO pessoaDto) {
        return getClienteVO(dto, pessoaDto);
    }

}
