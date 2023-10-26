package lambda.revisando;



import java.util.function.Function;
import java.util.function.UnaryOperator;


/**
 * @author Victor$
 * @date 10/25/2023$
 * Description:
 */
public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.50);

        /*
          * 1. A partir do produto calcular o preco real (com desconto)
          * 2. Imposto Municipal: >= 2500 (8.5%) | < 2500 (Isento)
          * 3. Frete: >= 3000 (100) | < 3000 (50)
          * 4. Arrendondar: Deixar duas casas decimais
          * 5. Formatar: R$1234,56
         */

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco + (preco * 8.5 / 100) : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arrendondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        String total = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arrendondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preco final é: " + total);
    }
}
