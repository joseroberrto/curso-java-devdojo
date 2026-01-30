package academy.devdojo.maratonajava.javacore.ZZHdesignPatters.teste;

import academy.devdojo.maratonajava.javacore.ZZHdesignPatters.dominio.AirCraft;

public class AirCraftTest01 {
    public static void main(String[] args) {

        bookSeats("1A");
        bookSeats("1A");
    }

    private static void bookSeats(String seat){
        AirCraft airCraft = new AirCraft("222");
        System.out.println(airCraft.bookSeat(seat));

    }
}
