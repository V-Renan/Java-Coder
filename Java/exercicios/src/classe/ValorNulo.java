package classe;

/**
 * @author Victor$
 * @date 9/29/2023$
 * Description:
 */
public class ValorNulo {

    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!"));

        Data d1 = Math.random() > 0.5 ? new Data() : null;
        if (d1 != null) {
            d1.dia = 3;
            System.out.println(d1.dia);
        }

        String s2 = Math.random() > 0.5 ? "Opa" : null;
        if (s2 != null) {
            System.out.println(s2.concat("###"));

        }

    }
}
