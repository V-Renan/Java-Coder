package oo.composicao;

/**
 * @author Victor$
 * @date 10/3/2023$
 * Description:
 */
public class Motor {

    final Carro carro;

    Motor(Carro carro) {
        this.carro = carro;
    }

    boolean ligado = false;

    double fatorInjecao = 1;

    int giros() {
        if (!ligado) {
            return 0;
        }
        return (int) Math.round(fatorInjecao * 3000);
    }
}
