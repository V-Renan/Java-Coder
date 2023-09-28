package classe;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/28/2023$
 * Description:
 */
public class Data {



    int dia;

    String mes;

    int ano;


    public Data(int dia, String mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String imprimirData() {
        return "Data: Dia " + dia +
                " de " + mes +
                " de " + ano;
    }

}
