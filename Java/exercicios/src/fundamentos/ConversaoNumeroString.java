package fundamentos;

/**
 * @author Victor$
 * @date 9/25/2023$
 * Description:
 */
public class ConversaoNumeroString {

    public static void main(String[] artgs) {

        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length() );


        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());
    }
}
