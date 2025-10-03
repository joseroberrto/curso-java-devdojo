package academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeption.dominio;

public class LoginInvalidoExeption extends Exception{
    public LoginInvalidoExeption() {
        super("Login Ivalído");
    }

    public LoginInvalidoExeption(String message) {
        super(message);
    }
}
