package academy.devdojo.maratonajava.introducao.javacore.Oexeption.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1,num2;
        float resultado;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.println("Digite o primeiro numero: ");
                num1 = scan.nextFloat();
                System.out.println("Digite o segundo numero: ");
                num2 = scan.nextFloat();
                resultado = num1 / num2;
                valido = true;
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Argumento inválido.Não pode divisão por 0");
            }catch (InputMismatchException e){
                System.out.println("Formato invalido.Apenas números inteiros são aceitos");
                scan.nextLine();
            }

        }


    }
}
