package academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeption.teste;

import academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeption.dominio.Leito2;
import academy.devdojo.maratonajava.introducao.javacore.Oexeption.exeption.dominio.Leitor1;

import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
        //precisa implementar closeable ou autocloseable
        try (Leitor1 leitor1 = new Leitor1(); Leito2 leito2 = new Leito2()){

        }catch (IOException e){

        }
    }

}
