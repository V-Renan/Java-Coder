package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Victor$
 * @date 13/12/2023$
 * Description:
 */
public class AlterarUsuario3 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 8L);
        em.detach(usuario);

        usuario.setNome("Renan");

        em.merge(usuario);

        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
