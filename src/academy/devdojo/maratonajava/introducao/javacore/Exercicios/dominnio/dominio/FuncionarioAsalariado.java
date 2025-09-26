package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio;

public class FuncionarioAsalariado extends Funcionario {

    @Override
    public double calcularBonus() {
        return this.salarioBase *0.90;
    }


    public FuncionarioAsalariado(String nome,Cargo cargo,double salarioBase) {
        super(nome, cargo,salarioBase);
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salario: "+salarioBase);


    }

}
