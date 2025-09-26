package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio;

public class Aluno extends Pessoa{
    private int matrcula;

    public Aluno(String nome, int idade , int matrcula) {
        super(nome, idade);
        this.matrcula = matrcula;
    }

    @Override
    public void Apresentar() {
        System.out.println("Aluno: "+getNome());
        System.out.println("Matricula: "+getMatrcula());

    }

    public int getMatrcula() {
        return matrcula;
    }
}
