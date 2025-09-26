package academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    private final static double TAXA_PORCENTO = 0.25;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando taxa sobre computador");
        return this.valor * TAXA_PORCENTO ;
    }
}
