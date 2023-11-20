package br.com.victor.cm.visao;

import br.com.victor.cm.modelo.Tabuleiro;

import javax.swing.*;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);

        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }

}
