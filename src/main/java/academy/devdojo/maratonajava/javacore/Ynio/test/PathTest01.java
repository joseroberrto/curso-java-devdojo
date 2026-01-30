package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {

        //pacote permite passa  caminho de varias formas
        Path p1 = Paths.get("/home/devroberto/IdeaProjects/curso-java-devdojo/file.txt");
        Path p2 = Paths.get("/home/devroberto/IdeaProjects/curso-java-devdojo","file.txt");
        Path p3 = Paths.get("/home/","devroberto/","IdeaProjects/","curso-java-devdojo/","file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
    }
}
