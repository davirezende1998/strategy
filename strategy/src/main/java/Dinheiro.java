public class Dinheiro implements FormaDePagamento{
    public String confirmarPagamento(String valor){
        return "Pagamento em Dinheiro no valor de R$" + valor;
    }
}