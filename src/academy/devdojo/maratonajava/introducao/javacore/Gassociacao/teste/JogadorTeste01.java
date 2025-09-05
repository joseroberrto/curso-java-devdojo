package academy.devdojo.maratonajava.introducao.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.introducao.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("CR7");
        Jogador jogador3 = new Jogador("Messi");

        Jogador[]jogadores = new Jogador[]{jogador1 , jogador2 , jogador3};

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i].getNome());
        }





    }
}
