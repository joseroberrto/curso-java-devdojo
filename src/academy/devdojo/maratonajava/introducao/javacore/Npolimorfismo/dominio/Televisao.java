package academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto {
    private final static double TAXA_PORCENTO = 0.25;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * TAXA_PORCENTO;
    }
}
