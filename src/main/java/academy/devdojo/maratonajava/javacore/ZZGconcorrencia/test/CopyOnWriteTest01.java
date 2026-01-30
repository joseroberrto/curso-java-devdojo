package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 200; i++) {
            list.add(i);
        }

        Runnable runnableIterator = ()->{
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnableRemover = () ->{
            for (int i = 0; i < 100; i++) {
                list.remove(i);
                System.out.println(Thread.currentThread().getName()+" removed "+list.get(i));
            }
        };

        new Thread(runnableIterator,"Iterator").start();
        new Thread(runnableRemover,"Removed").start();
        new Thread(runnableRemover,"Removed ").start();
    }
}
