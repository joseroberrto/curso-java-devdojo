package academy.devdojo.maratonajava.javacore.ZZEstreams.exercicios;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercicio01 {
    public static void main(String[] args) {
        //criando uma lista de valores
        List<Integer> integers = IntStream.rangeClosed(1,89).boxed().toList();

        integers.stream().filter(n->n >10).forEach(System.out::println);

        //multiplicando valores
        List<Integer> multiplicado = integers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(multiplicado);

        //somando todos os valores
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        Integer reduce = integers.stream().reduce(0, Integer::sum);
        Integer collect = integers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(collect);
        System.out.println(reduce);
        System.out.println(sum);

        System.out.println("----------------------------------------------");

        //transforma todos os nomes em maiusculos
        List<String> stringList = List.of("Caio", "Aberto", "Bia", "Fernanda");
        List<String> stringsToUpper = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(stringsToUpper);

        //imprime os nomes com mais de 5 caracteres
        Set<String> nameLength = stringList.stream().filter(name -> name.length() > 5).collect(Collectors.toSet());
        System.out.println(nameLength);

        //nomes que comecam com a letra A
        long count = stringList.stream().filter(name -> name.toUpperCase().startsWith("A")).count();
        System.out.println(count);

        //
        List<String> listNames= List.of("java", "Jaca", "Java", "ANa", "Pedro", "ana");

        List<String> names = listNames.stream()
                .map(String::toLowerCase)
                .distinct()//sem duplicatas
                .sorted()
                .toList();
        System.out.println(names);


        //maior valor
        integers.stream().collect(Collectors.maxBy(Integer::compareTo)).ifPresent(System.out::println);
        integers.stream().max(Integer::compareTo).ifPresent(System.out::println);
        
        //menor valor
        integers.stream().collect(Collectors.minBy(Integer::compareTo)).ifPresent(System.out::println);
        integers.stream().min(Integer::compareTo).ifPresent(System.out::println);

        //produto
        List<Integer> integers1 = List.of(1, 3, 4);
        int product = integers1.stream()
                .mapToInt(Integer::intValue)
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);

        //ordem decrescente
        integers1.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .forEach(System.out::println);

        integers1.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println) ;

        //ordem crescente
        integers1.stream()
                .sorted()
                .forEach(System.out::println);

        //contando quantdidade de elementos unicos
        long count1 = integers1.stream()
                .distinct()
                .count();
        System.out.println(count1);

        //streams com obj
        List<Pessoa> pessoas = List.of(new Pessoa("Caio", 20, "SP"),
                new Pessoa("Bia", 17, "MG"),
                new Pessoa("Pedro", 19, "RJ"),
                new Pessoa("Maia", 15, "RS"),
                new Pessoa("Kaka",22,"SP"),
                new Pessoa("Junior",12,"MG"),
                new Pessoa("William",12,"RJ"));

        //filtrando por idade
        List<Pessoa> pessoaList = pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .toList();
        System.out.println(pessoaList);

        //transfromando em List<Strings>
        List<String> pessoaNome = pessoas.stream()
                .map(Pessoa::getNome)
                .toList();
        System.out.println(pessoaNome);

        //fazendo a media de idades
        Double collect1 = pessoas.stream()
                .collect(Collectors.averagingInt(Pessoa::getIdade));
        System.out.println(collect1);

        double v = pessoas.stream()
                .mapToInt(Pessoa::getIdade)
                .average()
                .orElse(00);
        System.out.println(v);


        //Map<String , Interger>
        Map<String, Integer> map = pessoas.stream()
                .collect(Collectors.toMap(Pessoa::getNome, Pessoa::getIdade));


        //agrupando por cidade e quant de pessoas na cidade
        Map<String, Long> longMap = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCidade, Collectors.counting()));
        System.out.println(longMap);

        //media de idade em cada cidade
        Map<String, Double> mediaCidade = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCidade, Collectors.averagingInt(Pessoa::getIdade)));
        System.out.println(mediaCidade);

        Map<String, Pessoa> pessoaMaisVelhaCidade = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCidade,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Pessoa::getIdade)), Optional::get)));


        System.out.println(pessoaMaisVelhaCidade);

        //Map<Strings, List<Strings>>
        Map<String, List<String>> collect2 = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCidade, Collectors.mapping(Pessoa::getNome, Collectors.toList())));
        System.out.println(collect2);
    }

}
