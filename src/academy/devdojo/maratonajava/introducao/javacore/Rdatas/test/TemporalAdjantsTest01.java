package academy.devdojo.maratonajava.introducao.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjantsTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = LocalDate.now().withYear(2020);
        System.out.println(now);



        //maipulando datas com metodos do TemporalAdjusters
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }

}
