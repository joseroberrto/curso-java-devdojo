package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio;

public class Compra {
    public void finalizarCompra(Pagamento p,double valor){
        p.processarPagamentos(valor);
    }
}
