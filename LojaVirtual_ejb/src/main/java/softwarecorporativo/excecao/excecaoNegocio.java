/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.excecao;

/**
 *
 * @author marcosbrasil98
 */
public class excecaoNegocio extends Exception{
  private String chave;    
    public static final String PRODUTO_INEXISTENTE = "softwarecorporativo.excecao.excecaoNegocio.produtoInexistente";
    //public static final String REMOVER_PRODUTOS = "excecao.excecaoNegocio.ProdutoServico.remover";
    public static final String REMOVER_AUTOR = "softwarecorporativo.servico.AdministradorServico.remover";
    public static final String PRODUTO_EXISTENTE = "softwarecorporativo.excecao.excecaoNegocio.produtoExistente";  
    public static final String ACESSO_NAO_AUTORIZADO = "softwarecorporativo.excecao.excecaoNegocio.acesso.nao.autorizado";
    public static final String CREDENCIAIS_OMITIDAS = "softwarecorporativo.excecao.excecaoNegocio.acesso.credenciais.omitidadas";
    public static final String LOGIN_INVALIDO = "softwarecorporativo.excecao.excecaoNegocio.acesso.login.invalido";    
    
    public excecaoNegocio(String chave) {
        this.chave = chave;
    }  

    public String getChave() {
        return chave;
    }
    
    @Override
    public String getMessage() {
        mensagemExcecao mensagemExcecao = new mensagemExcecao(this);
        return mensagemExcecao.getMensagem();
    }
    
    public boolean isAutorizacao() {
        switch(chave) {
            case ACESSO_NAO_AUTORIZADO:
            case CREDENCIAIS_OMITIDAS:
            case LOGIN_INVALIDO:
                return true;
            default:
                return false;
        }
    }   
}
