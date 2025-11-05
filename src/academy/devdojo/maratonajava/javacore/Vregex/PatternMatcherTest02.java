package academy.devdojo.maratonajava.javacore.Vregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args){
        /*
        Meta Caracteres:
        - \d = retorna todos os dígitos
        - \D = retorna tudo que não for dígitos como letras,caracteres especias etc
        - \s = retorna espaços em branco (\t \n \r)
        - \S = retorna todos os caracteres excluindo o branco
        - \w
         */
        String regex = "aba";
        String texto = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher =pattern.matcher(texto);

        System.out.println("Texto: "+texto);
        System.out.println("Indice:0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posição encontrada: ");


        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
