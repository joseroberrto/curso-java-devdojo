package academy.devdojo.maratonajava.javacore.Zcolecoes.Map;

import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Roberto");
        Consumidor consumidor2=new Consumidor("Caio");

        Manga manga1 = new Manga(2L, "Berserk", 50D);
        Manga manga2 = new Manga(1L,"Drsgon ball z",40D);
        Manga manga3 = new Manga(3L,"Attack on titan",60D);

        List<Manga> listMangaConsumidor1 = List.of(manga1,manga2,manga3);
        List<Manga> listMangaConsumidor2 = List.of(manga1,manga3);

        Map<Consumidor,List<Manga>> consumidorListMap = new HashMap<>();
        consumidorListMap.put(consumidor1,listMangaConsumidor1);
        consumidorListMap.put(consumidor2,listMangaConsumidor2);

        for (Map.Entry<Consumidor,List<Manga>> entry : consumidorListMap.entrySet()){
            System.out.println("---"+entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("------"+manga.getNome());
            }

        }




    }
}
