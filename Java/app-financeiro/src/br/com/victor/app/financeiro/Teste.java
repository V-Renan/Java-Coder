package br.com.victor.app.financeiro;

import br.com.victor.app.calculo.Calculadora;
import br.com.victor.app.calculo.interno.OperacoesAritimeticas;

/**
 * @author Victor$
 * @date 17/01/2024$
 * Description:
 */
public class Teste {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(2, 3, 4));

        OperacoesAritimeticas op = new OperacoesAritimeticas();
        System.out.println(op.soma(4, 5, 6));
    }
}
