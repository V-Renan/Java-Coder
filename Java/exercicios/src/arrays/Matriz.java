package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/29/2023$
 * Description:
 */
public class Matriz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdAlunos = scan.nextInt();
        System.out.print("Quantas notas por aluno? ");
        int qtdNotas = scan.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double soma = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a %dª nota do %dª aluno: ", j + 1, i + 1);
                notasDaTurma[i][j] = scan.nextDouble();
                soma += (notasDaTurma[i][j]);
            }
        }
        double media = soma / (qtdAlunos * qtdNotas);
        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
        System.out.println("Média da turma: " + media);

        scan.close();
    }
}
