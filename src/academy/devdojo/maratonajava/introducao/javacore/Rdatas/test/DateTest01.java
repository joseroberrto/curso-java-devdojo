package academy.devdojo.maratonajava.introducao.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();//retorna um long que reprensenta a data em milisegundos
        date.setTime(date.getTime()+3_600_000);
        System.out.println(date);
    }
}
