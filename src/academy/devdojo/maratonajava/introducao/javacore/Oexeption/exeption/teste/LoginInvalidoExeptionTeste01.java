package academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeption.teste;

import academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeption.dominio.LoginInvalidoExeption;

import java.util.Scanner;

public class LoginInvalidoExeptionTeste01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoExeption e) {
            throw new RuntimeException(e);
        }

    }

    public static void login() throws LoginInvalidoExeption {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.print("Name:");
        String usernameDigitado = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (!usernameDigitado.equals(usernameDB) | !senhaDigitada.equals(senhaDB)){
            throw new LoginInvalidoExeption();
        }
        System.out.println("Login ralizado com sucesso");


    }
}
