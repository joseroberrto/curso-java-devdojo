package academy.devdojo.maratonajava.introducao.javacore.Vregex;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Erem, Mikasa ,true, 100";
        String[] nomes = texto.split(",");

        for(String n : nomes){
            System.out.println(n.trim());
        }
    }
}
