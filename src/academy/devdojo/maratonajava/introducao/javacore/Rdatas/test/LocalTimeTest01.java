package academy.devdojo.maratonajava.introducao.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 30);//definindo o tempo
        LocalTime timeNow = LocalTime.now();//defindo as horas com base no S.O

        //metodos semelhantes a clsse LocalDate
        System.out.println(time.getHour());//horas
        System.out.println(time.getMinute());//minutos
        System.out.println(time.getSecond());//segundos
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));//hora em ponto
        System.out.println(time);
        System.out.println(timeNow);
    }
}
