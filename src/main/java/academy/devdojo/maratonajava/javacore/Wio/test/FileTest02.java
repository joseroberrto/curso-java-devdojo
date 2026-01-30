package academy.devdojo.maratonajava.javacore.Wio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        boolean isDirectoryCreated= fileDirectory.mkdir();
        System.out.println("Diretorio criado?"+isDirectoryCreated);

        //criando um arq dentro do diretorio
        //File fileArquivo = new File("/home/devroberto/IdeaProjects/curso-java-devdojo/pasta/arquivo.txt");
        File fileArquivo =new File(fileDirectory,"arquivo.txt");
        boolean isFileCreated = fileArquivo.createNewFile();
        System.out.println("Arquivo dentro do diretorio criado?"+isFileCreated);


        //renomeando arquivos
        File fileRenamed = new File(fileDirectory,"arquivo_renomeado.txt");//senao passa o diretorio criar o arqu fora dele
        boolean isRenamed = fileArquivo.renameTo(fileRenamed);
        System.out.println("Arquivo denro do diretorio renomedo?"+isRenamed);

        //renomaeado diretorios
        File directoryRenamed =new File("pasta2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("Diretorio renomeado?"+isDirectoryRenamed);




    }
}
