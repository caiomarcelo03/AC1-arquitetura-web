package com.example.produtoscategorias.repository;

import com.example.produtoscategorias.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
