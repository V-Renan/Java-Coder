package teste.umpraum;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Victor$
 * @date 12/12/2023$
 * Description:
 */
public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Victor", "victor@lanche.com.br");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("O Id gerado foi: " + novoUsuario.getId());

        em.close();
        emf.close();
    }
}
