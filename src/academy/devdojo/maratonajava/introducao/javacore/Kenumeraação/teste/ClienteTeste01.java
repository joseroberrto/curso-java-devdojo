package academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.teste;

import academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio.Cliente;
import academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio.TipoPagamento;
import academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio.TipoPessoa;

public class ClienteTeste01 {
    public static void main(String[] args) {
       Cliente cliente01 = new Cliente("Roberta" , TipoPessoa.PESSOA_FISICA ,TipoPagamento.CARTAOD_DEBITO);
       Cliente cliente02 = new Cliente("Roberto" , TipoPessoa.PESSOA_JURITICA, TipoPagamento.CARTAO_CREDITO);
       Cliente cliente03 = new Cliente("Thiago" , TipoPessoa.PESSOA_FISICA,TipoPagamento.CARTAO_CREDITO);
       Cliente cliente04 = new Cliente("Icaro" , TipoPessoa.PESSOA_FISICA , TipoPagamento.CARTAO_CREDITO);
       Cliente cliente05= new Cliente("Luis" , TipoPessoa.PESSOA_FISICA,TipoPagamento.CARTAOD_DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);


        System.out.println(cliente05);
        System.out.println(TipoPagamento.CARTAO_CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CARTAOD_DEBITO.calcularDesconto(100));


    }
}
