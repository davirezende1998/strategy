public class Venda {
    private String valor;

    public Venda(String valor){
        this.valor = valor;
    }

    public String pagar(FormaDePagamento formaDePagamento) {
        return formaDePagamento.confirmarPagamento(valor);
    }
}