package academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.CartaoCredito;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Pix;

public class MetodoPagamentoTeste01 {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito();
        Pix pix = new Pix();

        cartaoCredito.pagamento(100);
        pix.pagamento(1200);
    }
}
