/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import java.io.Serializable;
import javax.inject.Inject;
import softwarecorporativo.entidade.ImagemProduto;
import softwarecorporativo.excecao.excecaoNegocio;
import softwarecorporativo.servico.ImagemServico;

/**
 *
 * @author marcosbrasil98
 */
public class ImagemBean extends Bean <ImagemProduto> implements Serializable {

    @Inject
    private ImagemServico imagemServico;
    
    @Override
    protected void iniciarCampos() {
        setEntidade(imagemServico.criar());
    }

    @Override
    protected boolean salvar(ImagemProduto entidade) throws excecaoNegocio {
     //imagemServico.salvar(entidade);
     return true;
    }
    
}
