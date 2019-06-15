/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;
import softwarecorporativo.entidade.Administrador;
import softwarecorporativo.excecao.excecaoNegocio;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import softwarecorporativo.servico.AdministradorServico;

/**
 *
 * @author marcosbrasil98
 */
public class AdministradorBean extends Bean<Administrador> implements Serializable {
    @Inject
    private AdministradorServico administradorServico;

    @Override
    protected void iniciarCampos() {
        setEntidade(administradorServico.criar());
    }

    @Override
    protected boolean salvar(Administrador entidade) throws excecaoNegocio {
       // administradorServico.salvar(entidade);
        return true;
    }

   
}
