package academy.devdojo.maratonajava.javacore.Zcolecoes.Test;

import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
//        Queue<String>fila = new PriorityQueue<>();
//        fila.add("C");
//        fila.add("B");
//        fila.add("A");
//        while (!fila.isEmpty()){
//            System.out.println(fila.poll());
//
//        }

        Queue<Manga>mangas = new PriorityQueue<>(new MangaSortByIdComparator());
        mangas.add(new Manga(2L,"Berserk",50D));
        mangas.add(new Manga(1L,"Drsgon ball z",40D));
        mangas.add(new Manga(3L,"Attack on titan",60D));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }

}
