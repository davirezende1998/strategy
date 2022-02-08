public class Cliente {
    private String valorDaCompra;
    private String confirmacao;

    public Cliente(String valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public String getValorDaCompra() {
        return valorDaCompra;
    }

    public String getConfirmacao() {
        return confirmacao;
    }

    public void pagarComPix() {
        Venda venda = new Venda(this.valorDaCompra);
        this.confirmacao = venda.pagar(new Pix());
    }

    public void pagarComDebito() {
        Venda venda = new Venda(this.valorDaCompra);
        this.confirmacao = venda.pagar(new Debito());
    }

    public void pagarComCredito() {
        Venda venda = new Venda(this.valorDaCompra);
        this.confirmacao = venda.pagar(new Credito());
    }

    public void pagarComBoleto() {
        Venda venda = new Venda(this.valorDaCompra);
        this.confirmacao = venda.pagar(new Boleto());
    }

    public void pagarComDinheiro() {
        Venda venda = new Venda(this.valorDaCompra);
        this.confirmacao = venda.pagar(new Dinheiro());
    }
}