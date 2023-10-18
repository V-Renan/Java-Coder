package oo.heranca.desafio;

/**
 * @author Victor$
 * @date 10/17/2023$
 * Description:
 */
public class Carro {

    final int VELOCIDADE_MAXIMA;

    int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    int velocidadeAtual = 20;


    void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
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
