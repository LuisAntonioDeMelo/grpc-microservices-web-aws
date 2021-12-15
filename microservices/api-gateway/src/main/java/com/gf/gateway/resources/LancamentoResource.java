package com.gf.gateway.resources;

import com.gf.gateway.rest.vo.LancamentoVO;
import com.gf.gateway.services.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {

    @Autowired
    private LancamentoService lancamentoService;

    @GetMapping(value="/listar/{id}")
    public ResponseEntity<List<LancamentoVO>> findAll(@PathVariable Long id){
        return ResponseEntity.ok(lancamentoService.listarTodos(id));
    }

    @GetMapping(value = "/{codigo}")
    public LancamentoVO obterPorCodigo(@PathVariable Long codigo) {
        return lancamentoService.obterPorCodigo(codigo);
    }

    @PostMapping
    @ExceptionHandler({IllegalArgumentException.class})
    public ResponseEntity<LancamentoVO> criar(@RequestBody LancamentoVO lancamento) {
        LancamentoVO lancamentoSalvo = lancamentoService.salvarLancamento(lancamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoSalvo);
    }

}
