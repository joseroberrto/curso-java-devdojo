package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        //Predicate (return) otimo pra condicoes
        //Consumer(void)
        List<String> strings = List.of("Luffy", "Zoro", "Nami");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);


        forEach(strings,s -> System.out.println(s));
        forEach(integers,i -> System.out.println(i));

        List<Integer> integers1 = List.of(1, 2, 3, 4, 5, 7);
        AtomicInteger soma = new AtomicInteger(0);

        Consumer<Integer> somador = n ->soma.addAndGet(n);
        integers1.forEach(somador);
        System.out.println(soma.get());
    }

    private  static <T> void forEach(List<T>list, Consumer<T>consumer){
        for (T e : list) {
            consumer.accept(e);
        }


    }


}
