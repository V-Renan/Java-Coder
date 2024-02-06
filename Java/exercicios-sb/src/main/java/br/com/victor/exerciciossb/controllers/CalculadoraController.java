package br.com.victor.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * @author Victor$
 * @date 06/02/2024$
 * Description:
 */
@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    @GetMapping(path = "/somar/{a}/{b}")
    public int somar(@PathVariable(name = "a") int a, @PathVariable(name = "b") int b) {
        return a + b;
    }
    @GetMapping(path = "/subtrair")
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        return a - b;
    }

}
