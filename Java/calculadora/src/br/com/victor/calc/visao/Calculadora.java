package br.com.victor.calc.visao;

import javax.swing.*;
import java.awt.*;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class Calculadora extends JFrame {

    public Calculadora() {

        organizarLayout();

        setSize(232,322);
        /* - Remove a barra de opcoes do topo, no caso de querer criar uma propria barra para setar a cor.
        setUndecorated(true);
        */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
