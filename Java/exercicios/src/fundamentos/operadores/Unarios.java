package fundamentos.operadores;

/**
 * @author Victor$
 * @date 9/25/2023$
 * Description:
 */
public class Unarios {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b;
        --b;
        System.out.println(a);
        System.out.println(b);

        System.out.println(++a == b--);
        System.out.println(a);
        System.out.println(b);
    }
}
