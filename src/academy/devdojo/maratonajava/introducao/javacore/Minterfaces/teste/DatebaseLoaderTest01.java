package academy.devdojo.maratonajava.introducao.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.introducao.javacore.Minterfaces.dominio.DatebaseLoader;
import academy.devdojo.maratonajava.introducao.javacore.Minterfaces.dominio.FileLoader;

public class DatebaseLoaderTest01 {
    public static void main(String[] args) {
        DatebaseLoader datebaseLoader = new DatebaseLoader();
        FileLoader fileLoader = new FileLoader();

        datebaseLoader.load();
        fileLoader.load();

        datebaseLoader.remove();
        fileLoader.remove();

        datebaseLoader.checkPermission();
        fileLoader.checkPermission();

    }
}
