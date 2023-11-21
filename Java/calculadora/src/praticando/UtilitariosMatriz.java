package praticando;

/**
 * @author Victor$
 * @date 11/21/2023$
 * Description:
 */
public class UtilitariosMatriz {

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maiorNumero(int[][] matriz) {

        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }

    public static int menorNumero(int[][] matriz) {

        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }

    public static void imprimirResultado(int maior, int menor) {
        System.out.println("Maior número encontrado na matriz é: " + maior);
        System.out.println("Menor número encontrado na matriz é: " + menor);
    }
}
