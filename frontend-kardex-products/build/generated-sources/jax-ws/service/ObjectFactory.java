
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

    private final static QName _ListarTipoProducto_QNAME = new QName("http://service/", "listarTipoProducto");
    private final static QName _ListarTipoProductoResponse_QNAME = new QName("http://service/", "listarTipoProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarTipoProducto }
     * 
     */
    public ListarTipoProducto createListarTipoProducto() {
        return new ListarTipoProducto();
    }

    /**
     * Create an instance of {@link ListarTipoProductoResponse }
     * 
     */
    public ListarTipoProductoResponse createListarTipoProductoResponse() {
        return new ListarTipoProductoResponse();
    }

    /**
     * Create an instance of {@link ModelTipoProducto }
     * 
     */
    public ModelTipoProducto createModelTipoProducto() {
        return new ModelTipoProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTipoProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarTipoProducto")
    public JAXBElement<ListarTipoProducto> createListarTipoProducto(ListarTipoProducto value) {
        return new JAXBElement<ListarTipoProducto>(_ListarTipoProducto_QNAME, ListarTipoProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTipoProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarTipoProductoResponse")
    public JAXBElement<ListarTipoProductoResponse> createListarTipoProductoResponse(ListarTipoProductoResponse value) {
        return new JAXBElement<ListarTipoProductoResponse>(_ListarTipoProductoResponse_QNAME, ListarTipoProductoResponse.class, null, value);
    }

}
