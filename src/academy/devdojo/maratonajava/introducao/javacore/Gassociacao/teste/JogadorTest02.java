package academy.devdojo.maratonajava.introducao.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.introducao.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.introducao.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {


        Time time = new Time("Seleção brasileira");
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2= new Jogador("Cafu");


        jogador.imprime();

    }
}
