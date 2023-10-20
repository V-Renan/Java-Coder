package oo.abstrato;

import java.awt.*;

/**
 * @author Victor$
 * @date 10/19/2023$
 * Description:
 */
public abstract class Mamifero extends Animal {

    public abstract String mamar();

    @Override
    public String mover() {
        return "Saíndo do lugar";
    }
}
