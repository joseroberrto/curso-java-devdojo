package academy.devdojo.maratonajava.introducao.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();//retorna um long que reprensenta a data em milisegundos
        date.setTime(date.getTime());//dando o set de milisegundos posivel mostra Sun Oct 12 18:49:10 GMT-03:00 2025
        System.out.println(date);
    }
}
