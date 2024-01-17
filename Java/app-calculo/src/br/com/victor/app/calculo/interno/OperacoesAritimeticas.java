package br.com.victor.app.calculo.interno;

import java.util.Arrays;

/**
 * @author Victor$
 * @date 17/01/2024$
 * Description:
 */
public class OperacoesAritimeticas {

    public Double soma(double... nums) {
        return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
    }
}
