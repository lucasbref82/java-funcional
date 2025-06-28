package predicate.entidades;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {
    private String nome;
    private BigDecimal valor;

    public Produto(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Produto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Nome do produto: " + this.nome + ", Valor do produto: " + this.getValor();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && Objects.equals(valor, produto.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor);
    }
}
