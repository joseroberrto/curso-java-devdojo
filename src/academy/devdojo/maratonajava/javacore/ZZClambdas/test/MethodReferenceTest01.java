package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//method referenfe to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>();
        animeList.add(new Anime("One Piece",1200));
        animeList.add(new Anime("Naruto",500));
        animeList.add(new Anime("Attack On Titan",300));

        Collections.sort(animeList,(a1,a2)->a1.getTitle().compareTo(a2.getTitle()));
        System.out.println(animeList);
    }
}
