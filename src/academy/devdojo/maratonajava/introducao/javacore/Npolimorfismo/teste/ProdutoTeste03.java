package academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.dominio.Tomate
        ;
import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        //super classe (classe mais generica,pai) instânciando uma sub classe(classe mais especializada,fila)
        Tomate tomate= new Tomate("tomate grande" , 10);
        Produto produto= new Computador("Acer Aspire5" , 3000);
        tomate.setDataVakidade("11/12/2025");

        CalculadoraImposto.CalcularImposto(tomate);
        System.out.println("----------------------------------");
        CalculadoraImposto.CalcularImposto(produto);
    }
}
