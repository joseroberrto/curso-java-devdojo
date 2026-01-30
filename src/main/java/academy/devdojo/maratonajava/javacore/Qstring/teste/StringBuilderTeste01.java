package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Willian";
        nome = nome.concat(" suane");
        System.out.println(nome);

        System.out.println("--------------------------'");
        StringBuilder sb = new StringBuilder(nome);
        sb.append(" Suane").append(" Academy");
        sb.reverse();
        sb.reverse();//continua alterando o mesmo objeto
        System.out.println(sb);


    }
}
