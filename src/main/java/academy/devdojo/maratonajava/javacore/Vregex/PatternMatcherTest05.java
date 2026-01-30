package academy.devdojo.maratonajava.javacore.Vregex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args){
        /*
        Meta Caracteres:
        - \d = retorna todos os dígitos
        - \D = retorna tudo que não for dígitos como letras,caracteres especias etc
        - \s = retorna espaços em branco (\t \n \r)
        - \S = retorna todos os caracteres excluindo o branco
        - \w = a-ZA-Z , digitos
        - \W = Tudo que não for incluso no \w como caracters especiais
        -[] = range , seleciona dentro do range o que quer
        - () = agrupar
        - ? = zero ou uma ocorrencia
        - * = zero ou mais ocorencias
        - + = uma ou mais ocorrencias
        -(n,m) = de n até m
        - | = ou
        - $ fim da linha
        - . 

         */

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com , #@!zoro@gmail.br , teste@mail.com.br ,sakura@gmail";
        System.out.println("#@!zoro@gmail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher =pattern.matcher(texto);

        System.out.println("Texto: "+texto);
        System.out.println("Indice:0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posição encontrada: ");


        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

        int numeroHex = 0x59f86a;
        System.out.println(numeroHex);//retorna o numero em decimal


    }
}
