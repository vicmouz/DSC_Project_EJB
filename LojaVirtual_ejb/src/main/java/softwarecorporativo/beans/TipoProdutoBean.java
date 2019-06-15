/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import java.io.Serializable;
import javax.inject.Inject;
import softwarecorporativo.entidade.TipoProduto;
import softwarecorporativo.excecao.excecaoNegocio;
import softwarecorporativo.servico.TipoProdutoServico;

/**
 *
 * @author marcosbrasil98
 */
public class TipoProdutoBean extends Bean<TipoProduto> implements Serializable {
    
    @Inject
    private TipoProdutoServico tipoProdutoServico;
    

    @Override
    protected void iniciarCampos() {
        setEntidade(tipoProdutoServico.criar());
    }

    @Override
    protected boolean salvar(TipoProduto entidade) throws excecaoNegocio {
//    tipoProdutoServico.salvar(entidade);
    return true;  
    }
    
}
