
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

    private final static QName _ListarProductos_QNAME = new QName("http://service/", "listarProductos");
    private final static QName _ListarProductosResponse_QNAME = new QName("http://service/", "listarProductosResponse");
    private final static QName _ListarReporte_QNAME = new QName("http://service/", "listarReporte");
    private final static QName _ListarReporteResponse_QNAME = new QName("http://service/", "listarReporteResponse");
    private final static QName _RegistrarProducto_QNAME = new QName("http://service/", "registrarProducto");
    private final static QName _RegistrarProductoResponse_QNAME = new QName("http://service/", "registrarProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarProductos }
     * 
     */
    public ListarProductos createListarProductos() {
        return new ListarProductos();
    }

    /**
     * Create an instance of {@link ListarProductosResponse }
     * 
     */
    public ListarProductosResponse createListarProductosResponse() {
        return new ListarProductosResponse();
    }

    /**
     * Create an instance of {@link ListarReporte }
     * 
     */
    public ListarReporte createListarReporte() {
        return new ListarReporte();
    }

    /**
     * Create an instance of {@link ListarReporteResponse }
     * 
     */
    public ListarReporteResponse createListarReporteResponse() {
        return new ListarReporteResponse();
    }

    /**
     * Create an instance of {@link RegistrarProducto }
     * 
     */
    public RegistrarProducto createRegistrarProducto() {
        return new RegistrarProducto();
    }

    /**
     * Create an instance of {@link RegistrarProductoResponse }
     * 
     */
    public RegistrarProductoResponse createRegistrarProductoResponse() {
        return new RegistrarProductoResponse();
    }

    /**
     * Create an instance of {@link ModelProducto }
     * 
     */
    public ModelProducto createModelProducto() {
        return new ModelProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarProductos")
    public JAXBElement<ListarProductos> createListarProductos(ListarProductos value) {
        return new JAXBElement<ListarProductos>(_ListarProductos_QNAME, ListarProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarProductosResponse")
    public JAXBElement<ListarProductosResponse> createListarProductosResponse(ListarProductosResponse value) {
        return new JAXBElement<ListarProductosResponse>(_ListarProductosResponse_QNAME, ListarProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReporte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarReporte")
    public JAXBElement<ListarReporte> createListarReporte(ListarReporte value) {
        return new JAXBElement<ListarReporte>(_ListarReporte_QNAME, ListarReporte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReporteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarReporteResponse")
    public JAXBElement<ListarReporteResponse> createListarReporteResponse(ListarReporteResponse value) {
        return new JAXBElement<ListarReporteResponse>(_ListarReporteResponse_QNAME, ListarReporteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "registrarProducto")
    public JAXBElement<RegistrarProducto> createRegistrarProducto(RegistrarProducto value) {
        return new JAXBElement<RegistrarProducto>(_RegistrarProducto_QNAME, RegistrarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "registrarProductoResponse")
    public JAXBElement<RegistrarProductoResponse> createRegistrarProductoResponse(RegistrarProductoResponse value) {
        return new JAXBElement<RegistrarProductoResponse>(_RegistrarProductoResponse_QNAME, RegistrarProductoResponse.class, null, value);
    }

}
