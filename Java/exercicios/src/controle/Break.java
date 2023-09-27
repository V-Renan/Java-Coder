package controle;

/**
 * @author Victor$
 * @date 9/27/2023$
 * Description:
 */
public class Break {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }
        System.out.println("Fim!");
    }
}
