package academy.devdojo.maratonajava.javacore.Zcolecoes.List;

import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L,"Pokemon",134.67,23));
        mangas.add(new Manga(2L,"Berserk",50D,100));
        mangas.add(new Manga(1L,"Drsgon ball z",40D,0));
        mangas.add(new Manga(3L,"Attack on titan",60D,0));

        //usando o iterator
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade()==0){
//                mangaIterator.remove();
//            }
//        }
//
//        System.out.println(mangas);

        //usando programacao funcional
        mangas.removeIf(manga -> manga.getQuantidade()==0);
        System.out.println(mangas);
    }
}
