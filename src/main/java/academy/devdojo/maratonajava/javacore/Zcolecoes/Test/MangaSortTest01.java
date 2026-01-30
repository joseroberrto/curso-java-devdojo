package academy.devdojo.maratonajava.javacore.Zcolecoes.Test;

import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaSortByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getPreco().compareTo(manga2.getPreco());

    }
}
public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2L,"Berserk",50D));
        mangas.add(new Manga(1L,"Drsgon ball z",40D));
        mangas.add(new Manga(3L,"Attack on titan",60D));

        System.out.println(mangas);
        Collections.sort(mangas);//necessario implements Comparable na classe Manga,pois Java usa o unico metodo da interface para o sort
        System.out.println("---------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(mangas);
        mangas.sort(new MangaSortByIdComparator());//necessario implements Comparable na classe Manga,pois Java usa o unico metodo da interface para o sort
        System.out.println("---------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
