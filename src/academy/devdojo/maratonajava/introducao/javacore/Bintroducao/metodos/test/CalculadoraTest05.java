package academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[]numeros = {3,45, 4, 4, 6, 7};

        calculadora.somaArrays(numeros);
        calculadora.somaVarsArgs(3,45, 4, 4, 6, 7);

    }
}
