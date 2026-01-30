package academy.devdojo.maratonajava.javacore.Exercicios.dominnio.dominio;

public class CartaoCredito implements Pagamento{
    @Override
    public void processarPagamentos(double valor) {
        System.out.println("Pagamento de "+valor + "realizado via cartao de credito");
    }
}
