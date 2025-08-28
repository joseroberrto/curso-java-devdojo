package academy.devdojo.maratonajava.introducao.javacore.Sintaxebasica;

public class Aula07EstruturasDeRepeticaoExercicios {
    public static void main(String[] args) {
        //Dado um valor de um carro , descubra quantas vezes ele pode ser parcelado
        //Condição valorParcela >=100
        double valorCarro = 30000;
       for (int parcela = 1 ; parcela <= valorCarro ; parcela++){
           double valorParcela = valorCarro / parcela;
           if (valorParcela < 1000){
               break;
           }

       }
    }

}
