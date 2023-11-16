package generics;

import java.util.List;

/**
 * @author Victor$
 * @date 11/16/2023$
 * Description:
 */
public class ListaUtil {

    public static Object getUltimo1(List<?> lista) {
        return lista.get(lista.size() -1);
    }

    public static <T> T getUltimo2(List<T> lista) {
        return lista.get(lista.size() -1);
    }

//    public static <A, B, C> C teste(A paramA, B para,B) {
//        C teste = null;
//        return teste;
//    }
}
