/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import java.io.Serializable;
import javax.inject.Inject;

import softwarecorporativo.entidade.ClienteUsuario;
import softwarecorporativo.entidade.EnderecoCliente;
import softwarecorporativo.excecao.excecaoNegocio;
import softwarecorporativo.servico.ClienteServico;
import softwarecorporativo.servico.EnderecoServico;

/**
 *
 * @author marcosbrasil98
 */
public class ClienteBean extends Bean<ClienteUsuario> implements Serializable {

    @Inject
    private ClienteServico clienteservico;
    @Inject
    private EnderecoServico enderecoServico;

    @Override
    protected void iniciarCampos() {
        setEntidade(clienteservico.criar());
        }

    @Override
    protected boolean salvar(ClienteUsuario entidade) throws excecaoNegocio { 
       //  clienteservico.salvar(entidade);
         return true;
    }
    /*
    public EnderecoCliente getEndereco(){
       // return enderecoServico.getEndereco();
    }*/
}
