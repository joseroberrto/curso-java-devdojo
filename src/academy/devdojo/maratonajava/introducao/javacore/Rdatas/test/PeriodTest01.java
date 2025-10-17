package academy.devdojo.maratonajava.introducao.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        LocalDate nowAfter2Years = LocalDate.now().plusYears(2).plusDays(9);

        //precisa de um LocalDate
        Period p1 = Period.between(timeNow,nowAfter2Years);
        Period p2 = Period.ofWeeks(28);
        Period p3 = Period.ofMonths(196);



        //retorn no formato ISO anos,meses e dias
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
