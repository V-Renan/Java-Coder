package lambda.revisando2;

/**
 * @author Victor$
 * @date 19/02/2024$
 * Description:
 */
public class CalculoTeste {
    public static void main(String[] args) {
        Calculo calc = new Somar();
        System.out.println(calc.executar(2,3));

        calc = new Multiplicar();
        System.out.println(calc.executar(2,3));

    }
}
