package academy.devdojo.maratonajava.introducao.javacore.Hheranca.Dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereço endereco;

    static {
        System.out.println("Dentro do bloco de inicializção estatico de pessoa");
    }

    {
        System.out.println("Bloco de inicialização de pessoa 1");
    }

    {
        System.out.println("Bloco de inicialização de pessoa 2");
    }


    public Pessoa(String nome){
        System.out.println("Dentro do construror de pessoa ");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
