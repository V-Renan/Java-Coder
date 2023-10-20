package oo.abstrato;


/**
 * @author Victor$
 * @date 10/19/2023$
 * Description:
 */
public class Cachorro extends Mamifero {

    @Override
    public String mover() {
        return "Usando as patas";
    }

    @Override
    public String mamar() {
        return "Usando leite";
    }
}
