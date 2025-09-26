package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.teste;

import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Animal;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Cachorro;
import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.Gato;

public class Teste01 {
    public static void main(String[] args){
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Animal [] animals = new Animal[2];
        animals[0] = gato;
        animals[1] =cachorro;

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            animals[i].Emitirsom();

        }



    }
}
