package controle;


import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/27/2023$
 * Description:
 */
public class DesafioWhile {

    public static void main(String[] args) {

        int quantidadeNotas = 0;
        double total = 0;
        double nota = 0;
        double media = 0;
        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.print("Digite sua nota [ou -1 p/ sair]: ");
            nota = scan.nextDouble();
            if (nota == -1) {
                break;
            } else if (!isNotaValida(nota)) {
                System.out.println("Nota inválida, tente novamente!");
            } else if (isNotaValida(nota)) {
                total += nota;
                quantidadeNotas++;
                media = total / quantidadeNotas;

            }
        }

        scan.close();
        System.out.println("Média de notas: " + media);
        System.out.println("Total de notas válidas digitadas: " + quantidadeNotas);

    }

    private static boolean isNotaValida(double nota) {
        if (nota > 0 && nota <= 10) {
            return true;
        }
        return false;
    }
}
