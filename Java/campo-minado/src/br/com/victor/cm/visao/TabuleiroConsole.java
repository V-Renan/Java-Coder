package br.com.victor.cm.visao;

import br.com.victor.cm.excecao.ExplosaoException;
import br.com.victor.cm.excecao.SairException;
import br.com.victor.cm.modelo.Tabuleiro;
import org.xml.sax.SAXException;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/14/2023$
 * Description:
 */
public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner scan = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo() {
        try {
            boolean continuar = true;

            while (continuar) {
                cicloDoJogo();
                System.out.print("Outra partida? (S/n) ");
                String resposta = scan.nextLine();

                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e) {
            System.out.println("Programa encerrado!!");
        } finally {
            scan.close();
        }
    }

    private void cicloDoJogo() {
        try {

            while (!tabuleiro.objetivoAlcancado()) {
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digite (x, y): ");

                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                        .map(e -> Integer.parseInt(e.trim()))
                        .iterator();

                digitado = capturarValorDigitado("1 - Abrir ou 2 - (des)Marcar: ");

                if ("1".equals(digitado)) {
                    tabuleiro.abrir(xy.next(), xy.next());
                } else if ("2".equals(digitado)) {
                    tabuleiro.alternarMarcacao(xy.next(), xy.next());
                }
            }

            System.out.println(tabuleiro);
            System.out.println("Você ganhou!");
        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("Você perdeu!");
        }
    }

    private String capturarValorDigitado(String texto) {
        System.out.println(texto);
        String digitado = scan.nextLine();

        if ("sair".equalsIgnoreCase(digitado)) {
            throw new SairException();
        }
        return digitado;
    }

}
