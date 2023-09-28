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

    static String teste = "imprimindo teste!";

    public Data(){
        dia = 1;
        mes = "Janeiro";
        ano = 1970;
    }

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
