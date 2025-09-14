package academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio;

public class Cliente {
    private String nome;
    private  TipoPessoa tipoPessoa;
    private TipoPagamento tipoPagamento;


    public Cliente(String nome, TipoPessoa tipoPessoa, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoPessoa=" + tipoPessoa +
                ", tipoInt=" + tipoPessoa.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
