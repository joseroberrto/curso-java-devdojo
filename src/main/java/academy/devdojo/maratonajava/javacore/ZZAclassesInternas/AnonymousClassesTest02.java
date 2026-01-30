package academy.devdojo.maratonajava.javacore.ZZAclassesInternas;

import academy.devdojo.maratonajava.javacore.Generics.domain.Barco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("canoa")));
        barcoList.sort(new Comparator<Barco>(){
            @Override
            public int compare(Barco barco, Barco t1) {
                return barco.getNome().compareTo(t1.getNome());
            }
        });

        System.out.println(barcoList);
    }
}
