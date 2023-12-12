package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @author Victor$
 * @date 12/12/2023$
 * Description:
 */

@Entity
public class Usuario {

    @Id
    private Long id;
    private String nome;
    private String email;

    public Usuario() {

    }

    public Usuario(String nome, String email) {
        super();
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
