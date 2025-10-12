package academy.devdojo.maratonajava.introducao.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest01 {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo primeiro dia da semana");
        }

        //impriminto o valoe que reprenta as constantes
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

        //adiconando dias,horas,meses...
        calendar.add(Calendar.HOUR,2);
        calendar.add(Calendar.DAY_OF_WEEK , 2);
        calendar.add(Calendar.DAY_OF_MONTH,4);


        Date date = calendar.getTime();
        System.out.println(date);
    }
}
