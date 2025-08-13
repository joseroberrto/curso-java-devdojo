package academy.devdojo.maratonajava;

public class Aula07EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //usando break

        // imprima os 25 numeros de um dado valor.Por exemplo,50.
        int valorMaximo = 50;
        for(int i = 0 ; i <= valorMaximo ; i ++){
            if (i < 25){
                System.out.println(i);
            }
            System.out.println("i = " + i); // sem o break o laço continua,despediçando processamento

        }

        //usando o break
        int valorMaximo2 = 50;
        for (int i = 0; i <= valorMaximo2 ; i++) {
            if (i > 25){
                break;
            }
            System.out.print(i + " ");

        }
    }
}
