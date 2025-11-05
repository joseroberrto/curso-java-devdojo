package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste01 {
    public static void main(String[] args) {


        //strings no java são imutaveis!!
        String nome = "Willian";//strings pool
        String nome2 = "Willian";
        nome.concat("Suane ");//criar outra string no pool de string

        String nome3 = new String("Willian");//1variavel de referencia,2 objeto do tipo string,3 uma string no pool
        System.out.println(nome == nome2);// fazem referencia pra mesma string no pool de string
        System.out.println(nome == nome3);//referencia diferente
        System.out.println(nome.equals(nome3));//valores iguais


    }
}
