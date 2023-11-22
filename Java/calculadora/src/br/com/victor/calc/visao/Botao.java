package br.com.victor.calc.visao;

import javax.swing.*;
import java.awt.*;

/**
 * @author Victor$
 * @date 11/21/2023$
 * Description:
 */
public class Botao extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto);
        setFont(new Font("courier", Font.PLAIN, 25));
        setOpaque(true);
        setBackground(cor);
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
