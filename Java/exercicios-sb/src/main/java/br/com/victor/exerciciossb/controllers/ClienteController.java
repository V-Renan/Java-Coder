package br.com.victor.exerciciossb.controllers;

import br.com.victor.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }
    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Victor", "111.222.333-44");
    }
}
