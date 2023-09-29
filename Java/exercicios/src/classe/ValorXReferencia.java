package classe;

/**
 * @author Victor$
 * @date 9/28/2023$
 * Description:
 */
public class ValorXReferencia {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.mes = "Setembro"; // Atribuição por valor
        Data d2 = d1; // Atribuição por referência

        d2.dia = 7; // Também altera o d1 pois ambos usam a mesma referência na memória

        System.out.println(d1.imprimirData());

        d2 = new Data();
        d2.dia = 4;
        System.out.println(d2.imprimirData());

        d1 = d2;
        if (d2.dia == 4) {
            d1.dia = d2.dia - 1;
        }
        System.out.println(d1.imprimirData());
        voltarDataParaValorPadrao(d1);

        System.out.println(d1.imprimirData());
        System.out.println(d2.imprimirData());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    public static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = "Janeiro";
        d.ano = 1970;
    }

    public static void alterarPrimitivo(int a) {
        a++;
    }
}
