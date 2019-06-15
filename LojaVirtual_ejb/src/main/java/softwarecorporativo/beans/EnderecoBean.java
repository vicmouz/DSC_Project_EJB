/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import java.io.Serializable;
import javax.inject.Inject;
import softwarecorporativo.entidade.EnderecoCliente;
import softwarecorporativo.excecao.excecaoNegocio;
import softwarecorporativo.servico.EnderecoServico;

/**
 *
 * @author marcosbrasil98
 */
public class EnderecoBean extends Bean<EnderecoCliente> implements Serializable {

    @Inject
    private EnderecoServico enderecoServico;
    
    @Override
    protected void iniciarCampos() {
        setEntidade(enderecoServico.criar());
    }

    @Override
    protected boolean salvar(EnderecoCliente entidade) throws excecaoNegocio {
    //enderecoServico.salvar(entidade);
    return true;    
    }
    
}
