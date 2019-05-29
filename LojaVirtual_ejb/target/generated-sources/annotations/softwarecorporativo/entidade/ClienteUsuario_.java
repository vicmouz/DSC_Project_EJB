package softwarecorporativo.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import softwarecorporativo.entidade.EnderecoCliente;
import softwarecorporativo.entidade.Pedido;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-28T10:36:43")
@StaticMetamodel(ClienteUsuario.class)
public class ClienteUsuario_ extends UsuarioGeral_ {

    public static volatile ListAttribute<ClienteUsuario, Pedido> pedidoUsuario;
    public static volatile SingularAttribute<ClienteUsuario, EnderecoCliente> endereco;
    public static volatile SingularAttribute<ClienteUsuario, String> fixo;
    public static volatile SingularAttribute<ClienteUsuario, String> celular;
    public static volatile SingularAttribute<ClienteUsuario, String> dataNascimento;

}