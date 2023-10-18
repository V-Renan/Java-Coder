package oo.encapsulamento;

/**
 * @author Victor$
 * @date 10/18/2023$
 * Description:
 */
public class DemoPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Victor", "Renan", 20);
        p1.setIdade(24);
        System.out.println(p1.getIdade()); // ler
        System.out.println(p1.getNomeCompleto());
        System.out.println(p1); // toString
    }
}
