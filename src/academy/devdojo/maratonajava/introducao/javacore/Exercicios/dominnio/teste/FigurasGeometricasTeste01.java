package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.teste;

import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Circulo;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.FormaGeometrica;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Retangulo;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.TipoForma;

public class FigurasGeometricasTeste01 {
    public static void main(String[] args) {
        TipoForma tipo = TipoForma.RETANGULO;
        FormaGeometrica forma;

        if(tipo == TipoForma.RETANGULO){
            forma =new Retangulo(46,6.7);
        }else {
            forma = new Circulo(6);
        }

        System.out.println("A area : " + forma.calcularArea());
        System.out.println("O perimetro : " + forma.calcularPerimetro());

    }
}
