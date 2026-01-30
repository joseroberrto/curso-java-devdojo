package academy.devdojo.maratonajava.javacore.Wio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);){
            fw.write("\nAqui quem mandar é o Brasil!!");
            fw.flush();
            System.out.println("File write concluido");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
