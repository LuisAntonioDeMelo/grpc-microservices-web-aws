package com.financeiro.corporative.service;

import com.financeiro.corporative.model.Cidade;
import com.financeiro.corporative.model.Endereco;
import com.financeiro.corporative.model.Pessoa;
import com.financeiro.corporative.repository.CidadeRepository;
import com.financeiro.corporative.repository.PessoaRepository;
import com.grpc.proto.PessoaDTO;
import com.grpc.proto.PessoaResponse;
import com.grpc.proto.PessoaServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class PessoaService extends PessoaServiceGrpc.PessoaServiceImplBase {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public void atualizarPessoa(PessoaDTO request, StreamObserver<PessoaResponse> responseObserver) {

        Pessoa pessoa = pessoaRepository.getById(request.getId());
        pessoa.setNome(request.getNome());
        pessoa.setCpfCpnj(request.getRg());
        pessoa.setEmail(request.getEmail());
        pessoa.setTelefone(request.getTelefone());

        Endereco endereco = new Endereco();
        endereco.setBairro(request.getBairro());
        endereco.setCep(request.getCep());
        endereco.setNumero(request.getNumero());
        endereco.setLogradouro(request.getLogradouro());
        endereco.setComplemento(request.getComplemento());
        Cidade cidade = cidadeRepository.findCidadeByCodigo(request.getCidade());
        endereco.setCidade(cidade);
        pessoa.setEndereco(endereco);

        Pessoa pessoaUpdated = pessoaRepository.save(pessoa);
        PessoaResponse pessoaResponse = PessoaResponse.newBuilder().setPessoa(getBuild(pessoaUpdated)).build();

        responseObserver.onNext(pessoaResponse);
        responseObserver.onCompleted();
    }

    private PessoaDTO getBuild(Pessoa pessoa){
        return PessoaDTO
                .newBuilder()
                .setNome(pessoa.getNome())
                .setCpf(pessoa.getCpfCpnj())
                .setTelefone(pessoa.getTelefone())
                .setEmail(pessoa.getEmail())
                .setCep(pessoa.getEndereco().getCep())
                .setRg(pessoa.getRg())
                .setCidade(pessoa.getEndereco().getCidade().getCodigo())
                .setEstado(pessoa.getEndereco().getCidade().getEstado().getCodigo())
                .setNumero(pessoa.getEndereco().getNumero())
                .build();
    }
}
