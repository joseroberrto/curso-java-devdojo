package academy.devdojo.maratonajava.javacore.ZZJjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZJjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJjdbc.service.ProduceService;

import java.util.List;

public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Mappa").build();
        Producer producer2= Producer.builder().name("Studio Deen").build();
        Producer producer3 = Producer.builder().name("STK").build();

        ProduceService.saveTransaction(List.of(producer1,producer2,producer3));
    }
}
