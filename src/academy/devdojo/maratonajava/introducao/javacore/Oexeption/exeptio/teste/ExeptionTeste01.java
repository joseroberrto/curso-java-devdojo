package academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeptio.teste;

import java.io.File;
import java.io.IOException;

public class ExeptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+isCriado);


        } catch (IOException e) {//se ele pegar essa exeption
            e.printStackTrace();
            System.out.println("exercao");
        }

    }
}
