package academy.devdojo.maratonajava.introducao.javacore.Sintaxebasica;

import java.util.Scanner;

public class ArraysMultidimensionais {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [][] matriz = new int[4][5];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length ; c++) {
                System.out.print("Digite um número para a posição " + l + "x" + c + ": ");
                matriz[l][c] = scan.nextInt();
            }
        }

        System.out.println("Voce digitou a matriz : ");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length ; c++) {
                System.out.print(matriz[l][c] + " ");

            }
            System.out.println();
        }

    }


}
