package estudo_1.comparator.main;

import estudo_1.consumer.entidades.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(new Produto("TV", BigDecimal.valueOf(900.00)));
        produtoList.add(new Produto("Notebook", BigDecimal.valueOf(1200.00)));
        produtoList.add(new Produto("Tablet", BigDecimal.valueOf(450.00)));

        // 1º Versão via classe que estende um consumer.
        // produtoList.forEach(new PriceUpdate());

        // 2º Versão via funçõe estática da classe Produto
        // produtoList.forEach(Produto::staticPriceUpdate);

        // 3º Versão, via função na classe Produto.
        // produtoList.forEach(Produto::nonStaticPriceUpdate);

        // 4º Via expressão lambda declarada.
        // Consumer<Produto> consumer = p -> p.setValor(p.getValor().multiply(new BigDecimal("1.1")));

        // 5º Via expresso INLINE
        produtoList.forEach(p -> p.setValor(p.getValor().multiply(new BigDecimal("1.1"))));

        produtoList.forEach(System.out::println);

    }
}
