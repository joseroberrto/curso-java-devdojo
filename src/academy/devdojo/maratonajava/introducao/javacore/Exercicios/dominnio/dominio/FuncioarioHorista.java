package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio;

public class FuncioarioHorista extends Funcionario{

    @Override
    public double calcularBonus() {
        return this.salarioBase* 0.90;
    }

    private double horasTrabalhadas;


    public FuncioarioHorista(String nome, Cargo cargo, double salarioBase) {
        super(nome, cargo, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double salario;
        salario = this.horasTrabalhadas * salarioBase;
        System.out.println("Salario: " + salario);
    }


}
