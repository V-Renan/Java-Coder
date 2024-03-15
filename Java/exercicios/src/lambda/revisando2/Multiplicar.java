package lambda.revisando2;

/**
 * @author Victor$
 * @date 19/02/2024$
 * Description:
 */
public class Multiplicar implements Calculo{
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
