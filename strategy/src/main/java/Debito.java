public class Debito implements FormaDePagamento{
    public String confirmarPagamento(String valor){
        return "Pagamento com Cartão de Débito no valor de R$" + valor;
    }
}