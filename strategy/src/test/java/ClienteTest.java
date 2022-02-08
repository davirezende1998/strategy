import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void pagamentoComPix() {
        Cliente cliente = new Cliente("10.99");
        cliente.pagarComPix();
        assertEquals("Pagamento via Pix no valor de R$10.99", cliente.getConfirmacao());
    }

    @Test
    void pagamentoComBoleto() {
        Cliente cliente = new Cliente("768.43");
        cliente.pagarComBoleto();
        assertEquals("Pagamento com Boleto no valor de R$768.43", cliente.getConfirmacao());
    }

    @Test
    void pagamentoComCredito() {
        Cliente cliente = new Cliente("1000.00");
        cliente.pagarComCredito();
        assertEquals("Pagamento com Cartão de Crédito no valor de R$1000.00", cliente.getConfirmacao());
    }

    @Test
    void pagamentoComDebito() {
        Cliente cliente = new Cliente("500.00");
        cliente.pagarComDebito();
        assertEquals("Pagamento com Cartão de Débito no valor de R$500.00", cliente.getConfirmacao());
    }

    @Test
    void pagamentoComDinheiro() {
        Cliente cliente = new Cliente("15.79");
        cliente.pagarComDinheiro();
        assertEquals("Pagamento em Dinheiro no valor de R$15.79", cliente.getConfirmacao());
    }
}