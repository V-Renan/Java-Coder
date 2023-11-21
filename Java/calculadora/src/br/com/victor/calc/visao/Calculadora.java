package br.com.victor.calc.visao;

import javax.swing.*;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class Calculadora extends JFrame {

    int menor;

    public Calculadora() {

        setSize(232,322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
