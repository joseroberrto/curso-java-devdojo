package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OptionalTest03 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Junior", "Caio", "Marcelo");
        Optional<String> optionalString = find(stringList, "Caio");
        optionalString.ifPresent(System.out::println);
        optionalString.orElse("Nome não encontrado na lista");

        System.out.println(toString("Kaka"));
        Optional<Integer> optionalInteger = toString("123");
        optionalInteger.ifPresent(System.out::println);


    }

    private static  Optional<String> find(List<String>list , String name){
        int i = list.indexOf(name);
        if(i!=-1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }

    private static Optional<Integer> toString(String string){
        try {
            return Optional.of(Integer.parseInt(string));
        }catch (NumberFormatException e){
            return Optional.empty();
        }
    }

}
