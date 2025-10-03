package academy.devdojo.maratonajava.introducao.javacore.Oexeption.exercicios;

import java.util.Scanner;

public class VerificadorInteiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.println("Digite um número inteiro: ");
                numero = scan.nextInt();
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Numero ivalido.Digite um número inteiro");
            }
        }
    }
}
