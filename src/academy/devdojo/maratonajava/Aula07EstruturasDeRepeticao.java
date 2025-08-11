package academy.devdojo.maratonajava;

public class Aula07EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while
        int count = 12;
        while(count <10){
            System.out.println(count);
            count++;
        }

        //do while
        do { //executa pelo menos 1x
            System.out.println("Dentro do do-while");
        }while (count <10);

        //for
        for (int i = 0 ; i <10 ; i++){
            System.out.println("For " +i);

        }
    }
}
