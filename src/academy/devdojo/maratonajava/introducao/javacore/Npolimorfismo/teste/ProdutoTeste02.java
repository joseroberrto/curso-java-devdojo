package academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        //super classe (classe mais generica,pai) instânciando uma sub classe(classe mais especializada,fila)
        Produto produto= new Tomate("tomate grande" , 10);
        Produto produto2= new Computador("Acer Aspire5" , 3000);


        CalculadoraImposto.CalcularImposto(produto);
        System.out.println("----------------------------------");
        CalculadoraImposto.CalcularImposto(produto2);


    }
}
