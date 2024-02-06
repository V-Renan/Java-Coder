package br.com.victor.exerciciossb.controllers;

import br.com.victor.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Victor$
 * @date 05/02/2024$
 * Description:
 */
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28,"Pedro", "123,456,789-00");
    }
}
