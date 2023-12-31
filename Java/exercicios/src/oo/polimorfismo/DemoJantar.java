package oo.polimorfismo;

/**
 * @author Victor$
 * @date 10/18/2023$
 * Description:
 */
public class DemoJantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);
        Sorvete sobremesa = new Sorvete(0.4);

        Coxinha ingrediente3 = new Coxinha(0.3);

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);
        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());
    }
}
