package com.financeiro.corporative.service;

import com.financeiro.corporative.model.Cidade;
import com.financeiro.corporative.model.Endereco;
import com.financeiro.corporative.model.Pessoa;
import com.financeiro.corporative.repository.CidadeRepository;
import com.financeiro.corporative.repository.PessoaRepository;
import com.grpc.proto.PessoaDTO;
import com.grpc.proto.PessoaRequest;
import com.grpc.proto.PessoaResponse;
import com.grpc.proto.PessoaServiceGrpc;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
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
    public void obterPorId(PessoaRequest request, StreamObserver<PessoaResponse> responseObserver) {
        Pessoa pessoa = pessoaRepository.obterPorId(request.getCodigo());
        if(pessoa != null){
            responseObserver.onNext(PessoaResponse.newBuilder().setPessoa(getBuild(pessoa)).build());
            responseObserver.onCompleted();
        }

    }

    @Override
    public void atualizarPessoa(PessoaDTO request, StreamObserver<PessoaResponse> responseObserver) {

        Pessoa pessoa = pessoaRepository.obterPorId(request.getId());
        if(pessoa != null){
            pessoa.setNome(request.getNome());
            pessoa.setCpfCpnj(request.getRg());
            pessoa.setEmail(request.getEmail());
            pessoa.setTelefone(request.getTelefone());
            pessoa.setRg(request.getRg());
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
        else {
            throw new StatusRuntimeException(
                    Status.ABORTED.withDescription("Não foi possivel atualizar Pessoa" ));
        }

    }

    private PessoaDTO getBuild(Pessoa pessoa){
        return PessoaDTO
                .newBuilder()
                .setId(pessoa.getId())
                .setNome(pessoa.getNome())
                .setCpf(pessoa.getCpfCpnj())
                .setTelefone(pessoa.getTelefone())
                .setEmail(pessoa.getEmail())
                .setCep(pessoa.getEndereco().getCep())
                .setLogradouro(pessoa.getEndereco().getLogradouro())
                .setComplemento(pessoa.getEndereco().getComplemento())
                .setRg(pessoa.getRg())
                .setCidade(pessoa.getEndereco().getCidade().getCodigo())
                .setEstado(pessoa.getEndereco().getCidade().getEstado().getCodigo())
                .setNumero(pessoa.getEndereco().getNumero())
                .setAtivo(pessoa.getAtivo())
                .build();
    }
}
