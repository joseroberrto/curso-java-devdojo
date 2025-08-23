package academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.dominio.Carro;

public class ExercicioClass {
    public static void main(String[] args) {
      Carro moto = new Carro();

      Carro bucicleta = new Carro();

      moto.nome = "Pop";
      moto.modelo = "Pop 110i";
      moto.ano = 2019;

      bucicleta.ano = 2020;
      bucicleta.nome = "Cameloi";


      System.out.println("Obejeto 01 Pop");
      System.out.println("Nome: " + moto.nome);
      System.out.println("Modelo: " + moto.modelo);
      System.out.println("Ano: " + moto.ano);


      System.out.println("Objeto02");
      System.out.println("Nome: " + bucicleta.nome);



    }



}
