/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;
import java.io.Serializable;
import softwarecorporativo.entidade.Administrador;
import softwarecorporativo.servico.AdministradorServico;
import javax.enterprise.context.RequestScoped;
import java.util.List;
import javax.inject.Named;
import javax.inject.Inject;
/**
 *
 * @author marcosbrasil98
 */
@RequestScoped
@Named(value = "AdministradorBean")
public class AdministradorBean extends Bean<Administrador> implements Serializable{

    @Inject
    private AdministradorServico administradorServico;

private List<Administrador> administradores;
    @Override
    protected boolean salvar(Administrador entidade) {
       administradorServico.persistir(entidade);
       return true;
    }

    @Override
    protected boolean atualizar(Administrador entidade) {
       administradorServico.atualizar(entidade);
       return true;
    }

    @Override
    protected boolean deletar(Administrador entidade) {
    //  administradorServico.
    return true;
    }

    @Override
    protected void iniciarCampos() {
        setEntidade(administradorServico.criar());
    }
    
}
