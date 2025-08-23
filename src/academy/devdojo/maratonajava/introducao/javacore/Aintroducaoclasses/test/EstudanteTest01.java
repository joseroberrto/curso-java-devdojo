package academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        estudante.nome = scan.nextLine();

        System.out.print("Digite sua idade;");
        estudante.idade = scan.nextInt();

        System.out.println("Olá estudante " +estudante.nome + ", voce tem "+ estudante.idade);
    }
}
