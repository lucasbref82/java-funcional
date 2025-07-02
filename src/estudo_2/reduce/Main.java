package estudo_2.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        String s = "Java é a melhor linguagem de promação do mundo !";
        String[] sSplit = s.split(" ") ;
        List<String> listString = Arrays.asList(sSplit);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // Associativas (Podemos fazer pararel sem problemas)

        // Reduce soma
        Optional<Integer> soma = list.parallelStream().reduce(Integer::sum);

        // Reduce multiplicador
        Optional<Integer> multiplicador = list.parallelStream().reduce((n1, n2) -> n1 * n2);

        // Reduce concatenação
        Optional<String> concatenacao = listString.parallelStream().reduce(String::concat);

        // Não associativas (Não podemos transformar em paralelo)
        Optional<Integer> subtracao = list.parallelStream().reduce((n1, n2) -> n1 - n2);


        // Passando o valor de identidade
        Integer soma2 = list.stream().reduce(0, Integer::sum);

        // Passando o valor de identidade
        Integer multiplicador2 = list.stream().reduce(1, (n1, n2) -> n1 * n2);

        // Reduce concatenação
        String concatenacao2 = listString.stream().reduce("", String::concat);

        // DoubleStream
        double menorValor = DoubleStream.of(1.5, 1,7, 6,7)
                .reduce(Double.POSITIVE_INFINITY, Math::min);

        // Usando combine (Combine so e chamado quando usamos stream paralela

        // Primeiro caso, sem combine.
        String combineUm = list.stream().map(String::valueOf).reduce("", String::concat);
        System.out.println(combineUm);

        // Segundo caso, com combine
        String combine2 = list.stream().reduce("", (x, y) -> x.concat(y.toString()), String::concat);
        System.out.println(combine2);








    }
}
