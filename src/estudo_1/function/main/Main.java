package estudo_1.function.main;

import estudo_1.function.entidades.Produto;
import estudo_1.function.util.NomeMaiusculo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(new Produto("Tv", BigDecimal.valueOf(900.00)));
        produtoList.add(new Produto("Notebook", BigDecimal.valueOf(1200.00)));
        produtoList.add(new Produto("Tablet", BigDecimal.valueOf(450.00)));
        produtoList.add(new Produto("Computador", BigDecimal.valueOf(1700.00)));

        List<String> nomesV1 = produtoList.stream().map(new NomeMaiusculo()).toList();
        List<String> nomesV2 = produtoList.stream().map(Produto::nomeProdutoCaixaAltaEstatico).toList();
        List<String> nomesV3 = produtoList.stream().map(Produto::nomeProdutoCaixaAltaNaoEstatico).toList();

        Function<Produto, String> funcaoConverteParaMaiusculo = p -> p.getNome().toUpperCase();
        List<String> nomesV4 = produtoList.stream().map(funcaoConverteParaMaiusculo).toList();

        produtoList.stream().map(p -> p.getNome().toUpperCase()).forEach(System.out::println);

    }
}

