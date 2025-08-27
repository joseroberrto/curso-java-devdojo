package academy.devdojo.maratonajava.introducao.javacore.Csobrecargametodos.Dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private int temporada;


    public void Impreme(String nome , String tipo ,int episodios ){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodios);
    }
    public void Impreme(String nome , String tipo ,int episodios ,int temporada){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodios);
        System.out.println(temporada);
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
