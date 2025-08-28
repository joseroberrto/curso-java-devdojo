package academy.devdojo.maratonajava.introducao.javacore.Sintaxebasica;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // se sálario > 5000 vou doar para DevDojo
        double salario = 10000;
        String mensagemVouDoar = "Vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Não tenho condições,mas terei!";

        if(salario > 5000){
            System.out.println(mensagemVouDoar);
        }else{
            System.out.println(mensagemNaoDoar);
        }

        System.out.println("------------------------");

        // operador ternario
        double salario02 = 2400;
        String mensagemVouDoar02 = "\"Vou doar 500 pro DevDojo\"";
        String mensagemNaoDoar02 = "Não tenho condições,mas terei!";

        // sintaxe (condição) ? verdadeiro : falso
        String resultado = (salario02 > 5000) ? mensagemVouDoar02 : mensagemNaoDoar02; //variaveis precisam ser do mesmo tipo
        System.out.println(resultado);


    }
}
