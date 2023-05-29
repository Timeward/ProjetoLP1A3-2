package com.example.projetolp1a32.classes;

public class Tecido{
    // TODO: 29/05/2023 criar atributos, metodos e construtores
    private Long id;
    private String nome;
    private Double preco;

    public Tecido(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}