package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        ImprimeEstudante imprime = new ImprimeEstudante();
        Estudante estudante = new Estudante();
        estudante.idade = 24;

        imprime.imprime(estudante);




    }

}
