package academy.devdojo.maratonajava.introducao.javacore.Fmodificadoresestaticos.Dominio;

public class Anime {
    private String nome;
    private static   int[] episodios ;

    /*
    0 - Bloco de inicialização static carregado e executado quando a JVM carrega a classe
    1 - Alocação de espaço de memoria para o objeto
    2 - Cada atributo de classe é inicializado com valor default ou o que for passado
    3 - Bloco de inicialização é executado
    4 - Construtor é executa


     */


    static {
        System.out.println("Dentro do bloco de inicializção");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i +1;

        }

        for (int i = 0; i < episodios.length; i++) {
            System.out.print(episodios[i] + " ");

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



}
