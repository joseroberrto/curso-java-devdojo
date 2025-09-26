package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio;

public abstract class Funcionario implements Bonus {
    private String nome;
    protected double salarioBase;
    Cargo cargo;


    public Funcionario(String nome,Cargo cargo, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public abstract void calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
