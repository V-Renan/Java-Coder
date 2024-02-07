package br.com.victor.exerciciossb.controllers;

import br.com.victor.exerciciossb.model.entities.Produto;
import br.com.victor.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

//    @PostMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto salvaProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }
    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }
    @GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
    public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
        if (qtdePagina >= 5) qtdePagina = 5;
        Pageable page = PageRequest.of(numeroPagina, qtdePagina);
        return produtoRepository.findAll(page);
    }
    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
         return produtoRepository.findById(id);
    }
//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto)  {
//        produtoRepository.save(produto);
//        return produto;
//    }
    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }

}
