package com.gf.gateway.resources;

import com.gf.gateway.rest.vo.CidadeVO;
import com.gf.gateway.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<CidadeVO> findAll(){
        return cidadeService.obterCidades();
    }
}
