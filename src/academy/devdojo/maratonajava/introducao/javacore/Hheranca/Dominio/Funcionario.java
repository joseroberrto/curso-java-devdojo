package academy.devdojo.maratonajava.introducao.javacore.Hheranca.Dominio;

public class Funcionario extends Pessoa{
    double salario;

    static {
        System.out.println("Dentro do bloco de inicializção estatico de funcionario");
    }

    {
        System.out.println("Bloco de inicialização de funcionario 1");
    }

    {
        System.out.println("Bloco de inicialização de funcionario 2");
    }

    public Funcionario (String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }
    public double getSalario() {
        return salario;
    }

    public  void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
