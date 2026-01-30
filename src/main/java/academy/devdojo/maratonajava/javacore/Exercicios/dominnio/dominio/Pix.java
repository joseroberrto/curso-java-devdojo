package academy.devdojo.maratonajava.javacore.Exercicios.dominnio.dominio;

public class Pix implements Pagamento{
    @Override
    public void processarPagamentos(double valor) {
        System.out.println("Pagamento de "+valor + "realizado via pix");
    }
}
