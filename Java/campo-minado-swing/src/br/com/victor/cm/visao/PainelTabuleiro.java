package br.com.victor.cm.visao;

import br.com.victor.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro) {

        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCada(c -> add(new BotaoCampo(c)));
        tabuleiro.registrarObservador(e -> {

            SwingUtilities.invokeLater(() -> {
                if (e.isGanhou()) {
                    JOptionPane.showMessageDialog(this, "Ganhou! :)");
                } else {
                    JOptionPane.showMessageDialog(this, "Perdeu! :(");
                }

                tabuleiro.reiniciar();
            });
        });
    }
}
