package br.com.victor.cm.modelo;

import br.com.victor.cm.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Victor$
 * @date 11/7/2023$
 * Description:
 */
public class Tabuleiro {

    private int linhas;
    private int colunas;
    private int minas;

    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarVizinhos();
        sortearMinas();
    }

    public void abrir(int linha, int conluna) {
        try {
            campos.parallelStream()
                    .filter(c -> c.getLinha() == linha && c.getColuna() == conluna)
                    .findFirst()
                    .ifPresent(Campo::abrir);
        } catch (ExplosaoException e) {
            campos.forEach(c -> c.setAberto(true));
            throw e;
        }
    }

    public void alternarMarcacao(int linha, int conluna) {
        campos.parallelStream()
                .filter(c -> c.getLinha() == linha && c.getColuna() == conluna)
                .findFirst()
                .ifPresent(Campo::alternarMarcacao);
    }

    private void gerarCampos() {
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                campos.add(new Campo(l, c));
            }
        }
    }

    private void associarVizinhos() {
        for (Campo c1 : campos) {
            for (Campo c2 : campos) {
                c1.adicionarVizinho(c2);
            }
        }
    }
    
    private void sortearMinas() {
        long minasArmadas = 0;
        Predicate<Campo> minado = Campo::isMinado;
        do {
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();
        } while (minasArmadas < minas);
    }

    public boolean objetivoAlcancado() {
        return campos.stream().allMatch(Campo::objetivoAlcancado);
    }

    public void reiniciar() {
        campos.stream().forEach(Campo::reiniciar);
        sortearMinas();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("  ");
        for (int c = 0; c < colunas; c++) {
            sb.append(" ");
            sb.append(c);
            sb.append(" ");
        }
        sb.append("\n");

        int i = 0;
        for (int l = 0; l < linhas; l++) {
            sb.append(l);
            sb.append(" ");
            for (int c = 0; c < colunas; c++) {
                sb.append(" ");
                sb.append(campos.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
