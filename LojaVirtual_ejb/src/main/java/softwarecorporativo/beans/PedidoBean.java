/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;
import java.util.List;
import java.io.Serializable;
import javax.inject.Inject;
import softwarecorporativo.entidade.Pedido;
import softwarecorporativo.entidade.Produto;
import softwarecorporativo.excecao.excecaoNegocio;
import softwarecorporativo.servico.PedidoServico;
import softwarecorporativo.servico.ProdutoServico;

/**
 *
 * @author marcosbrasil98
 */
public class PedidoBean extends Bean<Pedido> implements Serializable{

    @Inject
    private PedidoServico pedidoServico;
    @Inject
    private ProdutoServico produtoServico;
    @Override
    protected void iniciarCampos() {
        setEntidade(pedidoServico.criar());
    }

    @Override
    protected boolean salvar(Pedido entidade) throws excecaoNegocio {
    //pedidoServico.salvar(entidade);   
    return true;
    }
    /*public List<Produto>getProdutos() {
     produtoServico.getProdutos();
     
    }*/
}
