package estudo_1.straeam_v2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 8, 10);
        Stream<Integer> stream1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream1.toArray()));

        int soma = list.stream().reduce(0, Integer::sum);
        System.out.println(soma);

        List<Integer> novaLista = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();

        System.out.println(Arrays.toString(novaLista.toArray()));


    }
}
