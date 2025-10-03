package academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeption.dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws FileNotFoundException,LoginInvalidoExeption {
        System.out.println("Salvando pessoa");
    }
}
