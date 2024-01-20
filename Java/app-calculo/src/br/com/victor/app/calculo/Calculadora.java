package br.com.victor.app.calculo;

import br.com.victor.app.calculo.interno.OperacoesAritimeticas;
import br.com.victor.app.logging.Logger;

/**
 * @author Victor$
 * @date 17/01/2024$
 * Description:
 */
public class Calculadora {

    private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

    public Double soma(double... nums) {
        Logger.info("Somando...");
        return opAritimeticas.soma(nums);
    }
}
