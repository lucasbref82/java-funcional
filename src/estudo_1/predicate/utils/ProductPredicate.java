package estudo_1.predicate.utils;

import estudo_1.predicate.entidades.Produto;

import java.math.BigDecimal;
import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Produto> {
    @Override
    public boolean test(Produto produto) {
        return produto.getValor().compareTo(BigDecimal.valueOf(1000L)) <= 0;
    }
}
