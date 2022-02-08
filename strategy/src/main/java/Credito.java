public class Credito implements FormaDePagamento{
    public String confirmarPagamento(String valor){
        return "Pagamento com Cartão de Crédito no valor de R$" + valor;
    }
}