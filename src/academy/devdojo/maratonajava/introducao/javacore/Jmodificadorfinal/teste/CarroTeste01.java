package academy.devdojo.maratonajava.introducao.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.introducao.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.introducao.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();


        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Oda");
        System.out.println(carro.COMPRADOR);

    }
}
