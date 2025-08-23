package academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio;

public class ImpressoraFuncionario {
    public void Impreme(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);

        if (funcionario.salario != null) {
            for (int i = 0; i < funcionario.salario.length; i++) {
                System.out.println("Salario R$" + funcionario.salario[i]);
            }
        }
    }
}
