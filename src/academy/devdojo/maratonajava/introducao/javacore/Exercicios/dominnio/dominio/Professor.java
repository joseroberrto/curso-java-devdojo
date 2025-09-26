package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio;

public class Professor extends Pessoa{
    Disciplina disciplina;
    @Override
    public void Apresentar() {
        System.out.println("Professor: "+getNome());
        System.out.println("Disciplina: "+disciplina);

    }

    public Professor(String nome, int idade , Disciplina disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
}
