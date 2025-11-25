package academy.devdojo.maratonajava.javacore.Generics.service;

import academy.devdojo.maratonajava.javacore.Generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponivris= new ArrayList<>(List.of(new Carro("BMW") , new Carro("Mercedes")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carros disponiveis");
        Carro c = carrosDisponivris.remove(0);
        System.out.println("Alugando carro :"+ c);
        System.out.println("Carros disponiveis: ");
        System.out.println(carrosDisponivris);
        return c;
    }

    public void devolvendoCarroAlugado(Carro carro){
        System.out.println("DEvolvendo carro: "+carro);
        carrosDisponivris.add(carro);
        System.out.println("Carros disponiveis: ");
        System.out.println(carrosDisponivris);


    }
}
