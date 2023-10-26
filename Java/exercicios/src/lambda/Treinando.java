package lambda;

import lambda.revisando.Produto;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author Victor$
 * @date 10/26/2023$
 * Description:
 */
public class Treinando {

    //Produto p = new Produto("iPad", 3235.89, 0.50);

    /*
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8.5%) | < 2500 (Isento)
         * 3. Frete: >= 3000 (100) | < 3000 (50)
         * 4. Arrendondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
     */

    public static void main(String[] args) {

        Produto p1 = new Produto();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        p1.setNome(scan.next());
        System.out.print("Digite o preço do produto: ");
        p1.setPreco(scan.nextDouble());
        System.out.print("Digite o desconto como no exemplo --> [0.01]: ");
        p1.setDesconto(scan.nextDouble());

        Function<Produto, Double> precoFinal =
                produto -> p1.getPreco() * (1- p1.getDesconto());
        UnaryOperator<Double> imposto =
                preco -> preco >= 2500 ? preco * (1 - 1.085) : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        String total = precoFinal
                .andThen(imposto)
                    .andThen(frete)
                        .andThen(arredondar)
                                .andThen(formatar)
                                        .apply(p1);

        System.out.println("Valor total a ser pago: " + total);

        System.out.println("\n" + p1.toString());
        scan.close();
    }
}
