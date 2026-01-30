package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

public class ThreadsTest03 {
    public static void main(String[] args) {
        Runnable r = () ->{
            for (int i = 0; i < 5; i++) {
                System.out.printf("Thread %s: processando %d....%n",Thread.currentThread().getName(),i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        new Thread(r,"A").run();
        new Thread(r,"B").run();
    }
}
