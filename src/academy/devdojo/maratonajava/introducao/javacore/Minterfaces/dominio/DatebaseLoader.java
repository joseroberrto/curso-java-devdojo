package academy.devdojo.maratonajava.introducao.javacore.Minterfaces.dominio;

public class DatebaseLoader implements  DateLoader, DateRemove{

    @Override
    public void load() {
        System.out.println("Carregando dados do bamco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões  no banco de dados");
    }
}
