package academy.devdojo.maratonajava.introducao.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor  extends  Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public void calculaBonus() { // sobrescrevendo o metódo abstrato herdado da superclasse
        this.salario =this.salario + this.salario *0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
