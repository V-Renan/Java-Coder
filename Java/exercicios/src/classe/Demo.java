package classe;
import java.util.Scanner;


/**
 * @author Victor$
 * @date 9/28/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Data data = new Data(7, "Setembro", 1999);
        Data data1 = new Data();
        data1.mes = "Fevereiro";

        System.out.println(data.imprimirData());
        System.out.println(data1.imprimirData());

        Pessoas pessoa = new Pessoas();

        System.out.print("Digite seu nome: ");
        pessoa.setNome(scan.next());
        System.out.print("Digite seu CPF: ");
        pessoa.setCpf(scan.nextLong());
        System.out.print("Digite sua idade: ");
        pessoa.setIdade(scan.nextInt());
        System.out.print("Digite sua altura: ");
        pessoa.setAltura(scan.nextDouble());
        System.out.print("Digite seu celular: ");
        pessoa.setCelular(scan.nextLong());

        System.out.println(pessoa.imprimirPessoas());

        System.out.println("----------------------");

        System.out.println(Data.teste);

        System.out.println("--------------------------------");
        System.out.println(data.imprimirData());

        scan.close();
    }

}
