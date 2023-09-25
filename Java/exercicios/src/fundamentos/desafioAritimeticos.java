package fundamentos;

/**
 * @author Victor$
 * @date 9/25/2023$
 * Description:
 */
public class desafioAritimeticos {

    public static void main(String[] args) {

//        int a = 3 * 4 - 10;
//        int b = (int) Math.pow(a, 3);
//        double c = (int) Math.pow(a, 3);
//
//        System.out.println(b);
//        System.out.println(Double.toString(c));

        System.out.println("--------DESAFIO ARITIMETICO--------");

        double numA = Math.pow((6 * (3 + 2)), 2);
        double denA = 3 * 2;
        double superiorA = numA / denA;
        System.out.println("Superior A: " + superiorA);

        double numB = (double) ((1 - 5) * (2 - 7)) / 2;
        double denB = 2;
        double superiorB = Math.pow(numB, denB);
        System.out.println("Superior B: " + superiorB);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);
        System.out.println("Inferior: " + inferior);

        double resultado = superior / inferior;
        System.out.println("Resultado: " + resultado);
    }

}
