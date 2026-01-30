package academy.devdojo.maratonajava.javacore.Zcolecoes.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Drsgon ball z");
        mangas.add("Berserk");
        mangas.add("Attack on titan");

        System.out.println(mangas);
        Collections.sort(mangas);
        System.out.println(mangas);
    }
}
