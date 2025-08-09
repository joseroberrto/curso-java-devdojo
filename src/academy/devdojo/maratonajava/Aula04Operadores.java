package academy.devdojo.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        //imprime o resultado da operação
        System.out.println(numero01 + numero02);

        // se colocar uma string antes com + , o java irá entender como concatenação
        System.out.println("A soma entre" + numero01 + numero02);

        // se colocar uma string após a inidcação da operação , o java irá fazer a operação primeiro
        System.out.println(numero01 + numero02 + "  Resultado da soma");

        int divisao = numero01 / numero02;
        System.out.println(divisao); // variavel int retona int

        double disao02 = numero01 / numero02;
        System.out.println(disao02); // sendo double rertonará um valor decimal

        // %
        int resto = 20%2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorOuIgualQueVinte = 10 >= 20;
        boolean isDezMenorOuIgualQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte  " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte  " + isDezMenorQueVinte);
        System.out.println("isDezMaiorOuIgualVinte  " + isDezMaiorOuIgualQueVinte);
        System.out.println("isDezMenorOuIgualQueVinte  " + isDezMenorOuIgualQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        /* Operadores Logicos :
        && <-- and
        || <-- or
        !  <-- not
         */

        // exemplo do uso de &&(and)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >4617;
        System.out.println(isDentroDaLei);

        // exemplo do uso de ||(or)
        double ValorTotalContaCorrente = 200;
        double ValorTotalContaPoupança = 10000;
        float ValorPlaystation = 5000;
        boolean isPlaystationCompravel = ValorTotalContaCorrente > ValorPlaystation || ValorTotalContaPoupança > ValorPlaystation;

        System.out.println("Plastation pode ser comprado? " + isPlaystationCompravel);

        /*
         Operadores de Atribuição
         += , -= , *= , /= ,%=
         */
        double bonus = 1000;
        bonus += 1400; // 2400
        bonus -= 2000; //400
        bonus *= 3; // 1200
        bonus /= 2; // 600
        bonus %= 2; // 0
        System.out.println("bonus = "+ bonus);

        //incrementador ++ --
        int contador =0;
        contador ++; // contador + 1 = 1
        contador -- ; // contador - 1 = 0
        System.out.println(contador);






    }
}
