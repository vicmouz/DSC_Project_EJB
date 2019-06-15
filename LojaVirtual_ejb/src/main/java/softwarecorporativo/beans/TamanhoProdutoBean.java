/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import java.io.Serializable;
import javax.inject.Inject;
import softwarecorporativo.entidade.TamanhoProduto;
import softwarecorporativo.excecao.excecaoNegocio;
import softwarecorporativo.servico.TamanhoServico;

/**
 *
 * @author marcosbrasil98
 */
public class TamanhoProdutoBean extends Bean<TamanhoProduto> implements Serializable{

    @Inject
    private TamanhoServico tamanhoServico;
    
    @Override
    protected void iniciarCampos() {
        setEntidade(tamanhoServico.criar());
    }

    @Override
    protected boolean salvar(TamanhoProduto entidade) throws excecaoNegocio {
    //tamanhoServico.salvar(entidade);
    return true;
    }
    
}
