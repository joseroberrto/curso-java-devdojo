package academy.devdojo.maratonajava.introducao.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

//Sobrescrevendo o metodo toSring da superclasse Objetc
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
