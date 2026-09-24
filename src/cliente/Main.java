package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;
import implementacao.ExportadorPDF;
import implementacao.FormatoExportacao;

/**
 * Classe cliente. É aqui que instâncias concretas de
 * FormatoExportacao são criadas com "new" — nas classes de abstracao
 * (Relatorio, RelatorioVendas, RelatorioRH) isso é proibido.
 *
 * Script de validação do desacoplamento promovido pelo Bridge, conforme
 * exigido na Fase 2 da atividade:
 *   1) Geração de um Relatório de Vendas em PDF.
 *   2) Alteração dinâmica, em tempo de execução, do MESMO relatório de
 *      vendas para o formato Excel.
 *   3) Geração de um Relatório de RH em HTML.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("========================================================");
        System.out.println("1) Geração do Relatório de Vendas em PDF");
        System.out.println("========================================================");
        FormatoExportacao pdf = new ExportadorPDF();
        Relatorio relatorioVendas = new RelatorioVendas(pdf); // injeção via construtor
        relatorioVendas.gerarRelatorio();

        System.out.println();
        System.out.println("========================================================");
        System.out.println("2) Troca dinâmica em tempo de execução: PDF -> Excel");
        System.out.println("   (mesmo objeto relatorioVendas, sem recriar o relatório)");
        System.out.println("========================================================");
        FormatoExportacao excel = new ExportadorExcel();
        relatorioVendas.setExportador(excel); // troca da implementação em runtime
        relatorioVendas.gerarRelatorio();

        System.out.println();
        System.out.println("========================================================");
        System.out.println("3) Geração do Relatório de RH em HTML");
        System.out.println("========================================================");
        FormatoExportacao html = new ExportadorHTML();
        Relatorio relatorioRH = new RelatorioRH(html); // injeção via construtor
        relatorioRH.gerarRelatorio();

        System.out.println();
        System.out.println("Execução concluída: mesma classe Relatorio, três formatos "
                + "diferentes, nenhuma subclasse por combinação relatório x formato.");
    }
}
