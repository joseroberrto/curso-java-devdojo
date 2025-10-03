package academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeption.dominio;

import java.sql.SQLException;

public class Funcionario extends Pessoa{

    /*
    Na sobrescrita do metodo posso declarar as excecoes ou não.
    Se declara as excecoes egue as regras:
    1-Declara 1 ou todas as exercoes
    2-Declarar uma excecao  de outro tipo
    3-Declarar outra excecao do tipo unchecked
    4-Nao pode declarar uma excecao checkend que a superclasse nao tem    */
    @Override
    public void salvar()  {
        System.out.println("Salvando funcionario");
    }
}
