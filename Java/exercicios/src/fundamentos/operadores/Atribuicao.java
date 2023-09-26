package fundamentos.operadores;

/**
 * @author Victor$
 * @date 9/25/2023$
 * Description:
 */
public class Atribuicao {

    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b;
        c -= a; // c = c - a;
        c *= b; // c = c * b;
        c /= a; // c = c / b;

        c++; // c = c + 1;

        System.out.println(c);

        c %= 2; // c = c $ 2; 0 ou 1
        System.out.println(c);
    }
}
