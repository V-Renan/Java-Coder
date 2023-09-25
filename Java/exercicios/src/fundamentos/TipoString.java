package fundamentos;

/**
 * @author Victor$
 * @date 9/22/2023$
 * Description:
 */
public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá Mundo!!".charAt(4));

        String s = "Boa Tarde";
        System.out.println(s.toUpperCase());
        s = "Bom dia";

        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!");
        System.out.println(s.startsWith("b"));
        System.out.println(s.toUpperCase().startsWith("B"));
        System.out.println(s.endsWith("dia"));
        System.out.println(s.length());
        System.out.println(s.endsWith("bom dia"));
        System.out.println(s.equalsIgnoreCase("bom dia"));

        var nome = "Victor";
        var sobrenome = "Moura";
        var idade = 24;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);
        System.out.println("\n\n");
        System.out.printf("O senhor %S %S tem %d anos e ganha R$%.2f",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %S %S tem %d anos e ganha R$%.2f",
                nome, sobrenome, idade, salario);

        System.out.println(frase);

        System.out.println("Testando tipo string".contains("tipo"));
        System.out.println("Testando tipo string".indexOf("tipo"));
        System.out.println("Testando tipo string".hashCode());
        System.out.println("Testando tipo string || ".repeat(3));
        System.out.println("Testando tipo string".substring(9));
        System.out.println("Testando tipo string".substring(9, 13));
    }
}
