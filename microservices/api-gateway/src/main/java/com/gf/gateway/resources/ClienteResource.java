package com.gf.gateway.resources;

import com.gf.gateway.rest.ClienteVO;
import com.gf.gateway.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{codigo}")
    public ClienteVO obterPorCodigo(@PathVariable Long codigo) {
        return clienteService.obterPorCodigo(codigo);
    }


    @PostMapping("/salvar")
    @ExceptionHandler({IllegalArgumentException.class})
    public ResponseEntity<ClienteVO> criar(@RequestBody ClienteVO cliente) {
        ClienteVO clienteVO = clienteService.salvarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteVO);
    }


}
