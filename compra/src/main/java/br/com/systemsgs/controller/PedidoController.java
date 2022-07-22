package br.com.systemsgs.controller;

import br.com.systemsgs.model.ModelPedido;
import br.com.systemsgs.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/pedido")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PedidoController {

    private final PedidoService service;

    @PostMapping
    public ResponseEntity<ModelPedido> salvar(@RequestBody @Valid ModelPedido modelPedido){
        return ResponseEntity.ok(service.salvar(modelPedido));
    }

}
