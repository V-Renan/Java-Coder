package colecoes;

import java.util.ArrayList;

/**
 * @author Victor$
 * @date 10/3/2023$
 * Description:
 */
public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Victor");
        lista.add(u1);
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println("Exibindo usuário pelo index: " + lista.get(3));

        lista.remove(1);
        System.out.println(lista.remove(new Usuario("Bia")));

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
        //System.out.println("Tem? " + lista.contains(u1));

        for (Usuario u : lista) {
            System.out.println(u);
        }
    }
}
