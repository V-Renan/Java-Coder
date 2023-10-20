package oo.polimorfismo;

/**
 * @author Victor$
 * @date 10/18/2023$
 * Description:
 */
public abstract class Comida {

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
