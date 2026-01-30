package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes,DosFileAttributes,PosixFileAttributes


        //Alterando data de modificação
        //Modo antigo
//        File file = new File("pasta2/arquivo.txt");
        LocalDateTime date = LocalDateTime.now().minusDays(10);
//        file.createNewFile();
//        file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());


        //modo moderno
        Path path = Paths.get("pasta2/arquivo.txt");
        Files.createFile(path);
        FileTime from = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,from);

    }
}
