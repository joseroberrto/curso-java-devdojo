package academy.devdojo.maratonajava;
import java.util.Scanner;


public class Aula08ArraysExercicios03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetorA = new int[15];
        int []vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um valor pa a posição "+i+": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i]; // vai pegar cada elemento do vetorA ao quadrado e atribuir ao vetorB
        }

        //Saida de dados do vetorA e vetorB
        System.out.print("Vetor A:");
        for(int i =0 ; i < vetorA.length ; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");


        System.out.print("Vetor B:");
        for(int i =0 ; i < vetorA.length ; i++){
            System.out.print(vetorB[i] + " ");
        }




    }
}
