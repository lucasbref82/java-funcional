package estudo_2.streams.operacoes_intermediarias;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        lista.stream()
                .skip(2) // Operações intermediárias
                .forEach(System.out::println);

        System.out.println("------------------------------------------");

        // Listas não são modificadas. (Imutáveis)

        List<Integer> lista2 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        lista2.stream()
                .limit(3)
                .map(x -> x * 2)
                .skip(2)
                .distinct()
                .forEach(System.out::println);

        // Operações intermediárias posso aplicar quantas quiser.
    }
}
