package academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    private final static double TAXA_PORCENTO = 0.06;
    private String dataVakidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando taxa sobre tomate");
        return this.valor * TAXA_PORCENTO ;
    }

    public String getDataVakidade() {
        return dataVakidade;
    }

    public void setDataVakidade(String dataVakidade) {
        this.dataVakidade = dataVakidade;
    }
}
