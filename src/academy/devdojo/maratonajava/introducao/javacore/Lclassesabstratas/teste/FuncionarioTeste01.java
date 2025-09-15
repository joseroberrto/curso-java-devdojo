package academy.devdojo.maratonajava.introducao.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.introducao.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.introducao.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.introducao.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami" , 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Frank" , 5000);


        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
