package academy.devdojo.maratonajava.introducao.javacore.Sintaxebasica;

import java.util.Scanner;

public class Aula08Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Arrays sixtaxe
        // <tipo> [ ] <nomevariavel> = new <tipo> [quantiade que deseja ]
        int[] idade = new int[3];
        idade[0] = 12;
        idade[1] = 14;
        idade [2] = 113;
        System.out.println(idade[2]);

        //imprimindo os valores de uma array
        for (int i =0 ; i < idade.length ; i++){//length metodo usado para ver o tamanhhho da array
            System.out.println(idade[i]);
        }

        /*
        Inicialização padrão de arrays com o valor:
        --int , float , byte , long , short -> 0
        -- char -> unicode
        -- boolean -> false
        -- String -> null
         */





    }
}
