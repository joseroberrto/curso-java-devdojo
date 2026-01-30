package academy.devdojo.maratonajava.javacore.Wio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Locale;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File criado? "+ isCreated);//não sobrescreve o file,criar somente uma vez
            boolean isExits = file.exists();
            System.out.println("Path: "+file.getPath());
            System.out.println("Path absolute: "+file.getAbsolutePath());
            System.out.println("Is directory: "+file.isDirectory());
            System.out.println("Is file: "+file.isFile());
            System.out.println("Is hidden: "+file.isHidden());
            System.out.println("Last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            if(isExits){
                System.out.println("File deletd "+file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
