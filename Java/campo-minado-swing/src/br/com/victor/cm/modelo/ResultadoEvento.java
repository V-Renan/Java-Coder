package br.com.victor.cm.modelo;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class ResultadoEvento {

    private final boolean ganhou;

    public ResultadoEvento(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public boolean isGanhou() {
        return ganhou;
    }
}
