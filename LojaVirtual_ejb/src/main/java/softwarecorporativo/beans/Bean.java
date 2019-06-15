/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJBException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.validation.ConstraintViolationException;
import softwarecorporativo.entidade.Entidade;
import softwarecorporativo.excecao.excecaoNegocio;
import softwarecorporativo.excecao.mensagemExcecao;
/**
 *
 * @author marcosbrasil98
 */
public abstract class Bean<T extends Entidade> {
  protected T entidade;

@PostConstruct
public void init(){
    iniciarCampos();
}
protected abstract void iniciarCampos();

protected abstract boolean salvar(T entidade) throws excecaoNegocio;

public T getEntidade(){
    return entidade;
}
public void setEntidade(T entidade){
    this.entidade=entidade;
}

public void salvar() {
        try {
            boolean sucesso = salvar(entidade);
            if (sucesso) {
                adicionarMessagem(FacesMessage.SEVERITY_INFO, "Cadastro realizado com sucesso!");
            }
        } catch (excecaoNegocio ex) {
            adicionarMessagem(FacesMessage.SEVERITY_WARN, ex.getMessage());
        } catch (EJBException ex) {
            if (ex.getCause() instanceof ConstraintViolationException) {
                mensagemExcecao mensagemExcecao = new mensagemExcecao(ex.getCause());
                adicionarMessagem(FacesMessage.SEVERITY_WARN, mensagemExcecao.getMensagem());
            } else {
                throw ex;
            }
        } finally {
            iniciarCampos();
        }
    }
 protected void adicionarMessagem(FacesMessage.Severity severity, String mensagem) {
        FacesMessage message = new FacesMessage(severity, mensagem, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
