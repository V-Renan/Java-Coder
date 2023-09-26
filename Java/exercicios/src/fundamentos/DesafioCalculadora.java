package fundamentos;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/26/2023$
 * Description:
 */
public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double n1 = scan.nextDouble();
        System.out.print("Digite outro valor: ");
        double n2 = scan.nextDouble();
        System.out.print("Informe a operação: ");
        String op = scan.next();

        double resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2 : resultado;
        resultado = "*".equals(op) ? n1 * n2 : resultado;
        resultado = "/".equals(op) ? n1 / n2 : resultado;
        resultado = "%".equals(op) ? n1 % n2 : resultado;
        System.out.printf("%.2f %s %.2f = %.2f",
                n1, op, n2, resultado);

        scan.close();
    }
}
