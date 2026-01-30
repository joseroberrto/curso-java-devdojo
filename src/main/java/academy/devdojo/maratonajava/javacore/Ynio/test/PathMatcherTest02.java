package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
class BuscarArquivos extends SimpleFileVisitor<Path> {
    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if(pathMatcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Path path1 = Files.walkFileTree(path, new BuscarArquivos());
    }
}
