package colecoes;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Victor$
 * @date 10/3/2023$
 * Description:
 */
public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "unchecked"}) // silenciado para entender as possibilidades
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');
        System.out.println("Tamanho: " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(false));
        System.out.println(conjunto.contains(true));
        System.out.println(conjunto);
        System.out.println("--------------------------------");

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        //conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
