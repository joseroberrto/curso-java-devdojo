package academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.teste;

import academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio.Cliente;
import academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio.TipoPessoa;

public class ClienteTeste01 {
    public static void main(String[] args) {
       Cliente cliente01 = new Cliente("Roberta" , TipoPessoa.PESSOA_FISICA);
       Cliente cliente02 = new Cliente("Roberto" , TipoPessoa.PESSOA_JURITICA);
       Cliente cliente03 = new Cliente("Thiago" , TipoPessoa.PESSOA_FISICA);
       Cliente cliente04 = new Cliente("Icaro" , TipoPessoa.PESSOA_FISICA);
       Cliente cliente05= new Cliente("Luis" , TipoPessoa.PESSOA_FISICA);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);
        System.out.println(cliente05);


    }
}
