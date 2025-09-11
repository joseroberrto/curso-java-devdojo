package academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio;

public class Cliente {
    private String nome;
    private String tipo;
    private  TipoPessoa tipoPessoa;

    public Cliente(String nome, TipoPessoa tipoPessoa){
        this.nome = nome;
        this.tipoPessoa= tipoPessoa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipoPessoa + '\'' +
                '}';
    }
}
