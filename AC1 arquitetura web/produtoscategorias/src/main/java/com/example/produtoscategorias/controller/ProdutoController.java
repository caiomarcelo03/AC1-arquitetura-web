package com.example.produtoscategorias.controller;

import com.example.produtoscategorias.model.Produto; // Importação da classe Produto
import com.example.produtoscategorias.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    // Injeção de dependência via construtor
    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll(); // findAll corrigido
    }

    @GetMapping("/{id}")
    public Produto getProdutoById(@PathVariable Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null); // Tratamento correto de Optional
    }

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
