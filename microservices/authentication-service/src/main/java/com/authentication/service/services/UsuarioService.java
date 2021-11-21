package com.authentication.service.services;

import com.authentication.service.model.Pessoa;
import com.authentication.service.model.Usuario;
import com.authentication.service.model.dto.UsuarioDTO;
import com.authentication.service.repository.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private Usuarios usuarios;

//    @Autowired
//    private AuthUserDetailsService userDetailsService;


    public Usuario salvarUsuario(Usuario usuario) {
        String enconde = new BCryptPasswordEncoder().encode(usuario.getSenha());
        usuario.setSenha(enconde);
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(usuario.getNome());
        usuario.setPessoa(pessoa);
        Usuario usuarioSaved = usuarios.save(usuario);
        return usuarioSaved;
    }

    public Usuario logar(UsuarioDTO dto) {
        Usuario usuario = usuarios.findByLogin(dto.getUsername());
        if(usuario != null){

            BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder();
            if (cryptPasswordEncoder.matches(dto.getPassword(),usuario.getSenha())) {
//            userDetailsService.loadUserByUsername(dto.getUsername());
                return usuario;
            }
        }
        return null;
    }
}
