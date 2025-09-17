package academy.devdojo.maratonajava.introducao.javacore.Minterfaces.dominio;

public class Pix implements MetodoPagamento{
    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento de R$ "+ valor + " feito via PIX");
    }
}
