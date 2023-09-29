package classe.desafioComida;

/**
 * @author Victor$
 * @date 9/29/2023$
 * Description:
 */
public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Açaí", 0.700);
        Comida c2 = new Comida();
        c2.setNome("Acarajé");
        c2.setPeso(1.0);
        Pessoa p1 = new Pessoa("Victor", 62.00);

        Pessoa p2 = new Pessoa();
        p2.setNome("Renan");
        p2.setPeso(61.00);

        System.out.println("-----------------ANTES-----------------");
        System.out.println(p1.apresentarPessoas());
        System.out.println("-----------------DEPOIS-----------------");
        p1.comer(c1);
        System.out.println(p1.apresentarPessoas());
        System.out.println(c1.imprimirComida());

        System.out.println("-----------------ANTES-----------------");
        System.out.println(p2.apresentarPessoas());
        System.out.println("-----------------DEPOIS-----------------");
        p2.comer(c2);
        System.out.println(p2.apresentarPessoas());
        System.out.println(c2.imprimirComida());


    }
}
