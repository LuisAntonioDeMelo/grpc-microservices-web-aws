package com.gf.gateway.resources;

import com.gf.gateway.rest.CategoriaVO;
import com.gf.gateway.rest.LancamentoVO;
import com.gf.gateway.services.CategoriaService;
import com.gf.gateway.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {


    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    @ExceptionHandler({IllegalArgumentException.class})
    public ResponseEntity<List<CategoriaVO>> findAll() {
        return ResponseEntity.ok(categoriaService.findAll());
    }
}
