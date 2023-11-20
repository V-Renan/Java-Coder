package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(500, 300);
        janela.setLayout(new BorderLayout());
        janela.setLocationRelativeTo(null);  // Centralizar na tela!

        JButton botaoClicar = new JButton("Clicar");
        janela.add(botaoClicar, BorderLayout.NORTH);

        botaoClicar.addActionListener(e -> {
            System.out.println("Evento Ocorreu!!!");
        });

        JButton botaoSair = new JButton("Sair");
        janela.add(botaoSair, BorderLayout.SOUTH);

        botaoSair.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Até logo!");
                System.exit(0);
            }
        });

        janela.setVisible(true);
    }
}
