package com.authentication.service.controller;

import com.authentication.service.model.Usuario;
import com.authentication.service.model.dto.UsuarioDTO;
import com.authentication.service.repository.Usuarios;
import com.authentication.service.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private Usuarios usuarios;

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> getAll() {
        return usuarios.findAll();
    }

    @GetMapping(value = "/{id}")
    public Usuario obterPorCodigo(@PathVariable Long id) {
        return usuarios.getById(id);
    }

    //login ..... melhor para auth gateway dps
    @PostMapping("/auth")
    public ResponseEntity<Usuario> logar(@RequestBody UsuarioDTO dto) {
        Usuario usuario = service.logar(dto);
        return usuario != null ? ResponseEntity.ok(usuario) : ResponseEntity.notFound().build();
    }

    @PostMapping("/register")
    @ExceptionHandler({IllegalArgumentException.class})
    public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario) {
        Usuario usuarioSaved = service.salvarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSaved);
    }


}
