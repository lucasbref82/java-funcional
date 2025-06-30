package estudo_1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 5, 7, 8, 20, 45);

        Stream<Integer> stream1 = list.stream().map(e -> e * 10);

        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<String> stream2 = Stream.of("Lucas", "Larissa", "Debora", "Olivia");
        System.out.println(Arrays.toString(stream2.toArray()));

        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));

        Stream<Long> stream4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(stream4.limit(10).toArray()));


    }
}
