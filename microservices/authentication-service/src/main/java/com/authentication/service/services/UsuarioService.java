package com.authentication.service.services;

import com.authentication.service.model.Pessoa;
import com.authentication.service.model.Usuario;
import com.authentication.service.model.dto.UsuarioDTO;
import com.authentication.service.model.dto.UsuarioRestDTO;
import com.authentication.service.repository.Pessoas;
import com.authentication.service.repository.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private Usuarios usuarios;

    @Autowired
    private Pessoas pessoas;

    public Usuario salvarUsuario(Usuario usuario) {
        String enconde = new BCryptPasswordEncoder().encode(usuario.getSenha());
        usuario.setSenha(enconde);
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(usuario.getNome());
        pessoa.setEmail(usuario.getEmail());
        pessoa.setAtivo(usuario.isAtivo());
        pessoa = pessoas.save(pessoa);
        usuario.setPessoa(pessoa);
        Usuario usuarioSaved = usuarios.save(usuario);
        return usuarioSaved;
    }

    public UsuarioRestDTO logar(UsuarioDTO dto) {
        UsuarioRestDTO usuarioRestDTO = usuarios.obterUser(dto.getUsername());
        if(usuarioRestDTO != null){

            BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder();
            if (cryptPasswordEncoder.matches(dto.getPassword(),usuarioRestDTO.getSenha())) {
//            userDetailsService.loadUserByUsername(dto.getUsername());
                return usuarioRestDTO;
            }
        }
        return null;
    }
}
