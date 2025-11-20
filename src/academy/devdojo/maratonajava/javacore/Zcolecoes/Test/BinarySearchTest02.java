package academy.devdojo.maratonajava.javacore.Zcolecoes.Test;

import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2L,"Berserk",50D));
        mangas.add(new Manga(1L,"Drsgon ball z",40D));
        mangas.add(new Manga(3L,"Attack on titan",60D));


        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaBinarySearc = new Manga(1L,"Drsgon ball z",40D);
        System.out.println(Collections.binarySearch(mangas,mangaBinarySearc));



    }
}
