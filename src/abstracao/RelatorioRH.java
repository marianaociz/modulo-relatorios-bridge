package abstracao;

import implementacao.FormatoExportacao;

import java.util.Arrays;
import java.util.List;

/**
 * Especialização concreta de Relatorio para o Relatório de Desempenho de RH.
 * Mesmo princípio da RelatorioVendas: recebe o exportador via construtor,
 * sem jamais instanciar uma implementação concreta diretamente.
 */
public class RelatorioRH extends Relatorio {

    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        List<String> dados = Arrays.asList(
                "João Silva - Desempenho: 92%",
                "Mariana Souza - Desempenho: 88%",
                "Carlos Pereira - Desempenho: 95%"
        );

        exportador.desenharCabecalho("Relatório de Desempenho de RH");
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }
}
