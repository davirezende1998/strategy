public class Pix implements FormaDePagamento{
    public String confirmarPagamento(String valor){
        return "Pagamento via Pix no valor de R$" + valor;
    }
}