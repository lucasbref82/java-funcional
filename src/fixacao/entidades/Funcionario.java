package fixacao.entidades;

import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario {

    private String nome;
    private String email;
    private BigDecimal salario;

    public Funcionario(String nome, String email, BigDecimal salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome) && Objects.equals(email, that.email) && Objects.equals(salario, that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, salario);
    }
}
