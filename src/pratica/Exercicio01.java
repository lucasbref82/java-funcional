package pratica;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio01 {
    public static void main(String[] args) {
        // Dada uma lista de strings, filtre todas as palavras com mais de 5 letras e transforme em maiúsculas.
        List<String> listaString = List.of("Lucas", "Ana", "Debora", "Joao", "Emerson", "Larissa");
        listaString
                .stream()
                .filter(x -> x.length() > 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        // -----------------------------------------------------------------------------------------------------

        System.out.println();

        // Dada uma lista de inteiros, retorne a soma dos quadrados dos pares.
        List<Integer> listaInteger = List.of(1, 2, 3, 4, 5, 6, 7);

        Integer soma = listaInteger
                .stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        System.out.println("A soma dos quadrados dos pares e: " + soma);

        // -----------------------------------------------------------------------------------------------------

        System.out.println();

        // A partir de uma lista de nomes, crie um Map<Character, List<String>> onde a chave é a primeira letra

        List<String> listaNomes = List.of("Lucas", "Ana", "Debora", "Joao", "Emerson", "Larissa");
        Map<Character, List<String>> mapaNomes = listaNomes.stream().collect(Collectors.groupingBy(nome -> nome.charAt(0), Collectors.toList()));
        System.out.println(mapaNomes);
    }
}
