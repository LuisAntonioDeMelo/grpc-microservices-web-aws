package com.gf.gateway.resources;

import com.gf.gateway.rest.vo.CategoriaVO;
import com.gf.gateway.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
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
