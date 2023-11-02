package streams;

import java.util.List;

/**
 * @author Victor$
 * @date 11/2/2023$
 * Description:
 */
public class Media {

   private double total;
   private int quantidade;

   public Media adicionar(double valor) {
       total += valor;
       quantidade++;
       return this;
   }

   public double getValor() {
       return total / quantidade;
   }

   public static Media combinar(Media m1, Media m2) {
       Media resultante = new Media();
       resultante.total = m1.total + m2.total;
       resultante.quantidade = m1.quantidade + m2.quantidade;
       return resultante;
   }

    public static void adcionarAluno(List<Aluno> alunos, Aluno novoAluno) {
        alunos.add(novoAluno);
    }
}
