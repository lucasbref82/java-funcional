package estudo_1.fixacao.main;

import estudo_1.fixacao.entidades.Funcionario;
import estudo_1.fixacao.service.ArquivoService;
import estudo_1.fixacao.service.FuncionarioService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String caminho = "C:\\temp\\Arquivo.txt";

        List<Funcionario> funcionarios = new ArrayList<>();

        ArquivoService arquivoService = new ArquivoService();
        arquivoService.trataArquivoEPopulaLista(caminho, funcionarios);

        System.out.println("Digite um valor para que seja exibido o e-mail dos funcionários com o salário maior que o digitado: ");
        BigDecimal valorSalario = sc.nextBigDecimal();

        FuncionarioService funcionarioService = new FuncionarioService();
        funcionarioService.printaEmailsFiltrados(funcionarios, valorSalario);
        funcionarioService.filtraESomaSalarios(funcionarios, f -> f.getNome().charAt(0) == 'M');
    }

}
