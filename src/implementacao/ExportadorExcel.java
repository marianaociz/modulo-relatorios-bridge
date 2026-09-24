package implementacao;

import java.util.List;

/**
 * Implementação concreta do formato Excel (XLSX).
 * Simula, via console, a geração de uma planilha.
 */
public class ExportadorExcel implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[EXCEL] Célula A1 mesclada com o título -> " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[EXCEL] Preenchendo linhas da planilha:");
        int linha = 2;
        for (String dado : dados) {
            System.out.println("[EXCEL]   Linha " + linha + ": " + dado);
            linha++;
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[EXCEL] Planilha finalizada e salva como relatorio.xlsx");
    }
}
