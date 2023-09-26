package controle;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/26/2023$
 * Description:
 */
public class If {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua média: ");
        double media = scan.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        } else if (media < 7 && media >= 4.5) {
            System.out.println("Recuperação!");
        } else if (media < 4.5 && media >= 0) {
            System.out.println("Reprovado!");
        }
        scan.close();
    }
}
