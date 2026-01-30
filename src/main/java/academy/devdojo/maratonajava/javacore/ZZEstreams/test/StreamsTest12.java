package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Overlord",3.99, Category.FANTASY),
            new LightNovel("Naruto",5.99,Category.ACTION),
            new LightNovel("Berserk",7.99,Category.DRAMA),
            new LightNovel("No game no life",2.99,Category.FANTASY),
            new LightNovel("Fullmetal Alchemist",4.00,Category.FANTASY)));

    public static void main(String[] args) {
        Map<Category ,List<LightNovel>>categoryListMap = new HashMap<>();
        List<LightNovel>fantasy =new ArrayList<>();
        List<LightNovel>action =new ArrayList<>();
        List<LightNovel>drama =new ArrayList<>();
        List<LightNovel>romance =new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA -> drama.add(lightNovel);
                case ROMANCE -> romance.add(lightNovel);
                case ACTION -> action.add(lightNovel);
                case FANTASY -> fantasy.add(lightNovel);
            }
        }
        categoryListMap.put(Category.DRAMA,drama);
        categoryListMap.put(Category.ROMANCE,romance);
        categoryListMap.put(Category.ACTION,action);
        categoryListMap.put(Category.FANTASY,fantasy);

        System.out.println(categoryListMap);


        Map<Category, List<LightNovel>> categoryListMap1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(categoryListMap1);

    }
}
