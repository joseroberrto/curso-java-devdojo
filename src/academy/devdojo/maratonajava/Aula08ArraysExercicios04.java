package academy.devdojo.maratonajava;

import java.util.Scanner;

public class Aula08ArraysExercicios04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int []vetorA = new int[10];
        int []vetorB =new int[10];
        int [] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para o vetor A ,posição "+i+": ");
            vetorA[i] = scan.nextInt();
        }
        System.out.println("-----------------------------------------");


        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite o valor para o vetor B ,posição "+i+": ");
            vetorB[i] = scan.nextInt();
        }
        System.out.println("-----------------------------------------");



        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        //Saida de dados do vetorA, vetorB ,vetorC
        System.out.print("Vetor A:");
        for(int i =0 ; i < vetorA.length ; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("-----------------------------------------");

        System.out.print("Vetor B:");
        for(int i =0 ; i < vetorA.length ; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("-----------------------------------------");


        System.out.print("Vetor C:");
        for(int i =0 ; i < vetorA.length ; i++){
            System.out.print(vetorC[i] + " ");
        }



    }
}
