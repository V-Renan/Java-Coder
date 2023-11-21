package praticando;

/**
 * @author Victor$
 * @date 11/21/2023$
 * Description:
 */
public class Matriz extends UtilitariosMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
                {12,14,18},
                {17,13,20},
                {10,21,22}
        };

        int menor = menorNumero(matriz);
        int maior = maiorNumero(matriz);

        mostrarMatriz(matriz);
        imprimirResultado(maior, menor);
    }
}
