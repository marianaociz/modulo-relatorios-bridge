package implementacao;

import java.util.List;

/**
 * Lado da IMPLEMENTAÇÃO do padrão Bridge.
 *
 * Define o contrato que qualquer formato de exportação (PDF, Excel, HTML, ou
 * um formato futuro qualquer) deve cumprir. A classe abstrata Relatorio
 * (lado da Abstração) conhece apenas esta interface — nunca uma classe
 * concreta de exportador — o que permite que os dois lados evoluam de
 * forma independente.
 */
public interface FormatoExportacao {

    void desenharCabecalho(String titulo);

    void desenharCorpo(List<String> dados);

    void finalizarArquivo();
}
