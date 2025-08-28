package academy.devdojo.maratonajava.introducao.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private int temporada;
    private String genero;


    public Anime(String nome, String tipo ,int episodios ,int temporada){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.temporada = temporada;

    }

    public Anime(){

    }

    public Anime(String nome, String tipo ,int episodios ,int temporada , String genero){
       this(nome, tipo, episodios, temporada);
       this.genero = genero;



    }


    public void imprime(){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodios);
        System.out.println(temporada);
        System.out.println(genero);

    }




    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public void setNome(String nome ){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTipo(){
        return this.tipo;
    }

    public  int getEpisodios(){
        return  this.episodios;
    }
}
