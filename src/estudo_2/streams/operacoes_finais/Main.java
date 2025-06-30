package estudo_2.streams.operacoes_finais;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        long count = lista
                .stream()
                .filter(x -> x % 2 == 0)
                .count();

        System.out.println(count);

        System.out.println("---------------------------------------------");

        Optional<Integer> min = lista
                .stream()
                .filter(x -> x % 2 == 0)
                .min(Integer::compareTo);

        min.ifPresent(System.out::println);


        System.out.println("---------------------------------------------");

        Optional<Integer> max = lista
                .stream()
                .filter(x -> x % 2 == 0)
                .max(Integer::compareTo);

        max.ifPresent(System.out::println);

        System.out.println("---------------------------------------------");

        Map<Boolean, List<Integer>> mapa = lista
                .stream()
                .map(e -> e * 3)
                .collect(Collectors.groupingBy(e -> e % 2 == 0));

        System.out.println(mapa);


        System.out.println("---------------------------------------------");

        Map<Integer, List<Integer>> novoMapa = lista
                .stream()
                .collect(Collectors.groupingBy(e -> e % 3));

        System.out.println(novoMapa);


        System.out.println("---------------------------------------------");

        String colectString = lista.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(colectString);


        System.out.println("---------------------------------------------");

        String collectStringJoining = lista.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(";"));

        System.out.println(collectStringJoining);

        // Stream (Loop's implicito) *** Código mais verboso mais difícil de enteder.

        // for - while - do while ... (Loops explicitos) *** Controlado pelo usuário, mais díficil de entender.
    }
}
