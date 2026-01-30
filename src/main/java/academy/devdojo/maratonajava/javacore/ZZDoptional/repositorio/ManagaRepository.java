package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.lang.management.MemoryNotificationInfo;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ManagaRepository {
    static List<Manga> mangas = List.of(new Manga(1,"Boku no Hero",30),new Manga(2,"Naruto",100));

    public static Optional<Manga> findByTitle(String title){
        return findBy(manga -> manga.getTitle().equals(title));

    }

    public static Optional<Manga> findById(Integer id){
        return findBy(manga -> manga.getId().equals(id));

    }


    public static Optional<Manga> findBy(Predicate<Manga>predicate){
        Manga found =null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)){
                found =manga;
            }
        }

        return Optional.ofNullable(found);
    }
}
