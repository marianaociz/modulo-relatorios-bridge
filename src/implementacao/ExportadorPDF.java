package implementacao;

import java.util.List;

/**
 * Implementação concreta do formato PDF.
 * Simula, via console, a geração de um arquivo PDF.
 */
public class ExportadorPDF implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[PDF] Cabeçalho renderizado com fonte serifada -> " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[PDF] Desenhando corpo do documento (páginas paginadas):");
        for (String linha : dados) {
            System.out.println("[PDF]   • " + linha);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[PDF] Arquivo finalizado e salvo como relatorio.pdf");
    }
}
