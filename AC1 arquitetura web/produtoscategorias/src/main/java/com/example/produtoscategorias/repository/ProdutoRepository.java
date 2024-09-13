package com.example.produtoscategorias.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.produtoscategorias.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional findById(Long id);

    List<Produto> findAll();

    Produto save(Produto produto);}
