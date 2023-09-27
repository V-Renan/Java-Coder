package controle;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/27/2023$
 * Description:
 */
public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String conceito = "";
        System.out.print("Digite sua nota: ");
        int nota = scan.nextInt();

        switch (nota) {
            case 10: case 9: conceito = "A";
                break;
            case 8: case 7: conceito = "B";
                break;
            case 6: case 5: conceito = "C";
                break;
            case 4: case 3: conceito = "D";
                break;
            case 2: case 1: conceito = "E";
                break;
            default:
                conceito = "Não encontrado!";
                break;

        }

        System.out.println("Conceito é " + conceito);
        scan.close();
    }
}
