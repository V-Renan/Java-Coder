package controle;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/26/2023$
 * Description:
 */
public class DesafioDiaSemana {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String diaSemana = scan.next().toLowerCase();

        if (diaSemana.equals("domingo")) {
            System.out.println(1);
        } else if (diaSemana.equals("segunda")) {
            System.out.println(2);
        } else if (diaSemana.equals("terça")
                || diaSemana.equals("terca")) {
            System.out.println(3);
        } else if (diaSemana.equals("quarta")) {
            System.out.println(4);
        } else if (diaSemana.equals("quinta")) {
            System.out.println(5);
        } else if (diaSemana.equals("sexta")) {
            System.out.println(6);
        } else if (diaSemana.equals("sabado")
                || diaSemana.equals("sábado")) {
            System.out.println(7);
        } else {
            System.out.println("Dia inválido!");
        }

//        switch (diaSemana.toLowerCase().trim()) {
//            case "domingo" -> System.out.println(1);
//            case "segunda" -> System.out.println(2);
//            case "terça" -> System.out.println(3);
//            case "quarta" -> System.out.println(4);
//            case "quinta" -> System.out.println(5);
//            case "sexta" -> System.out.println(6);
//            case "sábado" -> System.out.println(7);
//            default -> System.out.println("Opção inválida!");
//        }

        scan.close();
    }
}
