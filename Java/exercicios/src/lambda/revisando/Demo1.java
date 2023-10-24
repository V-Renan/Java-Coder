package lambda.revisando;

/**
 * @author Victor$
 * @date 10/23/2023$
 * Description:
 */
public class Demo1 {

    public static void main(String[] args) {
//        Calculo soma = new Somar();
//        Calculo mult = new Multiplicar();
//        System.out.println(soma.executar(5, 5));
//        System.out.println(mult.executar(2, 2));

        Calculo calc = new Somar();
        System.out.println(calc.executar(5, 5));

        calc = new Multiplicar();
        System.out.println(calc.executar(2, 2));

        calc = new Dividir();
        System.out.println(calc.executar(12, 2));
    }
}
