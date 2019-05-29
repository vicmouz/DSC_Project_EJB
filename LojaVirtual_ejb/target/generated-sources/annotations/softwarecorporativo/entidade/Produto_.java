package softwarecorporativo.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import softwarecorporativo.entidade.CorProduto;
import softwarecorporativo.entidade.TamanhoProduto;
import softwarecorporativo.entidade.TipoProduto;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-28T10:36:43")
@StaticMetamodel(Produto.class)
public class Produto_ extends Entidade_ {

    public static volatile SingularAttribute<Produto, Double> preco;
    public static volatile ListAttribute<Produto, TamanhoProduto> tamanho;
    public static volatile ListAttribute<Produto, CorProduto> cor;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, Long> id;
    public static volatile SingularAttribute<Produto, TipoProduto> tipoProduto;
    public static volatile SingularAttribute<Produto, Integer> quantidade;
    public static volatile SingularAttribute<Produto, String> descricao;

}