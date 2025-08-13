package academy.devdojo.maratonajava;

import java.util.Scanner;

public class Aula08ArraysExercicios {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
         int [] vetorA= new int[10];
         int [] vetorB = new int[vetorA.length];

         for(int i = 0 ; i <  vetorA.length; i++){
             System.out.print("Digite um número para posição "+i+":");
             vetorA[i] = scan.nextInt();
             vetorB[i] = vetorA[i];
         }

        System.out.print("Vetror A:");
         for (int i = 0 ; i < vetorA.length; i++){
             System.out.print(vetorA[i] +" ");
        }
        System.out.println("");

        System.out.print("Vetror B:");
        for (int i = 0 ; i < vetorA.length; i++){
            System.out.print(vetorB[i] +" ");
        }


    }
}
