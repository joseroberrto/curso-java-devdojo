package academy.devdojo.maratonajava.introducao.javacore.Oexeption.runtime.teste;

public class RuntimeExeptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(10,0 );

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     */

    public static int divisao(int a ,int b){
        if(b ==0){
            throw new IllegalArgumentException("Argumento ilegal.Não pode divisão por 0.");
        }
        return a/b;

    }
}
