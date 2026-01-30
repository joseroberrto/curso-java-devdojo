package academy.devdojo.maratonajava.javacore.Exercicios.dominnio.dominio;

public class Compra {
    public void finalizarCompra(Pagamento p,double valor){
        p.processarPagamentos(valor);
    }
}
