package academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeptio.teste;

import java.io.File;
import java.io.IOException;

public class ExeptionTeste02 {
    public static void main(String[] args) {
        try {
            criarNovoArquivo();
        }catch (IOException e){
            System.out.println("Um email sera enviado para mais orientações");

        }

    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+isCriado);

        } catch (IOException e) {//se ele pegar essa exeption
            e.printStackTrace();
            System.out.println("Houve uma falha ao criar um arquivo");
            throw e;
        }

    }
}
