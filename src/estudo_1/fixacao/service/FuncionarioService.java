package estudo_1.fixacao.service;

import estudo_1.fixacao.entidades.Funcionario;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

public class FuncionarioService {

    public void filtraESomaSalarios(List<Funcionario> funcionarios, Predicate<Funcionario   > predicate) {
        BigDecimal somaSalarios = funcionarios
                .stream()
                .filter(predicate)
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("A soma dos salários dos funcionarios que começam com a letra M é: " + String.format("%.2f", somaSalarios));
    }

    public void printaEmailsFiltrados(List<Funcionario> funcionarios, BigDecimal valorSalario) {
        System.out.println("Email das pessoas que recebem mais que: " + valorSalario);

        List<String> emails = funcionarios
                .stream()
                .filter(x -> x.getSalario().compareTo(valorSalario) > 0)
                .map(Funcionario::getEmail)
                .toList();

        emails.forEach(System.out::println);
    }
}
