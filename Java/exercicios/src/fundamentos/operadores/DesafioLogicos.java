package fundamentos.operadores;

/**
 * @author Victor$
 * @date 9/25/2023$
 * Description:
 */
public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terca (V ou F)
        // Tabralho na quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTv50);
        System.out.println("Comprou TV 32\"? " + comprouTv32);
        System.out.println("Comprou TV sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);
    }
}
