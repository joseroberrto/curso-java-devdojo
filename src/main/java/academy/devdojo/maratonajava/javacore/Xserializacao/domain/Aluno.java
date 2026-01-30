package academy.devdojo.maratonajava.javacore.Xserializacao.domain;

import java.io.Serial;
import java.io.Serializable;

public class Aluno  implements Serializable {
    @Serial
    private static final long serialVersionUID = -6839701713696250632L;
    private Integer id;
    private String nomr;
    private  transient String password;

    public Aluno(Integer id, String nomr, String password) {
        this.id = id;
        this.nomr = nomr;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomr() {
        return nomr;
    }

    public void setNomr(String nomr) {
        this.nomr = nomr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nomr='" + nomr + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
