
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarUsuarios_QNAME = new QName("http://service/", "listarUsuarios");
    private final static QName _ListarUsuariosResponse_QNAME = new QName("http://service/", "listarUsuariosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarUsuarios }
     * 
     */
    public ListarUsuarios createListarUsuarios() {
        return new ListarUsuarios();
    }

    /**
     * Create an instance of {@link ListarUsuariosResponse }
     * 
     */
    public ListarUsuariosResponse createListarUsuariosResponse() {
        return new ListarUsuariosResponse();
    }

    /**
     * Create an instance of {@link ModelUsuario }
     * 
     */
    public ModelUsuario createModelUsuario() {
        return new ModelUsuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarUsuarios")
    public JAXBElement<ListarUsuarios> createListarUsuarios(ListarUsuarios value) {
        return new JAXBElement<ListarUsuarios>(_ListarUsuarios_QNAME, ListarUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarUsuariosResponse")
    public JAXBElement<ListarUsuariosResponse> createListarUsuariosResponse(ListarUsuariosResponse value) {
        return new JAXBElement<ListarUsuariosResponse>(_ListarUsuariosResponse_QNAME, ListarUsuariosResponse.class, null, value);
    }

}
