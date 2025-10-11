package academy.devdojo.maratonajava.introducao.javacore.Qstring.teste;

public class StringTeste02 {

    public static void main(String[] args) {
        String nome = "Luffy";
        String nome2 = "Caio";

        //extração e manipulação
        System.out.println(nome.charAt(3));//retorna o caractere de dada posição
        System.out.println(nome.substring(0,3));
        System.out.println(nome.replace('f','l'));//trocar caracteres
        System.out.println(nome.replace("uff","llu"));//troca uma sequencia de carcteres
        System.out.println(nome.concat(nome2));//concaternar strings

        //conversão em maiuscylo  minusculo
        System.out.println(nome.toUpperCase());//tranforma as letras em maiusculo
        System.out.println(nome.toLowerCase());//transforma as letras para minusculo

        //metodos uteis
        System.out.println(nome.length());//retorns o tamanho ds String
        System.out.println(nome.compareTo(nome2));//compara cada caractere segundo sua ordem na tabela unicode/0 para iguaisis
        System.out.println(nome.split("f"));//divide com base numa expressao


        //remoção de espaços
        System.out.println(nome.trim());//remove os espaços em branco
        System.out.println(nome.stripLeading());//remove espaços no começo
        System.out.println(nome.stripTrailing());//remove espaços no fim


        //busca e verificação de conteudo
        System.out.println(nome.contains("llu"));//retorna true ou false caso sstring contenha a sequencia
        System.out.println(nome.startsWith("Lu"));//retorna true ou false caso string comece com a sequencia
        System.out.println(nome.endsWith("ddf"));//retorna true ou false caso string termine com a sequencia
        System.out.println(nome.indexOf("Lu"));//rettorna a posiçao  da primeira ocorrencia
        System.out.println(nome.lastIndexOf("ff"));//retorna a posicao da ultima ocorencia

        //conversão e formatação
        int numero =123;
        System.out.println(String.valueOf(numero));//converte qualquer tipo numa string
        System.out.println();//converte qualquer tipo em String
        System.out.println(nome.toCharArray());//converte a string num arrays de caracteres
        System.out.println(String.join("-",nome,nome2));//junta strings com um delimitador
        System.out.println(String.format("Olá %s",nome));//formata no estilo printf
    }
}
