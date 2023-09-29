package classe.desafioComida;

/**
 * @author Victor$
 * @date 9/29/2023$
 * Description:
 */
public class Pessoa {

     String nome;

     Double peso;

     public Pessoa() {

     }

     public Pessoa(String nome, Double peso) {
     this.nome = nome;
     this.peso = peso;
     }

    public void comer(Comida comida) {
         if (comida != null) {
             this.peso += comida.peso;
         }
    }

    public String apresentar() {
         return "Nome: " + nome +
                 "\nPeso: " + peso + "Kg";
    }
}
