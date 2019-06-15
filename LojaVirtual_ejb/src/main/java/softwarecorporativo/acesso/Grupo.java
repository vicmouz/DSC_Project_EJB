/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.acesso;

import softwarecorporativo.entidade.Entidade;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author MarcosBrasil98
 */
@Entity
@Table(name = "tb_grupo")
@NamedQueries({
    @NamedQuery(name = Grupo.GRUPO_POR_NOME, query = "SELECT g FROM Grupo g WHERE g.nome = ?1")})
public class Grupo extends Entidade implements Serializable {
    public static final String GRUPO_POR_NOME = "GrupoPorNome";
    public static final String CLIENTE = "cliente";
    public static final String ADMINISTRADOR = "admin";
    @NotBlank
    @Size(max = 45)
    @Column(name = "TXT_NOME")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
