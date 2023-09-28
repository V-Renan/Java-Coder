package classe;

/**
 * @author Victor$
 * @date 9/28/2023$
 * Description:
 */
public class AreaCirc {

    double raio;

    final static double PI = 3.14;

    public AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);

    }
}
