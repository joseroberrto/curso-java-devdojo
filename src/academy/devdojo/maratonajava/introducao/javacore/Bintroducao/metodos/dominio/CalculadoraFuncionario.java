package academy.devdojo.maratonajava.introducao.javacore.Bintroducao.metodos.dominio;

public class CalculadoraFuncionario {
    public void CalculaMedia(double[]salario){
        if (salario == null){
            return;
        }
        double valorTotalSalario= 0;
        for (int i = 0; i < salario.length; i++) {
            valorTotalSalario += salario[i];

        }

        double media = valorTotalSalario / salario.length;
        System.out.println("A média salarial = R$"+ media);

    }
}
