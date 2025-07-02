package estudo_2.collect;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Maneira mais crua de implementar collect
        Set<Integer> set = list.stream()
                .collect(
                        () -> new HashSet<>(),
                        (hs, l) -> hs.add(l),
                        (s, l) -> s.addAll(l)
                );

        // Collectors.toList, Collectors.toSet entre outras implementadas.
        Deque<Integer> integerArrayDeque =
                list.stream()
                        .collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        String stringColection = list.stream().map(i -> String.valueOf(i)).collect(Collectors.joining(","));

        Double mediaColection = list.stream().collect(Collectors.averagingInt(i -> i));

        Integer somaColetion = list.stream().collect(Collectors.summingInt(i -> i));

        IntSummaryStatistics sumarrizing = list.stream().collect(Collectors.summarizingInt(o -> o));
        System.out.println("IntSummaryStatistics: ");
        System.out.println(sumarrizing.getMax());
        System.out.println(sumarrizing.getMin());
        System.out.println(sumarrizing.getAverage());
        System.out.println(sumarrizing.getCount());
        System.out.println(sumarrizing.getCount());

        Map<Integer, List<Integer>> collectGroup = list.stream()
                .collect(Collectors.groupingBy(x -> x % 3));

        Map<Boolean, List<Integer>> collectPartitionBy = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));



    }
}


