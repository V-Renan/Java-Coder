package streams.desafio;

import java.util.Arrays;
import java.util.List;

/**
 * @author Victor$
 * @date 10/28/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3900.00, 0.20, 50.00);
        Produto p2 = new Produto("Pepsi Black", 5.00, 0.32, 0.0);
        Produto p3 = new Produto("SSD 1TB", 299.20, 0.50, 0.0);
        Produto p4 = new Produto("Teclado mecânico 60%", 127.24, 0.35, 0.0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

        produtos.stream()
                .filter(Utilitarios.desconto30)
                .filter(Utilitarios.freteGratis)
                .filter(Utilitarios.precoFinal)
                .map(Utilitarios.promocao)
                .forEach(System.out::println);


    }
}
