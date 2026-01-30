package academy.devdojo.maratonajava.javacore.ZZHdesignPatters.teste;

import academy.devdojo.maratonajava.javacore.ZZHdesignPatters.dominio.Person;

public class BuiderPatterTest01 {
    public static void main(String[] args) {

        new Person.PersonBuider()
                .firstName("José")
                .lastName("Roberto")
                .email("jose@gmail.com")
                .userName("jajaj")
                .buider();

    }
}
