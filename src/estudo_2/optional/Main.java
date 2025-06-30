package estudo_2.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    private static final Integer NUMERO_DEFAULT = 100;

    public static void main(String[] args) {
        String string = "10";
        Integer numero = converteEmNumero(string).orElse(NUMERO_DEFAULT);
        System.out.println(numero);

        System.out.println("-------------------------------------------------------------");

        Integer numero1 = converteEmNumero(string).orElseGet(() -> NUMERO_DEFAULT);
        System.out.println(numero1);

        System.out.println("-------------------------------------------------------------");

        Integer numero2 =  converteEmNumero(string).orElseThrow(() -> new NullPointerException("Valor vazio !"));
        System.out.println(numero2);

        System.out.println("-------------------------------------------------------------");

        Stream.of(1,2,3,4)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("-------------------------------------------------------------");

        Optional<Integer> numero3 = converteEmNumero(string)
                .or(() -> Optional.of(retornaUm()))
                .or(() -> Optional.of(retornaDois()))
                .or(() -> Optional.ofNullable(retetornaTres()));

        System.out.println(numero3);

    }

    public static Optional<Integer> converteEmNumero(String numeroStr) {
        try {
            return Optional.of(Integer.valueOf(numeroStr));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public static Integer retornaUm() {
        return 1;
    }

    public static Integer retornaDois() {
        return 2;
    }

    public static Integer retetornaTres() {
        return 3;
    }

}
