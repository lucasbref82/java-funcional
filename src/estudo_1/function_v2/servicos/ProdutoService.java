package estudo_1.function_v2.servicos;

import estudo_1.function_v2.entidades.Produto;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

public class ProdutoService {

    public BigDecimal filtraPrecos(List<Produto> produtos, Predicate<Produto> predicate) {
        BigDecimal total = BigDecimal.ZERO;
        for (Produto produto : produtos) {
            if (predicate.test(produto)) total = total.add(produto.getValor());
        }
        return total;
    }
}
