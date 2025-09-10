package academy.devdojo.maratonajava.introducao.javacore.Hheranca.Teste;

import academy.devdojo.maratonajava.introducao.javacore.Hheranca.Dominio.Endereço;
import academy.devdojo.maratonajava.introducao.javacore.Hheranca.Dominio.Funcionario;
import academy.devdojo.maratonajava.introducao.javacore.Hheranca.Dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Roberto");
        Endereço endereco = new Endereço();
        Funcionario funcionario = new Funcionario("Miguel");

        endereco.setRua("Rua W");
        endereco.setCep("111111111");


        pessoa.setCpf("12332424");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("--------------------------------");
        funcionario.setCpf("2327637215165");

        funcionario.setSalario(1200);
        funcionario.setEndereco(endereco);
        funcionario.imprime();



    }
}
