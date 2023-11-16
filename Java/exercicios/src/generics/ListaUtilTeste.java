package generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Victor$
 * @date 11/16/2023$
 * Description:
 */
public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> lang = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(lang);
        System.out.println(ultimaLinguagem);

        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);

        //          Usando Generics
        List<String> linguagens = Arrays.asList("Java", "Python", "Flutter");
        String ultimaLang = ListaUtil.getUltimo2(linguagens);
        System.out.println(ultimaLang);
    }
}
