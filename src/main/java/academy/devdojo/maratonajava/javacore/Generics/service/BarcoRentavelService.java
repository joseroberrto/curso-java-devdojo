package academy.devdojo.maratonajava.javacore.Generics.service;

import academy.devdojo.maratonajava.javacore.Generics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponivris= new ArrayList<>(List.of(new Barco("Lancha") , new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barcos disponiveis");
        Barco c = barcosDisponivris.remove(0);

        System.out.println("Alugando barco :"+ c);
        System.out.println("Barcos disponiveis: ");
        System.out.println(barcosDisponivris);
        return c;
    }

    public void devolvendoBarcoAlugado(Barco barco){
        System.out.println("DEvolvendo barco: "+barco);
        barcosDisponivris.add(barco);
        System.out.println("barcos disponiveis: ");
        System.out.println(barcosDisponivris);


    }
}
