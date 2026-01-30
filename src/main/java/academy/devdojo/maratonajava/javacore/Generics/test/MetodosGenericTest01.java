package academy.devdojo.maratonajava.javacore.Generics.test;

import academy.devdojo.maratonajava.javacore.Generics.domain.Barco;

import java.util.List;

public class MetodosGenericTest01 {
    public static void main(String[] args) {

        List<Barco> barcoList = criarArrayComObjeto(new Barco("lancha"));
        System.out.println(barcoList);
    }


    private static <T > List<T> criarArrayComObjeto(T t){
        return List.of(t);


    }
//    private static <T extends Comparable<T>> List<T> criarArrayComObjeto(T t){
//        return List.of(t);
//
//
//    }
}
