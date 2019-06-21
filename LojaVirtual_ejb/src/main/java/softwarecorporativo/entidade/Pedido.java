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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.Valid;
/**
 *
 * @author marcosbrasil98
 */
@Entity
@Table(name="TB_PEDIDO")
@Access(AccessType.FIELD)
@NamedQueries(
        {
            @NamedQuery(
                    name = "Pedido.PorLog",
                    query = "SELECT p FROM Pedido p WHERE p.log LIKE :log ORDER BY p.id"),
            @NamedQuery(
                    name = Pedido.PedidoPorLog,
                    query = "SELECT p FROM Pedido p WHERE p.log= ?1"),
             @NamedQuery(
                    name = Pedido.pedidos,
                    query = "SELECT p FROM Pedido p ")
                        }
)
public class Pedido extends Entidade implements Serializable{
    
 public static final String PedidoPorLog = "PedidoPorLog";
public static final String pedidos = "pedidos";
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
@Column(name = "PEDIDO_ID",nullable = false)
private Long id;

@NotNull
@Size(max=20)
@Column(name = "PEDIDO_LOG")
private String log;

@NotNull
@Column(name = "PEDIDO_QUANTIDADE")
private Integer quantidade; 


@Valid
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "CLIENTE_FK",referencedColumnName = "USUARIO_ID",insertable = true, updatable = true)
  private ClienteUsuario Clienteusuario;

@Valid
@ManyToMany
    @JoinTable(name="TB_PEDIDO_PRODUTO", joinColumns=
    {@JoinColumn(name="PEDIDO_ID")}, inverseJoinColumns=
      {@JoinColumn(name="PRODUTO_ID")})
   private List<Produto> produto;

public boolean possui(String log){
       return log.contains(log);
   }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public ClienteUsuario getUsuario() {
        return Clienteusuario;
    }

    public void setUsuario(ClienteUsuario usuario) {
        this.Clienteusuario = usuario;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

}
