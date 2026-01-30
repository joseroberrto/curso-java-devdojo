package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/texto.txt");
        Path path2 = Paths.get("pasta/subpasta/texto.pkp");
        Path path3 = Paths.get("pasta/subpasta/texto.java");
        matches(path2,"glob:**.pkp");
        matches(path2,"glob:**/*.pkp");
        matches(path1,"glob:**/*.{pkp,txt,java}");
        matches(path3,"glob:**/*.???");
        matches(path3,"glob:**/*.????");
        matches(path3,"glob:**/texto.????");

    }
    private static void matches(Path path,String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob +": "+matcher.matches(path));
    }
}
