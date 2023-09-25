package fundamentos;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/25/2023$
 * Description:
 */
public class DesafioConversao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro salário: ");
        String valor1 = entrada.next().replace(",", ".");
        System.out.print("Informe o segundo salário: ");
        String valor2 = entrada.next().replace(",", ".");
        System.out.print("Informe o terceiro salário: ");
        String valor3 = entrada.next().replace(",", ".");

        Double salario1 = Double.parseDouble(valor1);
        Double salario2 = Double.parseDouble(valor2);
        Double salario3 = Double.parseDouble(valor3);

        double soma = salario1 + salario2 + salario3;
        double media = soma / 3;

        System.out.println("A soma dos três ultimos salário é: " + soma);
        System.out.println("A média salárial é: " + media);

        entrada.close();
    }
}
