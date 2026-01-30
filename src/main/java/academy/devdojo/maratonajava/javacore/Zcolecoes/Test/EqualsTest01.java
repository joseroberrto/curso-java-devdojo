package academy.devdojo.maratonajava.javacore.Zcolecoes.Test;

import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Smartphone;

public class EqualsTest01 {


    public static void main(String[] args) {

        Smartphone smartphone01 = new Smartphone("1234","Iphone");
        Smartphone smartphone02 = new Smartphone("1234","Iphone");

        System.out.println(smartphone01.equals(smartphone02));

        System.out.println();
    }
}
