package fundamentos;

/**
 * @author Victor$
 * @date 9/23/2023$
 * Description:
 */
public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1; //implicita
        System.out.println(a);

        float b = (float) 1.01234327888889; //explicita (CAST)
        System.out.println(b);

        int c = 128;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e;
        System.out.println(f);
    }
}
