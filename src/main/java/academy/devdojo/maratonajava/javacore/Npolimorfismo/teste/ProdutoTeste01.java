package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        //super classe (classe mais generica,pai) instânciando uma sub classe(classe mais especializada,fila)
        Tomate tomate = new Tomate("tomate grande" , 10);
        Computador computador= new Computador("Acer Aspire5" , 3000);


        CalculadoraImposto.CalcularImposto(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.CalcularImposto(tomate);


    }
}
