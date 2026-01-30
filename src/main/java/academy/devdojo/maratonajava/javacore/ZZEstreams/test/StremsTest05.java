package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremsTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomo", "Gomo", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));


        List<String[]> collect = words.stream().map(l -> l.split("")).collect(Collectors.toList());
        List<String> letters2 = words.stream()
                .map(l -> l.split(""))//Strem<String[]>
                .flatMap(Arrays::stream)//Strem<Strings>
                .collect(Collectors.toList());

        System.out.println(letters2);
    }
}
