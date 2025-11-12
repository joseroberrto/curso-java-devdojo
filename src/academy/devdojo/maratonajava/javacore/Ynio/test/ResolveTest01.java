package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/dev");
        Path arquivo = Paths.get("devroberto/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);


        Path absolute = Paths.get("/home/dev");
        Path relativo = Paths.get("devroberto/arquivo.txt");
        Path file = Paths.get("file.txt");

        System.out.println("1 "+absolute.resolve(relativo));
        System.out.println("2 "+absolute.resolve(file));
        System.out.println("3 "+relativo.resolve(absolute));
        System.out.println("4 "+relativo.resolve(file));
        System.out.println("5"+file.resolve(relativo));
        System.out.println("6"+file.resolve(absolute));

    }
}
