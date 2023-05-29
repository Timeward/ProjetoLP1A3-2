public class Pedido extends Orcamento{
    // TODO: 29/05/2023 criar atributos, metodos e construtores
    private Date dataEntrega;
    private Boolean pago;
    private Date dataPagamento;
    private Enum tipoPagamento;
    private Enum situacao;

    public Pedido(Date dataEntrega, Boolean pago, Date dataPagamento, Enum tipoPagamento, Enum situacao) {
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

    public Enum getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Enum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Enum getSituacao() {
        return situacao;
    }

    public void setSituacao(Enum situacao) {
        this.situacao = situacao;
    }
}