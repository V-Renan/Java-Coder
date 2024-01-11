package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Victor$
 * @date 10/01/2024$
 * Description:
 */
@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno{

    private double valorBolsa;

    public AlunoBolsista() {

    }

    public AlunoBolsista(Long matricula, String nome, double valorBolsa) {
        super(matricula, nome);
        this.valorBolsa = valorBolsa;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}
