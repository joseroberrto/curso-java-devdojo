package academy.devdojo.maratonajava.introducao.javacore.Fmodificadoresestaticos.Teste;

import academy.devdojo.maratonajava.introducao.javacore.Fmodificadoresestaticos.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("BMW" , 280 );
        Carro carro02 = new Carro("Mercedes" , 275 );
        Carro carro03 = new Carro("Audi" , 290 );

        Carro.velocidadeLimite = 220;

        carro01.impreme();
        carro02.impreme();
        carro03.impreme();
    }
}
