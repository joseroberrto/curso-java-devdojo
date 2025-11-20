package academy.devdojo.maratonajava.javacore.Zcolecoes.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("roberto");
        nomes.add("java");


        //imprimindo valores de uma List
//        for (Object nome : nomes){
//            System.out.println(nome);
//        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }


        //metodos
        nomes.remove(0);//index ou obj

        List<String> nomes2 = new ArrayList<>();
        nomes.add("junior");
        nomes.add("python");

        nomes.addAll(nomes2);
        System.out.println(nomes);
    }
}
