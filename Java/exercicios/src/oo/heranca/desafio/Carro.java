package oo.heranca.desafio;

/**
 * @author Victor$
 * @date 10/17/2023$
 * Description:
 */
public class Carro {

    public final int VELOCIDADE_MAXIMA;

    private int delta = 5;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    protected int velocidadeAtual;


    public void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

    public void frear() {
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
