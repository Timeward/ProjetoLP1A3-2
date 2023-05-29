package com.example.projetolp1a32.classes;

import java.util.List;

public class Peca{
    // TODO: 29/05/2023 criar atributos, metodos e construtores
    private Long id;
    private String nome;
    private Double precoBase;
    private List<Medida> medidas;

    public Peca(String nome, Double precoBase, List<Medida> medidas) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.medidas = medidas;
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

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    public List<Medida> getMedidas() {
        return medidas;
    }

    public void setMedidas(List<Medida> medidas) {
        this.medidas = medidas;
    }
}