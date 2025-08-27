package academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void Imprime(){
        System.out.println(nome);
        System.out.println(idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
