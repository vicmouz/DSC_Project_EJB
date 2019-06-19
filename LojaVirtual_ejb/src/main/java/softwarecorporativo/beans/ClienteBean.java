/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import softwarecorporativo.entidade.ClienteUsuario;
import softwarecorporativo.servico.ClienteServico;

/**
 *
 * @author victor
 */
@Named(value = "clienteBean")
@RequestScoped
public class ClienteBean extends Bean<ClienteUsuario> implements Serializable {

    @Inject
    private ClienteServico clienteServico;

    private List<ClienteUsuario> clientes;

    @Override
    protected boolean salvar(ClienteUsuario entidade) {
        clienteServico.persistirCliente(entidade);
        return true;
    }

    @Override
    public boolean atualizar(ClienteUsuario entidade) {
        clienteServico.atualizarCliente(entidade);
        return true;
    }

    public String editar(ClienteUsuario entidade) {
        entidade = clienteServico.consultarPorId(entidade.getId());
        return "alterarAluno";
    }

    @Override
    public boolean deletar(ClienteUsuario entidade) {
        clienteServico.deletar(entidade);
        return true;
    }

    public List<ClienteUsuario> getAlunos() {
        if (clientes == null) {
            clientes = clienteServico.getClientes();
        }
        return clientes;
    }

    @Override
    protected void iniciarCampos() {
        setEntidade(clienteServico.criar());
    }
}
