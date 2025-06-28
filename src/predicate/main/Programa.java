package predicate.main;

import predicate.entidades.Produto;
import predicate.utils.ProductPredicate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Produto> produtoList = new ArrayList<>();

        produtoList.add(new Produto("TV", BigDecimal.valueOf(900.00)));

        produtoList.add(new Produto("Notebook", BigDecimal.valueOf(1200.00)));

        produtoList.add(new Produto("Tablet", BigDecimal.valueOf(450.00)));

        produtoList.removeIf(new ProductPredicate());

        produtoList.forEach(System.out::println);

    }
}
