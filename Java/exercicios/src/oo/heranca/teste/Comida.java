package oo.heranca.teste;

/**
 * @author Victor$
 * @date 10/18/2023$
 * Description:
 */
public class Comida {

    private double peso;

    public Comida(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (isPesoValido(getPeso())) {
            this.peso = peso;
        }
    }

    private boolean isPesoValido(double peso) {
        if (getPeso() >= 0) {
            return true;
        }
        return false;
    }
}
