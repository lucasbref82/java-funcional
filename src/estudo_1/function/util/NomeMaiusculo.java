package estudo_1.function.util;

import estudo_1.function.entidades.Produto;

import java.util.function.Function;

public class NomeMaiusculo implements Function<Produto, String> {
    @Override
    public String apply(Produto produto) {
        return produto.getNome().toUpperCase();
    }
}
