package academy.devdojo.maratonajava.introducao.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends  Pessoa { // a casse sendo abstrata não pode ser instânciada , será tipo um templete paras as subclasses
    protected String nome;
    protected double salario;

    @Override
    public void imprime() {
        System.out.println("Imprimindo....");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();//todas as sub clases teram que implementar esse metódp abstrato
    }

    public abstract void calculaBonus();



    //Posso incluir metódos concretos em classes abstratadas junto com metódos abstratos



}
