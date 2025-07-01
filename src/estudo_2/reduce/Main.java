package estudo_2.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String s = "Java é a melhor linguagem de promação do mundo !";
        String[] sSplit = s.split(" ") ;
        List<String> listString = Arrays.asList(sSplit);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // Associativas (Podemos fazer pararel sem problemas)

        // Reduce soma
        Optional<Integer> soma = list.parallelStream().reduce(Integer::sum);
        soma.ifPresent(System.out::println);

        // Reduce multiplicador
        Optional<Integer> multiplicador = list.parallelStream().reduce((n1, n2) -> n1 * n2);
        multiplicador.ifPresent(System.out::println);

        // Reduce concatenação
        Optional<String> concatenacao = listString.parallelStream().reduce(String::concat);
        concatenacao.ifPresent(System.out::println);

        // Não associativas (Não podemos transformar em paralelo)
        Optional<Integer> subtracao = list.parallelStream().reduce((n1, n2) -> n1 - n2);
        subtracao.ifPresent(System.out::println);





    }
}
