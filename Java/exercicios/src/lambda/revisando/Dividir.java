package lambda.revisando;

/**
 * @author Victor$
 * @date 10/23/2023$
 * Description:
 */
public class Dividir implements Calculo{
    @Override
    public double executar(double a, double b) {
        return a / b;
    }

    static void meuImprirmir2(String nome) {
        System.out.println("Olá! Meu nome é " + nome);
    }
}
