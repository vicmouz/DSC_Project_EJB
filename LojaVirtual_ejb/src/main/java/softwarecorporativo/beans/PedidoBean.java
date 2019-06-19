/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;
import softwarecorporativo.entidade.Pedido;
import softwarecorporativo.servico.PedidoServico;
import java.util.List;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author marcosbrasil98
 */
@RequestScoped
@Named(value = "PedidoBean")
public class PedidoBean extends Bean<Pedido> implements Serializable {
    
}
