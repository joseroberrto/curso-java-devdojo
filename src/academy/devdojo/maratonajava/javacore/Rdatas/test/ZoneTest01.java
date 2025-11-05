package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        System.out.println("--------------------------------------------");
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.printf("ZoneId Tokyo: %s\n",tokyoZone);

        //sett de ZoneId no LocalDateTime
        LocalDateTime now =LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.printf("AtZone do ZoneID Tokyo no LocalDateTime:%s \n",zonedDateTime);

        //AtZone do ZoneId num Instant
        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.printf("AtZone do ZoneId Tokyo no Instant:%s\n",zonedDateTime2);//2025-10-18T07:08:19.381971200+09:00[Asia/Tokyo]
        System.out.println("--------------------------------------------");

        //MAX e MIN de zonas para setar
        // +18:00
        //-18:00
        System.out.println("Zonas maximas:"+ZoneOffset.MAX);
        System.out.println("Zonas minimas: "+ZoneOffset.MIN);
        System.out.println("-----------------------------------------------");


        // ZoneOffset de uma Zona e atOffset no LocalDateTime,Intant
        ZoneOffset OffsetTokio= ZoneOffset.of("+09:00");
        OffsetDateTime offsetDateTime = now.atOffset(OffsetTokio);
        System.out.printf("ZoneOffset e atOffset no LocalDateTime:%s\n",offsetDateTime);//2025-10-17T19:08:19.380072400+08:00 (sem a zona descrita)

        OffsetDateTime offsetDateTime1 = nowInstant.atOffset(OffsetTokio);
        System.out.println("ZoneOffset e attOffset no instant:"+ offsetDateTime1);//Retorna o LocalDateTime com a zona aplicada 2025-10-18T06:23:22.353586200+08:00

        //Pegando LocalDateTime direto do calendario
        JapaneseDate japaneseDate =JapaneseDate.from(LocalDate.now());
        System.out.printf("LocalDateTime Japão: %s",japaneseDate);

    }
}
