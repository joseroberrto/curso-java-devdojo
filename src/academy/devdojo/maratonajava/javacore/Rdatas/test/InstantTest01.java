package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();//retorna um long em  zulu time,horário neutro

        System.out.println(now);
    }
}
