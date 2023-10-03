package colecoes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Victor$
 * @date 10/3/2023$
 * Description:
 */
public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Victor");
        usuarios.put(2, "Renan");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Victor"));

        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(2, "Joao"));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " - ");
            System.out.println(registro.getValue());
        }
    }
}
