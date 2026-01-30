package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Overlord",3.99),
            new LightNovel("Naruto",5.99),
            new LightNovel("Berserk",7.99),
            new LightNovel("No game no life",2.99),
            new LightNovel("Fullmetal Alchemist",4.00)));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(lg->lg.getPrice() > 5));
        System.out.println(lightNovels.stream().allMatch(lg->lg.getPrice() > 5));
        System.out.println(lightNovels.stream().noneMatch(lg->lg.getPrice() <0));

        lightNovels.stream()
                .filter(lg-> lg.getPrice() > 2)
                .findAny()
                .ifPresent(System.out::println);


        lightNovels.stream()
                .filter(lg-> lg.getTitle().length() >= 5)
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
