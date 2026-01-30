package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();


    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01,"Bell");
        Thread t2 = new Thread(threadAccountTest01,"Small");

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("Acabou o dinheiro");
            }
        }
    }

    private void withdrawal(int amount){
        System.out.println(Thread.currentThread().getName()+" fora do synchronized****************");
        synchronized (account){
            System.out.println(Thread.currentThread().getName()+" dentro do synchronized############");
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + "Esta indo sacar o dinheiro");
                account.withdrawl(amount);

                System.out.println(Thread.currentThread().getName() + "Completou o saque,valor atual da conta : " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque" + account.getBalance());
            }
        }
    }

}
