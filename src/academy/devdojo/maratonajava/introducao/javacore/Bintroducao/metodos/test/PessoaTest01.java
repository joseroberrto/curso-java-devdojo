package academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        /* Alto aclopamento
        pessoa.nome = "Jiraya";
        pessoa.idade =70;
        pessoa.Imprime();
         */

        //baixo acllopamento
        pessoa.setNome("Jiraya");
        pessoa.setIdade(-12);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
