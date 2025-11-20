package academy.devdojo.maratonajava.javacore.Zcolecoes.Map;

import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String,String>navigableMap = new TreeMap<>();
        navigableMap.put("A","Letra A");
        navigableMap.put("D","Letra D");
        navigableMap.put("C","Letra C");
        navigableMap.put("B","Letra B");

        for (Map.Entry<String, String> entry : navigableMap.entrySet()) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        //valores que tao abaixo dessa key
        System.out.println(navigableMap.headMap("C"));

        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(navigableMap.lowerEntry("B"));

    }
}
