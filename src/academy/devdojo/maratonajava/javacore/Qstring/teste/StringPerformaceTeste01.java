package academy.devdojo.maratonajava.javacore.Qstring.teste;

import java.awt.*;

public class StringPerformaceTeste01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatStrings(1000);
        long fim =System.currentTimeMillis();
        System.out.println("Tempo gasto String:"+(fim-inicio)+"ms");
        //1000 - 20ms

        inicio = System.currentTimeMillis();
        concatStringsBuilder(1000);
        fim =System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuider:"+(fim-inicio)+"ms");
        //1000 - 2ms


        inicio = System.currentTimeMillis();
        concatStringsBuffer(1000);
        fim =System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer:"+(fim-inicio)+"ms");
        //1000 - 3ms


    }

    private  static  void concatStrings(int tamanho){
        String texto ="";
        for (int i = 0; i < tamanho; i++) {
            texto += i;

        }
    }

    private  static  void concatStringsBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }
    private  static  void concatStringsBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }
}
