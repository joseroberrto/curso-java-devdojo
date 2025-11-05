package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, Month.JULY,12);//escolhendo a data
        LocalDate dateNow = LocalDate.now();//data atual conforme o S.O

        //metodos
        System.out.println(date.getYear());//ano
        System.out.println(date.getDayOfWeek());//dia da semana
        System.out.println(date.getMonth());//mes
        System.out.println(date.getMonthValue());//mes (1-12)
        System.out.println(date.lengthOfMonth());//quant dias no mes
        System.out.println(date.isLeapYear());//true ou false se for ano bissexto
        System.out.println(LocalDate.MAX);//numero maximo de datas
        System.out.println(LocalDate.MIN);//numero minimo de datas
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));//templantes
        System.out.println(date);
        System.out.println(dateNow);
    }
}
