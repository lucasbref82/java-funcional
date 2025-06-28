package consumer.util;

import consumer.entidades.Produto;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Produto> {

    @Override
    public void accept(Produto produto) {
        produto.setValor(produto.getValor().multiply(new BigDecimal("1.1")));
    }
}
