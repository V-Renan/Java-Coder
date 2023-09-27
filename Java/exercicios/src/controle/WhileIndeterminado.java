package controle;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/26/2023$
 * Description:
 */
public class WhileIndeterminado {


    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        String op = "";

//        while (!op.equalsIgnoreCase("sair")) {
//            System.out.print("Digite algo: ");
//            op = entrada.next();
//
//            if (op.equalsIgnoreCase("sair")) {
//                System.out.println("Até a próxima!");
//            }
//        }

        while (!isOpcaoSair(op)) {
            System.out.print("Digite algo: ");
            op = entrada.next();

            if (isOpcaoSair(op)) {
                sair();
                //System.out.println("Até a próxima!");
            }
        }

        entrada.close();
    }

    private static boolean isOpcaoSair(String op) {
        return op.equalsIgnoreCase("sair");
    }

    private static void sair() {
        System.out.println("Até a próxima!");
        System.exit(0);
    }

}
