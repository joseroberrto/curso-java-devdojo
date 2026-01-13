package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class TheadExample extends Thread{
    private char c;

    public TheadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (c %100 ==0){
                System.out.println();
            }
        }
    }
}



class ThreadRunnable implements Runnable{
    private char c;

    public ThreadRunnable(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (c %100 ==0){
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadsTest01 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadRunnable('A'),"T1A");
        Thread t2 = new Thread(new ThreadRunnable('B'),"T2B");
        Thread t3 = new Thread(new ThreadRunnable('C'),"T3C");
        Thread t4 = new Thread(new ThreadRunnable('D'),"T4D");

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("######################"+Thread.currentThread().getName());

    }
}
