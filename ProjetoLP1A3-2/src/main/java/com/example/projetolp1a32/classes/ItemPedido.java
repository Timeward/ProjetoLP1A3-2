package com.example.projetolp1a32.classes;

import java.util.List;

public class ItemPedido{
    // TODO: 29/05/2023 criar atributos, metodos e construtores
    private Long id;
    private Peca peca;
    private Tamanho tamanho;
    private Modelo modelo;
    private Tecido tecido;
    private List<Adicional> adicionais;
    private Double valorItem;

    public ItemPedido(Peca peca, Tamanho tamanho, Modelo modelo, Tecido tecido, List<Adicional> adicionais, Double valorItem){
        this.peca = peca;
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.tecido = tecido;
        this.adicionais = adicionais;
        this.valorItem = valorItem;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Tecido getTecido() {
        return tecido;
    }

    public void setTecido(Tecido tecido) {
        this.tecido = tecido;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(List<Adicional> adicionais) {
        this.adicionais = adicionais;
    }

    public Double getValorItem() {
        return valorItem;
    }

    public void setValorItem(Double valorItem) {
        this.valorItem = valorItem;
    }
}