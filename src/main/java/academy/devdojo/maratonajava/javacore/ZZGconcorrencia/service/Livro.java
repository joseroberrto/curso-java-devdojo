package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;
public class Livro {
    private final String titulo;
    private int quantidadeDisponivel;

    public Livro(String titulo, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public synchronized boolean emprestar() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
            return true;
        }
        return false;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }
}

