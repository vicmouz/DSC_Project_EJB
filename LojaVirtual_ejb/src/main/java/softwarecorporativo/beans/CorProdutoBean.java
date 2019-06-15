/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import java.io.Serializable;
import javax.inject.Inject;
import softwarecorporativo.entidade.CorProduto;
import softwarecorporativo.excecao.excecaoNegocio;
import softwarecorporativo.servico.CorProdutoServico;

/**
 *
 * @author marcosbrasil98
 */
public class CorProdutoBean extends Bean<CorProduto> implements Serializable {

    @Inject
    private CorProdutoServico corservico;
    
    @Override
    protected void iniciarCampos() {
        setEntidade(corservico.criar());
    }

    @Override
    protected boolean salvar(CorProduto entidade) throws excecaoNegocio {
    // corservico.salvar(entidade);
     return true;
    }
    
}
