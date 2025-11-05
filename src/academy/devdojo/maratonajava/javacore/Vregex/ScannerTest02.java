package academy.devdojo.maratonajava.javacore.Vregex;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Erem,Mikasa,true,100";
        Scanner scanner = new Scanner(texto); //padrao usar o espaço em branco como delimitador
        scanner.useDelimiter(",");


        while (scanner.hasNext()){
            if(scanner.hasNextBoolean()){
                boolean i = scanner.nextBoolean();
                System.out.println("Boolean  = "+i);
            } else if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int = "+i);
            }else {
                System.out.println(scanner.next());
            }
        }


    }
}
