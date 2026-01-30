package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LamdaTest02 {
    public static void main(String[] args) {
        List<String> stringList= List.of("Luffy", "Ussop", "Musashi");
        List<Integer> map = map(stringList, s -> s.length());
        //List<Integer>map = map(stringList,String::length);

        System.out.println(map);



    }

    private static <T,R> List<R> map(List<T>list, Function<T,R>function){
        ArrayList<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;


    }
}
