package fundamentos;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/26/2023$
 * Description:
 */
public class TipoStringEquals {

    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String s2 = entrada.next();

        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }
}
