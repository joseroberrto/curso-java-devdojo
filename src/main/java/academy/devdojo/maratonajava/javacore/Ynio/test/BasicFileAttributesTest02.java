package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.regex.PatternSyntaxException;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/arquivo.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creation = basicFileAttributes.creationTime();
        FileTime lastAcess = basicFileAttributes.lastAccessTime();
        FileTime lastModified = basicFileAttributes.lastModifiedTime();

        System.out.println("creation: "+creation);
        System.out.println("lastAcess: "+lastAcess);
        System.out.println("lastModified: "+lastModified);
        System.out.println("-------------------------------------------");


        //modificando atributos
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModified,fileTime,creation);


        creation = fileAttributeView.readAttributes().creationTime();
        lastAcess = fileAttributeView.readAttributes().lastAccessTime();
        lastModified = fileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("creation: "+creation);
        System.out.println("lastAcess: "+lastAcess);
        System.out.println("lastModified: "+lastModified);





    }
}
