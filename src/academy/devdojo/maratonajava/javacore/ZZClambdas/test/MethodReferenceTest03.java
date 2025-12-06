package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//method reference usando (Classe::metodo nao static)
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>(List.of("Caio", "Zaro", "Magali", "Alberto"));
        listNames.sort(String::compareTo);
        System.out.println(listNames);


        Function<String,Integer>numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        //BiPredicate<List<String > , String>checkName = (strings, s) -> strings.contains(s);
        BiPredicate<List<String > , String>checkName = List::contains;
        System.out.println(checkName.test(listNames,"Caio"));
    }
}
