package lambda.revisando;

/**
 * @author Victor$
 * @date 10/23/2023$
 * Description:
 */
public class Multiplicar implements Calculo{
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
