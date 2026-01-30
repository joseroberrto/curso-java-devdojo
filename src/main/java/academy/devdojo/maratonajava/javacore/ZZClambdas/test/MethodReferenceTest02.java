package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.servoce.AnimeComparatons;

import java.util.ArrayList;
import java.util.List;


//method refence usando (Objeto::metodo nao static)
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>();
        animeList.add(new Anime("One Piece",1200));
        animeList.add(new Anime("Naruto",500));
        animeList.add(new Anime("Attack On Titan",300));


        AnimeComparatons animeComparatons = new AnimeComparatons();
        animeList.sort(animeComparatons::compareByTilteNoStatic);
        animeList.sort((a1,a2)->animeComparatons.compareByTilteNoStatic(a1,a2));//lambda
        System.out.println(animeList);


    }
}
