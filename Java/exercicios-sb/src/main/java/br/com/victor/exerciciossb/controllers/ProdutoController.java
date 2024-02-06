package br.com.victor.exerciciossb.controllers;

import br.com.victor.exerciciossb.model.entities.Produto;
import br.com.victor.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Victor$
 * @date 06/02/2024$
 * Description:
 */
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @PostMapping
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
         return produtoRepository.findById(id);
    }
}
