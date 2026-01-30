package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueuTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bk = new ArrayBlockingQueue<>(1);
        bk.put("Roberto");
        System.out.printf("%s added the value %s%n",Thread.currentThread().getName(),bk.peek());
        System.out.printf("Trying  to add another value%n");
        bk.put("Junior");
        System.out.printf("%s added the value %s%n",Thread.currentThread().getName(),bk.peek());

    }
}
