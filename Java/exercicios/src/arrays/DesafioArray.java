package arrays;

import java.util.Scanner;
/**
 * @author Victor$
 * @date 9/29/2023$
 * Description:
 */
public class DesafioArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas notas deseja informar? ");
        int qtdNotas = scan.nextInt();

        double[] notasAlunos = new double[qtdNotas];
        double soma = 0;
        double media = 0;

        for (int i=0; i < qtdNotas; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notasAlunos[i] = scan.nextDouble();
        }

        for (double notas : notasAlunos) {
            soma += notas;
            media = soma / qtdNotas;
        }

        System.out.println("Média: " + media);

        scan.close();
    }
}
