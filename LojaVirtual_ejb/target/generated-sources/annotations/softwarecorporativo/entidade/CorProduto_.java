package softwarecorporativo.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import softwarecorporativo.entidade.ImagemProduto;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-28T10:36:43")
@StaticMetamodel(CorProduto.class)
public class CorProduto_ extends Entidade_ {

    public static volatile SingularAttribute<CorProduto, String> tipo;
    public static volatile ListAttribute<CorProduto, ImagemProduto> imagem;
    public static volatile SingularAttribute<CorProduto, String> nome;
    public static volatile SingularAttribute<CorProduto, Long> id;

}