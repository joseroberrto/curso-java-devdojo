package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NomalizeTest01 {
    public static void main(String[] args) {
        String projetoDiretorio = "home/arquivo.txt";
        String arquivo = "../arquivo.txt";
        Path path1 = Paths.get(projetoDiretorio, arquivo);
        System.out.println(path1.normalize());

    }
}
