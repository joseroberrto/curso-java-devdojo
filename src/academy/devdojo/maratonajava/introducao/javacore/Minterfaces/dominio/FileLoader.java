package academy.devdojo.maratonajava.introducao.javacore.Minterfaces.dominio;

public class FileLoader  implements DateLoader , DateRemove{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }
}
