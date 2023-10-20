package oo.polimorfismo;

import oo.polimorfismo.Comida;

/**
 * @author Victor$
 * @date 10/18/2023$
 * Description:
 */
public class Pessoa {

    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
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
