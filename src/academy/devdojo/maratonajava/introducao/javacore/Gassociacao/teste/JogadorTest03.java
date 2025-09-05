package academy.devdojo.maratonajava.introducao.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.introducao.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.introducao.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Brasil");
        Jogador jogador1 = new Jogador("Cafú" );
        Jogador jogador2 = new Jogador("Pelé" );
        Jogador [] jogadores = {jogador1 , jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-------------Jogador--------------");
        jogador1.imprime();

        System.out.println("-------------Time--------------");
        time.imprime();





    }
}
