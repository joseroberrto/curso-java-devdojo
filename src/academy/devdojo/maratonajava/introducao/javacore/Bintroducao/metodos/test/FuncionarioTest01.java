package academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio.CalculadoraFuncionario;
import academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio.Funcionario;
import academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio.ImpressoraFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImpressoraFuncionario impreme = new ImpressoraFuncionario();
        CalculadoraFuncionario calcula = new CalculadoraFuncionario();

        funcionario.nome = "Roberto";
        funcionario.idade=19;
        funcionario.salario= new double[]{1200 , 2000 , 2400};

        impreme.Impreme(funcionario);

        calcula.CalculaMedia(funcionario.salario);





    }
}
