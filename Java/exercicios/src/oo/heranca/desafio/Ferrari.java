package oo.heranca.desafio;


/**
 * @author Victor$
 * @date 10/17/2023$
 * Description:
 */
public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    @Override
    public int velocidadeDoAr() {
        return 2;
    }

    public Ferrari() {
        this(350);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
      ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }

    //   @Override
//   public void acelerar() {
//       super.acelerar();
//   }
}
