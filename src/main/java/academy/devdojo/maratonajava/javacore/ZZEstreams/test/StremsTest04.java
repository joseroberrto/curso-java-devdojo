package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StremsTest04 {
    public static void main(String[] args) {
        List<List<String>>devDojo = new ArrayList<>();
        List<String>develops = List.of("Roberto","Guanabara","TRanquilao");
        List<String>designers = List.of("Mari","Leticia","Jheniffer");
        List<String>editors = List.of("Mega","Pedro");

        devDojo.add(develops);
        devDojo.add(designers);
        devDojo.add(editors);

        //antes sem uso de strems
//        for (List<String> people : devDojo) {
//            for (String person : people) {
//                System.out.println(person);
//            }
//
//        }

        //agora com uso de strems (flatmap)
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);



    }
}
