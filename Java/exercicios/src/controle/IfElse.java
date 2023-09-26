package controle;

import javax.swing.*;
import java.awt.*;

/**
 * @author Victor$
 * @date 9/26/2023$
 * Description:
 */
public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número:");

        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Número PAR!",
                    "PAR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Número ÍMPAR!",
                    "ÍMPAR", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}