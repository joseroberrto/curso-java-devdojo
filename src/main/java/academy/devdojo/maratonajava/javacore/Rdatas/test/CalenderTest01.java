package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalenderTest01 {
    public static void main(String[] args) {

        Calendar calendar =Calendar.getInstance();//classe abstrata
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo primeiro dia da semana");
        }

        //impriminto o valor que reprenta as constantes
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

        //adiconando dias,horas,meses...
        calendar.add(Calendar.HOUR,2);
        calendar.add(Calendar.DAY_OF_WEEK , 2);
        calendar.add(Calendar.DAY_OF_MONTH,4);


        //pegar informacoes do calendario segundo a localidade
        Calendar calendar1 = Calendar.getInstance(Locale.JAPAN);
        System.out.println(calendar1.getFirstDayOfWeek());



        System.out.println(calendar.getTime());// retorna um Date com as adicoes Sat Oct 18 20:52:31 GMT-03:00 2025

        Date date = calendar.getTime();//get.Time retorna um Date
        System.out.println(date);

    }
}
