package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.teste;

import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Cargo;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.FuncioarioHorista;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Funcionario;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.FuncionarioAsalariado;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario[]funcionarios = new Funcionario[2];
        funcionarios[0] = new FuncionarioAsalariado("joaquim",Cargo.ASSALARIADO,1500);
        funcionarios[1] = new FuncioarioHorista("Marcos",Cargo.HORISTA,1000);

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Nome:" + funcionarios[i].getNome());
            System.out.println("Salario base:"+funcionarios[i].getSalarioBase());
            System.out.println("Bonus: "+funcionarios[i].calcularBonus());
            System.out.println("------------------------------------------------");

        }


    }
}
