package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.ManagaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = ManagaRepository.findByTitle("Boku");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = ManagaRepository.findById(3).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga mangaByTitle2 = ManagaRepository.findByTitle("Dr Stone").orElse(new Manga(2, "Dr Stone", 40));
        System.out.println(mangaByTitle2);
    }
}
