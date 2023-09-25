package fundamentos;

/**
 * @author Victor$
 * @date 9/21/2023$
 * Description:
 */
public class PrimeiroPrograma {

    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat(" !!!");
        System.out.println(s);

        System.out.println("victor".toUpperCase());

        String y = "Bom dia X".replace("X", "Victor");
        System.out.println(y.toUpperCase());
    }
}
