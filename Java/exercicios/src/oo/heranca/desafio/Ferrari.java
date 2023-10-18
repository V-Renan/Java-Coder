package oo.heranca.desafio;


/**
 * @author Victor$
 * @date 10/17/2023$
 * Description:
 */
public class Ferrari extends Carro{

    public Ferrari() {
        this(350);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }

//   @Override
//   public void acelerar() {
//       super.acelerar();
//   }
}
