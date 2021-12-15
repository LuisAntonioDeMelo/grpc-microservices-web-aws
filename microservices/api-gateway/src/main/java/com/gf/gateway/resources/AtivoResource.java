package com.gf.gateway.resources;

import com.gf.gateway.rest.vo.AtivoVO;
import com.gf.gateway.services.AtivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ativos")
public class AtivoResource {

    @Autowired
    private AtivoService ativoService;

    @GetMapping("listar/{id}")
    public List<AtivoVO> findAll(@PathVariable Long id){
        return ativoService.findAll(id);
    }

    @PostMapping
    public ResponseEntity<AtivoVO> adicionarAtivo(@RequestBody AtivoVO ativoVO){
        AtivoVO vo = ativoService.adicionarAtivo(ativoVO);
        return ResponseEntity.ok(vo);
    }

}
