package academy.devdojo.maratonajava.javacore.Ynio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(arquivoZip,arquivosParaZipar);

    }

    private static void zip(Path aruivoZip,Path arquivosParaZipar){
        try(ZipOutputStream zipOutputStream=new ZipOutputStream(Files.newOutputStream(aruivoZip));
            DirectoryStream<Path> directoryStream=Files.newDirectoryStream(arquivosParaZipar)){

            for(Path paths : directoryStream){
                ZipEntry zipEntry = new ZipEntry(paths.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(paths,zipOutputStream);

            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
