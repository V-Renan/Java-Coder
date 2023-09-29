package classe.desafioComida;

/**
 * @author Victor$
 * @date 9/29/2023$
 * Description:
 */
public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Victor", 62.0);

        Comida c1 = new Comida("Açaí", 0.180);
        Comida c2 = new Comida("Arroz", 0.300);

        System.out.println(p1.apresentar());

        p1.comer(c1);
        System.out.println(p1.apresentar());

        p1.comer(c2);
        System.out.println(p1.apresentar());
    }
}
