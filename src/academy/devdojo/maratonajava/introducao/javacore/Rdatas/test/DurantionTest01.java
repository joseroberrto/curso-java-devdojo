package academy.devdojo.maratonajava.introducao.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class DurantionTest01 {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime nowAfter2Years = LocalDateTime.now().plusYears(2);
        LocalTime timeNow= LocalTime.now();
        LocalTime nowAfter7minus = LocalTime.now().plusMinutes(7);

        //Durantio precisa dos segundos e nanos segundos ,aceita LocalDateTime,LocalTime,Instant,Period
        Duration duration1 = Duration.between(nowDateTime,nowAfter2Years);
        Duration duration2 = Duration.between(timeNow,nowAfter7minus);
        Duration duration3 = Duration.between(Instant.now() , Instant.now().plusSeconds(1000));


        //retornando a duraçao em dia,horas,minutos , segundos ,nanos e millis segundos
        Duration duration4 = Duration.ofDays(20);
        Duration duration5 = Duration.ofHours(20);
        Duration duration6 = Duration.ofMinutes(20);
        Duration duration7 = Duration.ofSeconds(20);

        //usando um temporal
        Duration duration8 = Duration.of(4, ChronoUnit.DAYS);




        //retorna no formato da ISO
        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);
        System.out.println(duration6);
        System.out.println(duration7);
        System.out.println(duration8);

    }
}
