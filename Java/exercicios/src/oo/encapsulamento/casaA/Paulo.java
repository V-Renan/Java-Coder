package oo.encapsulamento.casaA;

/**
 * @author Victor$
 * @date 10/18/2023$
 * Description:
 */
public class Paulo {

    void testeAcessos() {
        Ana esposa = new Ana();
        //System.out.println(esposa.segredo); #private
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
