package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        //primeira forma usando o Files
        Path path = Paths.get("pasta/arquivo.txt");
        Path file = Files.createFile(path);
        Files.setAttribute(path,"dos:hidden",true);

        //
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        dosFileAttributes.isHidden();
        dosFileAttributes.isReadOnly();

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);


    }
}
