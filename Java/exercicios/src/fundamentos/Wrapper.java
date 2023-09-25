package fundamentos;

/**
 * @author Victor$
 * @date 9/23/2023$
 * Description:
 */
public class Wrapper {

    public static void main(String[] args) {


        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Integer j = Integer.parseInt("2000");
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(j);
        System.out.println(i * 3);
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
    }
}
