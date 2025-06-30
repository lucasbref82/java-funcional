package estudo_1.comparator.main;

import estudo_1.comparator.entidades.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<Produto> produtoList = new ArrayList<>();

        produtoList.add(new Produto("TV", BigDecimal.valueOf(900.00)));
        produtoList.add(new Produto("Notebook", BigDecimal.valueOf(1200.00)));
        produtoList.add(new Produto("Tablet", BigDecimal.valueOf(450.00)));

        // Versão 1
        // Ideal para se quando precisa de mais de uma condição no corpo.
        Comparator<Produto> compV1 = (p1, p2) -> {
            return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        };
        // Versão 2
        // Passando a expressão Lambda direto, sem o abre e fecha chaves, ideal para quando precisamos passar somente um parametro.
        Comparator<Produto> compV2 = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

        // Versão 3
        // Versão mais clara e concisa comparando com uma função estática da classe Comparator.
        Comparator<Produto> compV3 = Comparator.comparing(p -> p.getNome().toUpperCase());

        produtoList.sort(compV3);

        for (Produto p : produtoList) {
            System.out.println(p);
        }
    }
}
