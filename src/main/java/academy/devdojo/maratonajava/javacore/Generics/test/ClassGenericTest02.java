package academy.devdojo.maratonajava.javacore.Generics.test;

import academy.devdojo.maratonajava.javacore.Generics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Generics.domain.Carro;
import academy.devdojo.maratonajava.javacore.Generics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Generics.service.CarroRentavelService;
import academy.devdojo.maratonajava.javacore.Generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponivris= new ArrayList<>(List.of(new Carro("BMW") , new Carro("Mercedes")));
        List<Barco> barcosDisponivris= new ArrayList<>(List.of(new Barco("Lancha") , new Barco("Canoa")));

        RentalService<Carro>rentalService = new RentalService<>(carrosDisponivris);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando caro por um mes....");
        rentalService.devolvendoObjetolugado(carro);

        System.out.println("---------------------");
        RentalService<Barco>rentalServiceBarco = new RentalService<>(barcosDisponivris);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando Barco por um mes....");
        rentalServiceBarco.devolvendoObjetolugado(barco);


    }
}
