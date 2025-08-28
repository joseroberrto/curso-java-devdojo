package academy.devdojo.maratonajava.introducao.javacore.Sintaxebasica;

public class Aula10ArraysMultidimensonais {
    public static void main(String[] args) {
        // sintaxe <tipo> [] [ ] <variavel> = new <tiipo> [quant.base][quant.desejada]
        int[][] idade = new int[3][3];
        idade[0][0] = 4;
        idade[0][1] = 5;
        idade[0][2] = 6;


        //imprimindo cada valor de dentro d array
        for (int i = 0; i < idade.length; i++) {
            for (int j = 0; j < idade[i].length; j++) {
                System.out.println(idade[i][j]);

            }

        }

        //outra forma de declarar arrays
        String[][] grupo = new String[3][];
        grupo[0] = new String[3]; ///cada grupo vai ter diferentes numeros de integrantes
        grupo[1] = new String[2];
        grupo[2] = new String[5];

        for (int i = 0; i < grupo.length; i++) {
            for (int j = 0; j < grupo[i].length; j++) {
                System.out.println(grupo[i][j]);

            }

        }



    }
}
