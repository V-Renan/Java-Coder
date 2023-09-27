package controle;


import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/26/2023$
 * Description:
 */
public class DoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Você quer sair? ");
            texto = scan.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Até logo!");
        scan.close();
    }
}
