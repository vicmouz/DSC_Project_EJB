package softwarecorporativo.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import softwarecorporativo.entidade.ClienteUsuario;
import softwarecorporativo.entidade.Produto;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-25T08:45:11")
@StaticMetamodel(Pedido.class)
public class Pedido_ extends Entidade_ {

    public static volatile SingularAttribute<Pedido, ClienteUsuario> Clienteusuario;
    public static volatile ListAttribute<Pedido, Produto> produto;
    public static volatile SingularAttribute<Pedido, String> log;
    public static volatile SingularAttribute<Pedido, Long> id;
    public static volatile SingularAttribute<Pedido, Integer> quantidade;

}