
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

    private final static QName _ListarTipoMovimiento_QNAME = new QName("http://service/", "listarTipoMovimiento");
    private final static QName _ListarTipoMovimientoResponse_QNAME = new QName("http://service/", "listarTipoMovimientoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarTipoMovimiento }
     * 
     */
    public ListarTipoMovimiento createListarTipoMovimiento() {
        return new ListarTipoMovimiento();
    }

    /**
     * Create an instance of {@link ListarTipoMovimientoResponse }
     * 
     */
    public ListarTipoMovimientoResponse createListarTipoMovimientoResponse() {
        return new ListarTipoMovimientoResponse();
    }

    /**
     * Create an instance of {@link ModelTipoMovimiento }
     * 
     */
    public ModelTipoMovimiento createModelTipoMovimiento() {
        return new ModelTipoMovimiento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTipoMovimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarTipoMovimiento")
    public JAXBElement<ListarTipoMovimiento> createListarTipoMovimiento(ListarTipoMovimiento value) {
        return new JAXBElement<ListarTipoMovimiento>(_ListarTipoMovimiento_QNAME, ListarTipoMovimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTipoMovimientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarTipoMovimientoResponse")
    public JAXBElement<ListarTipoMovimientoResponse> createListarTipoMovimientoResponse(ListarTipoMovimientoResponse value) {
        return new JAXBElement<ListarTipoMovimientoResponse>(_ListarTipoMovimientoResponse_QNAME, ListarTipoMovimientoResponse.class, null, value);
    }

}
