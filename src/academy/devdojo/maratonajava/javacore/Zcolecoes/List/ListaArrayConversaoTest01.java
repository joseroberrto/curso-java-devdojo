package academy.devdojo.maratonajava.javacore.Zcolecoes.List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //List para Array
        //Integer[] listToArray = numeros.toArray(new Integer[0]);
        //System.out.println(Arrays.toString(listToArray));

        //Array para List
        Integer[]numerosArrays = new Integer[3];
        numerosArrays[0] =1;
        numerosArrays[1] =2;
        numerosArrays[2] =3;

        List<Integer>arrayToList = new ArrayList<>(Arrays.asList(numerosArrays));
        arrayToList.add(15);
        System.out.println(arrayToList);




    }
}
