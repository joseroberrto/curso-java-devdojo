
package academy.devdojo.maratonajava.introducao.javacore.Oexeption.runtime.teste;

public class RuntimeExeptionTest04 {
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de IllegalArgumentException ");
        }catch (IndexOutOfBoundsException e ){
            System.out.println("Dentro de IndexOutOfBoundsException ");
        }catch (IncompatibleClassChangeError e){
            System.out.println("Dentro de IncompatibleClassChangeError");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException ");
        }

    }



}

