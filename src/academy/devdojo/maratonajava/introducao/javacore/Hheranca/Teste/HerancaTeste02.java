package academy.devdojo.maratonajava.introducao.javacore.Hheranca.Teste;

import academy.devdojo.maratonajava.introducao.javacore.Hheranca.Dominio.Funcionario;
/*
Sequência de Inicialização:
   0 - Bloco de inicialização static carregado e executado quando a JVM carrega a  super classe
   1 - Bloco de inicialização static carregado e executado quando a JVM carrega a  sub clase
   2 - Alocação de espaço de memoria para o objeto da super classe
   3 - Cada atributo da super classe  é inicializado com valor default ou o que for passado na super classse
   4 - Bloco de inicialização da super classe  é executado na ordem em que stiver
   5 - Construtor  da super classe é executa
   6 - Alocação de espaço de memoria para o objeto da sub classe
   7 - Cada atributo da sub classe  é inicializado com valor default ou o que for passado na sub classse
   8 - Bloco de inicialização da sub classe  é executado na ordem em que stiver
   9 - Construtor  da sub classe é executa

    */
public class HerancaTeste02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Robero");
    }
}
