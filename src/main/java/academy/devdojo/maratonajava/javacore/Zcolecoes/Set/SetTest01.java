package academy.devdojo.maratonajava.javacore.Zcolecoes.Set;

import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        //uma java.util.Set é uma coleção que se destaca por garantir a exclusividade dos elementos em um conjunto
        //só pode haver um elemento de mesmo valor ou referecia

        /*
            Classes que implementam Conjutos
            HashSet - uma coleçao exclusiva com alto desenpenho
            LinkedSet - uma coleção exclusiva e ordenada pela inserção

         */
        Set<Manga>mangas = new HashSet<>();//leva me cosideração o hashCode de cada elemento
        mangas.add(new Manga(2L,"Berserk",50D));
        mangas.add(new Manga(1L,"Drsgon ball z",40D));
        mangas.add(new Manga(3L,"Attack on titan",60D));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
