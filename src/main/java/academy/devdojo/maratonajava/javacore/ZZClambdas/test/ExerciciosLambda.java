package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Utils{
    public static void imprimirMaiusculo(String s){
        System.out.println(s);


    }
    public static <T> List<T> ordernarList(List<T>list,Comparator<T>comparator){
        List<T>tList = new ArrayList<>(list);
        tList.sort(comparator);
        return tList;
    }

    public static <T> void filter(List<T>list , Predicate<T>predicate){
        for (T e : list) {
            if (predicate.test(e)){
                System.out.println(e);
            }
        }

    }

    public static <T,R> List<R> intergerTostring(List<T>tList,Function<T,R>function){
        List<R>result = new ArrayList<>();
        for (T e : tList) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;

    }


}

public class ExerciciosLambda {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("Ana","Pedro","Barbara","Caio");

        //forma 1
//        Consumer<String>stringConsumer = s -> System.out.println(s.toLowerCase());
//        list.forEach(stringConsumer);

        //forma 2
        //list.forEach(s -> Utils.imprimirMaiusculo(s));

        //forma 3
        list.forEach(Utils::imprimirMaiusculo);


        //forma1
        List<Integer> integers = Arrays.asList(1, 6, 2, 7, 2, 4, 8);
          Comparator<Integer>integerComparator=(n1, n2) ->n1.compareTo(n2);
//        integers.sort(integerComparator);
//        System.out.println(integers);


        //forma2
        List<Integer>integerList = Utils.ordernarList(integers,Integer::compareTo
        );
        System.out.println(integerList);

        List<Integer> integerList1 = Utils.ordernarList(integers, Comparator.reverseOrder());
        System.out.println(integerList1);

        //forma3
        List<Integer> integerList2 = Utils.ordernarList(integers, Integer::compareTo);
        System.out.println(integerList2);


        //forma 1
        List<String>nomes = new ArrayList<>(List.of("Caio","Augusto","Maria","Bia","Pedro","Baba"));
        Utils.filter(nomes,s -> s.length()==4);

        List<String> integerList3 = Utils.intergerTostring(integers,i -> "numero:"+i);
        System.out.println(integerList3);


    }
}
