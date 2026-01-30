package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.servoce.AnimeComparatons;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparatons>animeComparatonsSupplier =AnimeComparatons::new;;
        AnimeComparatons animeComparatons = animeComparatonsSupplier.get();

        List<Anime> animeList = new ArrayList<>();
        animeList.add(new Anime("One Piece",1200));
        animeList.add(new Anime("Naruto",500));
        animeList.add(new Anime("Attack On Titan",300));


        BiFunction<String,Integer,Anime>animeStringIntegerBiFunction = (title,epsodes)->new Anime(title,epsodes);
        BiFunction<String,Integer,Anime>animeStringIntegerBiFunction2 = Anime::new;
        System.out.println(animeStringIntegerBiFunction.apply("Naruto",500));
    }
}
