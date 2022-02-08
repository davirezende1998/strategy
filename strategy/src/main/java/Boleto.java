public class Boleto implements FormaDePagamento{
    public String confirmarPagamento(String valor){
        return "Pagamento com Boleto no valor de R$" + valor;
    }
}