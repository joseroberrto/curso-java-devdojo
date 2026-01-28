package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.Livro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercicios01 {
    public static void main(String[] args) {
        Livro livro = new Livro("Java Concorrenca",1);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i <=4; i++) {
            executorService.submit(()->{
                boolean sucesso = livro.emprestar();

                if (sucesso){
                    System.out.printf("Thread %s conseguiu emprestatr o livro com sucesso%n",Thread.currentThread().getName());;
                }else {
                    System.out.printf("Thread %s não conseguiu emprestar o  livro com sucesso%n",Thread.currentThread().getName());;
                }
            });
        }

        executorService.shutdown();
    }
}
