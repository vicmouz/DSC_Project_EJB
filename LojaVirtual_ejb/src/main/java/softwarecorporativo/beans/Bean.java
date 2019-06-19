/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import javax.annotation.PostConstruct;
import softwarecorporativo.entidade.Entidade;

/**
 *
 * @author victor
 */
public abstract class Bean<T extends Entidade> {

    protected T entidade;

    protected abstract boolean salvar(T entidade);

    protected abstract boolean atualizar(T entidade);

    protected abstract boolean deletar(T entidade);

    @PostConstruct
    public void init() {
        iniciarCampos();
    }

    protected abstract void iniciarCampos();

    public T getEntidade() {
        return entidade;
    }
    
    public void setEntidade(T entidade) {
        this.entidade = entidade;
    }
    
    public void salvar() {
        try{
            boolean sucesso = salvar(entidade);
        }
    }
    
    
}
