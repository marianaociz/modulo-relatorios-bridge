package abstracao;

import implementacao.FormatoExportacao;

/**
 * Lado da ABSTRAÇÃO do padrão Bridge.
 *
 * Guarda a referência ao formato de exportação (a "ponte" para o lado da
 * Implementação) e delega a ele as operações de baixo nível. Relatorio
 * NUNCA instancia um exportador concreto diretamente (proibido usar "new"
 * aqui) — a dependência sempre chega de fora, via injeção pelo construtor.
 */
public abstract class Relatorio {

    protected FormatoExportacao exportador;

    protected Relatorio(FormatoExportacao exportador) {
        this.exportador = exportador;
    }

    /**
     * Permite trocar o formato de exportação em tempo de execução,
     * mantendo o mesmo objeto Relatorio. É essa flexibilidade que
     * comprova, na prática, o desacoplamento promovido pelo Bridge:
     * o relatório não sabe (e não precisa saber) qual implementação
     * concreta está por trás da interface FormatoExportacao.
     */
    public void setExportador(FormatoExportacao exportador) {
        this.exportador = exportador;
    }

    public abstract void gerarRelatorio();
}
