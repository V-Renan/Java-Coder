package lambda;

/**
 * @author Victor$
 * @date 10/20/2023$
 * Description:
 */
public class DemoCalculo1 {

    public static void main(String[] args) {

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2,3));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(2,3));
    }
}
