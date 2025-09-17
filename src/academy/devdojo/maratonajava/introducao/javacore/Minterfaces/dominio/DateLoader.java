package academy.devdojo.maratonajava.introducao.javacore.Minterfaces.dominio;

public interface DateLoader {
    // private -> default -> protect -> public
    public final int MAX_DATA_SIZE = 10;

    public abstract void load();
    default  void checkPermission(){
        System.out.println("fazendo checagem de permmissoões (nivel interface)");
    }

    public static void retrieverMaxDataSize(){ // não é possive sobrescrever metódos static
        System.out.println("Dentro do  retrieverMaxDataSize da interface");
    }


}
