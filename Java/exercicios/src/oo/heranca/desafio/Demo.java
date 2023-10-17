package oo.heranca.desafio;

/**
 * @author Victor$
 * @date 10/17/2023$
 * Description:
 */
public class Demo {

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
    }
}
