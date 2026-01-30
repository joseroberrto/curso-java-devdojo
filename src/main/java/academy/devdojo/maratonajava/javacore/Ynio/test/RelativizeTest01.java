package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01  {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/deroberto");
        Path clazz= Paths.get("/home/devroberto/maratonaJava/OlaMundo.java");
        Path pathClazz = dir.relativize(clazz);
        System.out.println(pathClazz);

        Path absolute1 = Paths.get("/home/devroberto");
        Path absolute2 = Paths.get("/home/devroberto/maratonaJava/OlaMundo.java");
        Path absolute3 = Paths.get("/usr/local");
        Path relativo1 = Paths.get("temp");
        Path relaivo2 = Paths.get("temp/temp.232323");

        System.out.println("1 "+absolute1.relativize(relaivo2));
        System.out.println("2 "+absolute2.relativize(absolute3));
        System.out.println("3 "+absolute1.relativize(absolute2));
        //System.out.println("4 "+absolute1.relativize(relativo1));


    }
}
