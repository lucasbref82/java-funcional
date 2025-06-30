package estudo_1.consumer.util;

import estudo_1.consumer.entidades.Produto;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Produto> {

    @Override
    public void accept(Produto produto) {
        produto.setValor(produto.getValor().multiply(new BigDecimal("1.1")));
    }
}
