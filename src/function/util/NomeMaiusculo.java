package function.util;

import function.entidades.Produto;

import java.util.function.Function;

public class NomeMaiusculo implements Function<Produto, String> {
    @Override
    public String apply(Produto produto) {
        return produto.getNome().toUpperCase();
    }
}
