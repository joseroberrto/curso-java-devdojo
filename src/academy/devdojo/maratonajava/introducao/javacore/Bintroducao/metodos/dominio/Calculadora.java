package academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraeDoisNumeros(){
        System.out.println(10 - 4);
    }

    public void multiplicaDoisNumeros(int num1 , int num2){
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros(double numero1 , double numero2){
        double resultado = numero1 / numero2 ;
        return resultado;
    }

    public void somaArrays(int []numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

        }
        System.out.println(soma);
    }


    public void somaVarsArgs(int...numeros){ //permite a entrada na chamada de varios args
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

        }
        System.out.println(soma);
    }
}
