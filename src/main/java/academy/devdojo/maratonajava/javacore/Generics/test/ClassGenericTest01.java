package academy.devdojo.maratonajava.javacore.Generics.test;

import academy.devdojo.maratonajava.javacore.Generics.domain.Carro;
import academy.devdojo.maratonajava.javacore.Generics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Generics.service.CarroRentavelService;

public class ClassGenericTest01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando caro por um mes....");
        carroRentavelService.devolvendoCarroAlugado(carro);

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();


    }
}
