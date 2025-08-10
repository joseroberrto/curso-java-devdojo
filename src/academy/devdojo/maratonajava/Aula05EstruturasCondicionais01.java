package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){
       //Exemplo de utilização de if
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Autorizado a comprae bebida alcoolica");
        }

        //outro modo de usar o if
        int idade02 = 19;
        boolean isAutorizadoComprarBebida = idade02 >= 18;

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a compra bebida alcoolica 2");
        }

        //  usando if-else
        double salario = 1500;
        float PreçoCelular = 2500F;

        if(salario >= PreçoCelular){
            System.out.println("Salario sufiente para comprar um celular");
        }else{
            System.out.println("Salario insuficiente para comprar um celular");
        }
    }

}
