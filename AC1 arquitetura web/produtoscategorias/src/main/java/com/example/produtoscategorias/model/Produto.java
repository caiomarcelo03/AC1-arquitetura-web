package com.example.produtoscategorias.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produto;

    private String prod_nome;
    private int prod_qtd;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Produto(Long id_produto, String prod_nome, int prod_qtd, Categoria categoria) {
        this.id_produto = id_produto;
        this.prod_nome = prod_nome;
        this.prod_qtd = prod_qtd;
        this.categoria = categoria;
    }

    public Produto() {
    }

    // Getters e Setters
    public Long getId_produto() {
        return id_produto;
    }

    public void setId_produto(Long id_produto) {
        this.id_produto = id_produto;
    }

    public String getProd_nome() {
        return prod_nome;
    }

    public void setProd_nome(String prod_nome) {
        this.prod_nome = prod_nome;
    }

    public int getProd_qtd() {
        return prod_qtd;
    }

    public void setProd_qtd(int prod_qtd) {
        this.prod_qtd = prod_qtd;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
