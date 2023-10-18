package oo.heranca;

/**
 * @author Victor$
 * @date 10/17/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);
//        heroi.x = 10;
//        heroi.y = 11;

        System.out.println("Monstro tem --> " + monstro.vida);
        System.out.println("Heroi tem --> " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem --> " + monstro.vida);
        System.out.println("Heroi tem --> " + heroi.vida);
    }
}
