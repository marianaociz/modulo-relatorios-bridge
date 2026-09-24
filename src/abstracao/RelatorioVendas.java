package abstracao;

import implementacao.FormatoExportacao;

import java.util.Arrays;
import java.util.List;

/**
 * Especialização concreta de Relatorio para o Relatório de Vendas.
 * Não faz "new" de nenhum exportador — apenas recebe um via construtor
 * (herdado de Relatorio) e o utiliza através da interface FormatoExportacao.
 */
public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        List<String> dados = Arrays.asList(
                "Produto A - R$ 12.500,00",
                "Produto B - R$ 8.300,00",
                "Produto C - R$ 21.750,00"
        );

        exportador.desenharCabecalho("Relatório de Vendas");
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }
}
