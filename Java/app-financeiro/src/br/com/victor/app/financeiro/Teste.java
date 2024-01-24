package br.com.victor.app.financeiro;

import br.com.victor.app.Calculadora;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

/**
 * @author Victor$
 * @date 17/01/2024$
 * Description:
 */
public class Teste {

    public static void main(String[] args) {

        Calculadora calc = ServiceLoader.load(Calculadora.class)
                .findFirst()
                .get();
        System.out.println(calc.soma(2, 3, 4));

//        OperacoesAritimeticas op = new OperacoesAritimeticas();
//        System.out.println(op.soma(4, 5, 6));


        try {
            Field fieldId = calc.getClass().getDeclaredFields()[0];
            fieldId.setAccessible(true);
            fieldId.set(calc, "def");
            fieldId.setAccessible(false);

            System.out.println(calc.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
