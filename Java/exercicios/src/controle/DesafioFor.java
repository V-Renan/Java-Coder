package controle;

/**
 * @author Victor$
 * @date 9/27/2023$
 * Description:
 */
public class DesafioFor {

    public static void main(String[] args) {

        String valor = "#";
        for (int i=1; i<=5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
