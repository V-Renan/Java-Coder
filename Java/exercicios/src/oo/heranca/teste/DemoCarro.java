package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Golf;

/**
 * @author Victor$
 * @date 10/17/2023$
 * Description:
 */
public class DemoCarro {

    public static void main(String[] args) {

        Carro ferrari = new Ferrari();
        Carro golf = new Golf();

        System.out.println("Ferrari -- > " + ferrari.toString());
        System.out.println("Golf -- > " + golf.toString());

        System.out.println();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();
        System.out.println("Ferrari --> " + ferrari.toString());

        System.out.println();

        golf.acelerar();
        golf.frear();
        golf.frear();
        golf.frear();
        golf.frear();
        golf.frear();
        golf.frear();
        System.out.println("Golf --> " + golf.toString());

        System.out.println(ferrari.VELOCIDADE_MAXIMA);
        System.out.println(golf.VELOCIDADE_MAXIMA);
    }
}
