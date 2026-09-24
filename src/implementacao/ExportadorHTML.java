package implementacao;

import java.util.List;

/**
 * Implementação concreta do formato HTML.
 * Simula, via console, a geração de uma página HTML.
 */
public class ExportadorHTML implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[HTML] <h1>" + titulo + "</h1>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[HTML] <ul>");
        for (String dado : dados) {
            System.out.println("[HTML]   <li>" + dado + "</li>");
        }
        System.out.println("[HTML] </ul>");
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[HTML] Documento finalizado e salvo como relatorio.html");
    }
}
