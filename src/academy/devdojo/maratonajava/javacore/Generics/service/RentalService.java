package academy.devdojo.maratonajava.javacore.Generics.service;

import academy.devdojo.maratonajava.javacore.Generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService <T>{
    List<T>objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objetos disponiveis");
        T objeto= objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto :"+ objeto);
        System.out.println("Carros disponiveis: ");
        System.out.println(objetosDisponiveis);
        return objeto;
    }

    public void devolvendoObjetolugado(T t){
        System.out.println("DEvolvendo objeto: "+t);
        objetosDisponiveis.add(t);
        System.out.println("Objeto disponiveis: ");
        System.out.println(objetosDisponiveis);


    }
}
