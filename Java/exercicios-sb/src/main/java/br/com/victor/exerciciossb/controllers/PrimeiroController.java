package br.com.victor.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * @author Victor$
 * @date 02/02/2024$
 * Description:
 */
@RestController
public class PrimeiroController {
    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola() {
        return "Hello, Spring Boot!";
    }
}
