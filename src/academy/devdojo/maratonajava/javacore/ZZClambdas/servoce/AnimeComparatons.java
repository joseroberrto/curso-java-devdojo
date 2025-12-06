package academy.devdojo.maratonajava.javacore.ZZClambdas.servoce;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;

public class AnimeComparatons {
    public static int compareByTilte(Anime anime1 , Anime anime2){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    public  int compareByTilteNoStatic(Anime anime1 , Anime anime2){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

}
