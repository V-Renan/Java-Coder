package controle;

/**
 * @author Victor$
 * @date 9/27/2023$
 * Description:
 */
public class ContinueRotulado {

    public static void main(String[] args) {

        externo:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == 1) {
                    continue externo;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim!");
    }
}
