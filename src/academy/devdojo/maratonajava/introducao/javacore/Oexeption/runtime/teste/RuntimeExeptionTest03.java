
package academy.devdojo.maratonajava.introducao.javacore.Oexeption.runtime.teste;

public class RuntimeExeptionTest03 {
    public static void main(String[] args) {
        System.out.println(abreConexao()); 
    }

    public static String abreConexao(){

        try {
            System.out.println("Abrino arquivo");
            System.out.println("Escrevendo no arquivo");
            return "conexão bem-sucedida";

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado do SO");
        }
        return null;
    }
}
