/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.beans;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import softwarecorporativo.entidade.CorProduto;
import softwarecorporativo.entidade.ImagemProduto;
import softwarecorporativo.entidade.Produto;
import softwarecorporativo.entidade.TamanhoProduto;
import softwarecorporativo.excecao.excecaoNegocio;
import softwarecorporativo.servico.CorProdutoServico;
import softwarecorporativo.servico.ImagemServico;
import softwarecorporativo.servico.ProdutoServico;
import softwarecorporativo.servico.TamanhoServico;
import softwarecorporativo.servico.TipoProdutoServico;

/**
 *
 * @author marcosbrasil98
 */
public class ProdutoBean extends Bean<Produto> implements Serializable {

    @Inject
    private ProdutoServico produtoServico;
    @Inject
    private TamanhoServico tamanhoServico;
    @Inject
    private TipoProdutoServico tipoProdutoServico;
    @Inject
    private CorProdutoServico corservico;
    
    @Inject
    private ImagemServico imagemServico;
    @Override
    protected void iniciarCampos() {
        setEntidade(produtoServico.criar());
    }

    @Override
    protected boolean salvar(Produto entidade) throws excecaoNegocio {
    //produtoServico.salvar(entidade);
    return true;
    
    }
      /*
    public List<TamanhoProduto>getTamanho() {
      //  return tamanhoServico.getTamanhos();
    }
    public List<CorProduto>getCor() {
     corservico.getCores();
     
    }
    public List<ImagemProduto> getImagem(){
        imagemServico.getImagens();
    }
*/
    
}
