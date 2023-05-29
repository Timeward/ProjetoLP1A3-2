package com.example.projetolp1a32.classes;

import java.util.Date;

public class Pedido extends Orcamento{
    // TODO: 29/05/2023 criar atributos, metodos e construtores
    private Date dataEntrega;
    private Boolean pago;
    private Date dataPagamento;
    private TipoPagamento tipoPagamento;
    private Situacao situacao;

    public Pedido(Date dataEntrega, Boolean pago, Date dataPagamento, TipoPagamento tipoPagamento, Situacao situacao) {
//        super(usuario, cliente, dataCriacao, itensPedido, valorTotal, observacoes);
        this.dataEntrega = dataEntrega;
        this.pago = pago;
        this.dataPagamento = dataPagamento;
        this.tipoPagamento = tipoPagamento;
        this.situacao = situacao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
}