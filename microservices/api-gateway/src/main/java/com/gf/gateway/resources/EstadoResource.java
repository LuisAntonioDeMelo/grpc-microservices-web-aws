package com.gf.gateway.resources;


import com.gf.gateway.rest.vo.EstadoVO;
import com.gf.gateway.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoResource {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<EstadoVO> findAll(){
        return estadoService.obterEstados();
    }
}
