package oo.heranca.desafio;


/**
 * @author Victor$
 * @date 10/17/2023$
 * Description:
 */
public class Ferrari extends Carro{

    Ferrari() {
        this(350);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }

//    @Override
//    void acelerar() {
//        super.acelerar();
//    }
}
