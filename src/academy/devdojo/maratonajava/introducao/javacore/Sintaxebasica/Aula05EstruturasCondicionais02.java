package academy.devdojo.maratonajava.introducao.javacore.Sintaxebasica;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // usando else if
        int idade = 13;
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade <18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);


    }
}
