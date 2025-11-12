package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTes02 {
    public static void main(String[] args) throws IOException {

        //criando um arquivo
        Path arquivoPath = Paths.get("arquivoPath");
        //Path arquivo = Files.createFile(arquivoPath);


        //criando um diretorio
        if (Files.notExists(arquivoPath)) {//metodo utilitario de Files
            Path diretorio = Files.createDirectory(arquivoPath);//se executado de novo lanca uma Exeption

        }

        //criano diretorio caso nao exista
        Path subSubDiretorio = Paths.get("arquioPath/subapasta/subsubpasta");
        Path subPastaDiretorio = Files.createDirectories(subSubDiretorio);
        


    }
}
