package function_v2.main;

import function_v2.entidades.Produto;
import function_v2.servicos.ProdutoService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(new Produto("Tv", BigDecimal.valueOf(900.00)));
        produtoList.add(new Produto("Notebook", BigDecimal.valueOf(1200.00)));
        produtoList.add(new Produto("Tablet", BigDecimal.valueOf(450.00)));
        produtoList.add(new Produto("Computador", BigDecimal.valueOf(1700.00)));

        ProdutoService produtoService = new ProdutoService();

        BigDecimal soma = produtoService.filtraPrecos(produtoList, p -> p.getValor().compareTo(BigDecimal.valueOf(1000L)) >= 0);

        System.out.println("Soma total dos produtos que começam com T: " + String.format("%.2f", soma));
    }
}
