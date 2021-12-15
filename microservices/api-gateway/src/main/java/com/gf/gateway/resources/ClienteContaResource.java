package com.gf.gateway.resources;

import com.gf.gateway.rest.vo.ContaClienteVO;
import com.gf.gateway.services.ClienteContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta-cliente")
public class ClienteContaResource {

    @Autowired
    private ClienteContaService clienteContaService;

    @GetMapping(value = "listar/{codigo}")
    public List<ContaClienteVO> findAll(@PathVariable Long codigo){
        return clienteContaService.obterContas(codigo);
    }

    @GetMapping(value = "/{codigo}")
    public ContaClienteVO obterPorCodigo(@PathVariable Long codigo) {
        return  clienteContaService.obterPorCodigo(codigo);
    }


    @PostMapping("/salvar")
    @ExceptionHandler({IllegalArgumentException.class})
    public ResponseEntity<ContaClienteVO> criar(@RequestBody ContaClienteVO contaClienteVO) {
        ContaClienteVO ccVO = clienteContaService.salvarCliente(contaClienteVO);
        return ResponseEntity.status(HttpStatus.CREATED).body(ccVO);
    }

}
