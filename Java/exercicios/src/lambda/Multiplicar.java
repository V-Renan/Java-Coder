package lambda;

/**
 * @author Victor$
 * @date 10/20/2023$
 * Description:
 */
public class Multiplicar implements Calculo{
    @Override
    public double executar(double a, double b) {
        double resultado = a * b;
        return resultado;
    }
}
