package academy.devdojo.maratonajava.javacore.Zcolecoes.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String,String> dicionario = new HashMap<>();
        dicionario.put("teklado","teclado");
        dicionario.put("vc","você");
        dicionario.put("mause","mouse");

        for(String key : dicionario.keySet()){
            System.out.println(key+":"+dicionario.get(key));
        }

        for (Map.Entry<String,String> entry: dicionario.entrySet()){
            System.out.println(entry.getKey() +":"+entry.getValue());
        }

    }
}
