package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

/**
 * @author Victor$
 * @date 10/18/2023$
 * Description:
 */
public class Pedro extends Ana {

    Ana mae = new Ana();
    void testeAcessos() {
        //System.out.println(mae.segredo);
        //System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}
