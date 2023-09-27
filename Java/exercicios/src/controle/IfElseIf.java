package controle;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/26/2023$
 * Description:
 */
public class IfElseIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
            System.out.println("Parabéns!!");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } if (nota >= 4.1) {
            System.out.println("Conceito C");
        } if (nota >= 2.1) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }


        System.out.println("Fim!");
        entrada.close();
    }
}
