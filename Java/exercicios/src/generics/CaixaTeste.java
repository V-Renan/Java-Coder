package generics;

/**
 * @author Victor$
 * @date 11/16/2023$
 * Description:
 */
public class CaixaTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo!");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1315);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
