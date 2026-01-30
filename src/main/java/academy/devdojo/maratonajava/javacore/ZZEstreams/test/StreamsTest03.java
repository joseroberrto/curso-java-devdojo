package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Overlord",3.99),
            new LightNovel("Naruto",5.99),
            new LightNovel("Berserk",7.99),
            new LightNovel("No game no life",2.99),
            new LightNovel("Fullmetal Alchemist",4.00)));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);

        long count = stream.filter(lg -> lg.getPrice() <= 4).count();
        System.out.println(count);



    }
}
