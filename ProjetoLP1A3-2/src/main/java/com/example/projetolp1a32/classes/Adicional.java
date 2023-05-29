package com.example.projetolp1a32.classes;

public class Adicional{
    // TODO: 29/05/2023 criar atributos, metodos e construtores
    private Long id;
    private String nome;
    private Double multiplicador;

    public Adicional(String nome, Double multiplicador) {
        this.nome = nome;
        this.multiplicador = multiplicador;
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

    public Double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(Double multiplicador) {
        this.multiplicador = multiplicador;
    }
}