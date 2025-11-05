package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public  class  CalculadoraImposto {


    public static void CalcularImposto (Produto produto){
        System.out.println("Relatorio de Imposto: ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Preço: " +produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);

        //tomate ira fazer referencia para o mesmo objeto
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataVakidade());
        }

    }


}
