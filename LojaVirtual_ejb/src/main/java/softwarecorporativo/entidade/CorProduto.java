/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author marcosbrasil98
 */
@Entity
@Table(name="TB_CORPRODUTO")
@Access(AccessType.FIELD)
@NamedQueries(
        {
            @NamedQuery(
                    name = "CorProduto.PorNome",
                    query = "SELECT c FROM CorProduto c WHERE c.nome LIKE :nome ORDER BY c.tipo"),
            
            @NamedQuery(
                    name = "CorProduto.PorTipo",
                    query = "SELECT c FROM CorProduto c WHERE c.tipo LIKE :tipo ORDER BY c.id"),
            @NamedQuery(
                    name = CorProduto.CorPorTipo,
                    query = "SELECT c FROM CorProduto c WHERE c.tipo= ?1"),
            @NamedQuery(
                    name = CorProduto.cores,
                    query = "SELECT c FROM CorProduto c ")
                        }
)
public class CorProduto extends Entidade implements Serializable{

  public static final String CorPorTipo = "CorPorTipo";
  public static final String cores = "cores";
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="CORPRODUTO_ID")
private Long id;

@NotBlank
@Column(name = "CORPRODUTO_NOME")
private String nome;
@NotNull(message = "Tipo não pode ser null")
@Column(name = "CORPRODUTO_TIPO")
private String tipo;

@Valid
@OneToMany(mappedBy = "corImagem",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
private List<ImagemProduto> imagem;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

   

    public List<ImagemProduto> getImagem() {
        return imagem;
    }

    public void setImagem(List<ImagemProduto> imagem) {
        this.imagem = imagem;
    }

}
