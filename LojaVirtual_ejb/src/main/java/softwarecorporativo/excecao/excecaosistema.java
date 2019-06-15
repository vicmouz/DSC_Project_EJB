/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.excecao;

import javax.ejb.ApplicationException;
import softwarecorporativo.excecao.mensagemExcecao;
/**
 *
 * @author marcosbrasil98
 */
@ApplicationException(rollback = true)
public class excecaosistema  extends RuntimeException{
      public excecaosistema(Throwable causa) {
        super(causa);
    }
    
    @Override
    public String getMessage() {
        mensagemExcecao MensagemExcecao = new mensagemExcecao(this);
        return MensagemExcecao.getMensagem();
    }    
}
