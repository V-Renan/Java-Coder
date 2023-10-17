package oo.heranca.desafio;

/**
 * @author Victor$
 * @date 10/17/2023$
 * Description:
 */
public class Carro {

    int velocidadeAtual = 20;

    void acelerar() {
        velocidadeAtual += 5;
    }

    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else  {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "Velocidade atual é --> " + velocidadeAtual + "Km/h.";
    }
}
