package com.example.projetolp1a32.classes;

import java.util.Date;
import java.util.List;

public class Orcamento{
    // TODO: 29/05/2023 criar atributos, metodos e construtores
    private Long id;
    private Usuario usuario;
    private Cliente cliente;
    private Date dataCriacao;
    private List<ItemPedido> itensPedido;
    private Double valorTotal;
    private String observacoes;

    public Orcamento() {
    }

    public Orcamento(Usuario usuario, Cliente cliente, Date dataCriacao, List<ItemPedido> itensPedido, Double valorTotal, String observacoes){
        this.usuario = usuario;
        this.cliente = cliente;
        this.dataCriacao = dataCriacao;
        this.itensPedido = itensPedido;
        this.valorTotal = valorTotal;
        this.observacoes = observacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}