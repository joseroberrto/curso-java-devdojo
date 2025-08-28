package academy.devdojo.maratonajava.introducao.javacore.Sintaxebasica;

import java.util.Scanner;

public class Aula09LendoImputs {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //lendo uma linha toda
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Olá "+ nomeCompleto);

        //lendo apenas uma string/uma parte
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Olá "+ primeiroNome);

        //lendo um int
        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();
        System.out.println("Você digitou "+ numero);

        //lendo um double
        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é  "+ altura);


    }
}
