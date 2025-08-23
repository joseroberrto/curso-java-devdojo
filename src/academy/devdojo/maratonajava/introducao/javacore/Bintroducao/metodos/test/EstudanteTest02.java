package academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Goku";
        estudante01.sexo = 'H';


        estudante02.nome = "Sakura";
        estudante02.sexo = 'M';

        estudante01.Imprime();
        estudante02.Imprime();

    }
}
