package br.com.victor.cm;

import br.com.victor.cm.modelo.Tabuleiro;
import br.com.victor.cm.visao.TabuleiroConsole;

/**
 * @author Victor$
 * @date 11/14/2023$
 * Description:
 */
public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);

        new TabuleiroConsole(tabuleiro);
    }
}
