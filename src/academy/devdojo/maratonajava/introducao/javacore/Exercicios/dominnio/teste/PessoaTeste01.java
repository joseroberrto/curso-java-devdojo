package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.teste;

import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Aluno;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Disciplina;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Pessoa;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Professor;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa []pessoas = new Pessoa[3];
        pessoas[0] = new Professor("Raiundo ",56,Disciplina.MATEMATICA);
        pessoas[1] = new Aluno("Roberto",19,12324224);
        pessoas[2] = new Aluno("Luis",20,376476537);

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].Apresentar();
            System.out.println("------------------------------");

        }

    }
}
