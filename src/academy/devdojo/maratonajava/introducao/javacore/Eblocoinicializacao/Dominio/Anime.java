package academy.devdojo.maratonajava.introducao.javacore.Eblocoinicializacao.Dominio;

public class Anime {
    private String nome;
    private int[] episodios ;

    /*
    1 - Alocação de espaço de memoria para o objeto
    2 - Cada atributo de classe é inicializado com valor default ou o que for passado
    3 - Bloco de inicialização é executado
    4 - Construtor é executado
     */


    {
        System.out.println("Dentro do bloco de inicializção");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i +1;

        }

    }


    public Anime(){

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

}
