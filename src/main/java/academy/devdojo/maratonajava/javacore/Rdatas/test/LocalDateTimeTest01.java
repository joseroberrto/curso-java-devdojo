package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();//metodos iguais as classes LocalDate e LocalTime
        LocalDate date = LocalDate.parse("2025-12-07");
        LocalTime time = LocalTime.parse("22:30:20.00");

        //passando um date com time e time com date para um LocalDateTime
        LocalDateTime localDateTime2 = date.atTime(time);
        LocalDateTime localDateTime3 = time.atDate(date);

        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);

    }
}
