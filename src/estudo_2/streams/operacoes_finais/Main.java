package estudo_2.streams.operacoes_finais;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

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


    }
}
