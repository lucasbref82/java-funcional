package estudo_1.fixacao.service;

import estudo_1.fixacao.entidades.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public class ArquivoService {
    public void trataArquivoEPopulaLista(String caminho, List<Funcionario> funcionarios) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho))) {
            String linha = bufferedReader.readLine();
            while(linha != null) {
                String[] campos = linha.split(",");
                funcionarios.add(new Funcionario(campos[0], campos[1], new BigDecimal(campos[2])));
                linha = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao tentar processar dados: " + e.getMessage());
        }
    }
}
