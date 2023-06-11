
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

    private final static QName _RegistrarTransaccion_QNAME = new QName("http://service/", "RegistrarTransaccion");
    private final static QName _RegistrarTransaccionResponse_QNAME = new QName("http://service/", "RegistrarTransaccionResponse");
    private final static QName _ActualizarKardex_QNAME = new QName("http://service/", "actualizarKardex");
    private final static QName _ActualizarKardexResponse_QNAME = new QName("http://service/", "actualizarKardexResponse");
    private final static QName _EliminarUltimoRegistro_QNAME = new QName("http://service/", "eliminarUltimoRegistro");
    private final static QName _EliminarUltimoRegistroResponse_QNAME = new QName("http://service/", "eliminarUltimoRegistroResponse");
    private final static QName _ListarKardex_QNAME = new QName("http://service/", "listarKardex");
    private final static QName _ListarKardexResponse_QNAME = new QName("http://service/", "listarKardexResponse");
    private final static QName _ListarUltimoRegistroDeSuCategoria_QNAME = new QName("http://service/", "listarUltimoRegistroDeSuCategoria");
    private final static QName _ListarUltimoRegistroDeSuCategoriaResponse_QNAME = new QName("http://service/", "listarUltimoRegistroDeSuCategoriaResponse");
    private final static QName _ObtenerKardexID_QNAME = new QName("http://service/", "obtenerKardexID");
    private final static QName _ObtenerKardexIDResponse_QNAME = new QName("http://service/", "obtenerKardexIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarTransaccion }
     * 
     */
    public RegistrarTransaccion createRegistrarTransaccion() {
        return new RegistrarTransaccion();
    }

    /**
     * Create an instance of {@link RegistrarTransaccionResponse }
     * 
     */
    public RegistrarTransaccionResponse createRegistrarTransaccionResponse() {
        return new RegistrarTransaccionResponse();
    }

    /**
     * Create an instance of {@link ActualizarKardex }
     * 
     */
    public ActualizarKardex createActualizarKardex() {
        return new ActualizarKardex();
    }

    /**
     * Create an instance of {@link ActualizarKardexResponse }
     * 
     */
    public ActualizarKardexResponse createActualizarKardexResponse() {
        return new ActualizarKardexResponse();
    }

    /**
     * Create an instance of {@link EliminarUltimoRegistro }
     * 
     */
    public EliminarUltimoRegistro createEliminarUltimoRegistro() {
        return new EliminarUltimoRegistro();
    }

    /**
     * Create an instance of {@link EliminarUltimoRegistroResponse }
     * 
     */
    public EliminarUltimoRegistroResponse createEliminarUltimoRegistroResponse() {
        return new EliminarUltimoRegistroResponse();
    }

    /**
     * Create an instance of {@link ListarKardex }
     * 
     */
    public ListarKardex createListarKardex() {
        return new ListarKardex();
    }

    /**
     * Create an instance of {@link ListarKardexResponse }
     * 
     */
    public ListarKardexResponse createListarKardexResponse() {
        return new ListarKardexResponse();
    }

    /**
     * Create an instance of {@link ListarUltimoRegistroDeSuCategoria }
     * 
     */
    public ListarUltimoRegistroDeSuCategoria createListarUltimoRegistroDeSuCategoria() {
        return new ListarUltimoRegistroDeSuCategoria();
    }

    /**
     * Create an instance of {@link ListarUltimoRegistroDeSuCategoriaResponse }
     * 
     */
    public ListarUltimoRegistroDeSuCategoriaResponse createListarUltimoRegistroDeSuCategoriaResponse() {
        return new ListarUltimoRegistroDeSuCategoriaResponse();
    }

    /**
     * Create an instance of {@link ObtenerKardexID }
     * 
     */
    public ObtenerKardexID createObtenerKardexID() {
        return new ObtenerKardexID();
    }

    /**
     * Create an instance of {@link ObtenerKardexIDResponse }
     * 
     */
    public ObtenerKardexIDResponse createObtenerKardexIDResponse() {
        return new ObtenerKardexIDResponse();
    }

    /**
     * Create an instance of {@link ModelKardex }
     * 
     */
    public ModelKardex createModelKardex() {
        return new ModelKardex();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "RegistrarTransaccion")
    public JAXBElement<RegistrarTransaccion> createRegistrarTransaccion(RegistrarTransaccion value) {
        return new JAXBElement<RegistrarTransaccion>(_RegistrarTransaccion_QNAME, RegistrarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "RegistrarTransaccionResponse")
    public JAXBElement<RegistrarTransaccionResponse> createRegistrarTransaccionResponse(RegistrarTransaccionResponse value) {
        return new JAXBElement<RegistrarTransaccionResponse>(_RegistrarTransaccionResponse_QNAME, RegistrarTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarKardex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "actualizarKardex")
    public JAXBElement<ActualizarKardex> createActualizarKardex(ActualizarKardex value) {
        return new JAXBElement<ActualizarKardex>(_ActualizarKardex_QNAME, ActualizarKardex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarKardexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "actualizarKardexResponse")
    public JAXBElement<ActualizarKardexResponse> createActualizarKardexResponse(ActualizarKardexResponse value) {
        return new JAXBElement<ActualizarKardexResponse>(_ActualizarKardexResponse_QNAME, ActualizarKardexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUltimoRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "eliminarUltimoRegistro")
    public JAXBElement<EliminarUltimoRegistro> createEliminarUltimoRegistro(EliminarUltimoRegistro value) {
        return new JAXBElement<EliminarUltimoRegistro>(_EliminarUltimoRegistro_QNAME, EliminarUltimoRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUltimoRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "eliminarUltimoRegistroResponse")
    public JAXBElement<EliminarUltimoRegistroResponse> createEliminarUltimoRegistroResponse(EliminarUltimoRegistroResponse value) {
        return new JAXBElement<EliminarUltimoRegistroResponse>(_EliminarUltimoRegistroResponse_QNAME, EliminarUltimoRegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarKardex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarKardex")
    public JAXBElement<ListarKardex> createListarKardex(ListarKardex value) {
        return new JAXBElement<ListarKardex>(_ListarKardex_QNAME, ListarKardex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarKardexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarKardexResponse")
    public JAXBElement<ListarKardexResponse> createListarKardexResponse(ListarKardexResponse value) {
        return new JAXBElement<ListarKardexResponse>(_ListarKardexResponse_QNAME, ListarKardexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUltimoRegistroDeSuCategoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarUltimoRegistroDeSuCategoria")
    public JAXBElement<ListarUltimoRegistroDeSuCategoria> createListarUltimoRegistroDeSuCategoria(ListarUltimoRegistroDeSuCategoria value) {
        return new JAXBElement<ListarUltimoRegistroDeSuCategoria>(_ListarUltimoRegistroDeSuCategoria_QNAME, ListarUltimoRegistroDeSuCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUltimoRegistroDeSuCategoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listarUltimoRegistroDeSuCategoriaResponse")
    public JAXBElement<ListarUltimoRegistroDeSuCategoriaResponse> createListarUltimoRegistroDeSuCategoriaResponse(ListarUltimoRegistroDeSuCategoriaResponse value) {
        return new JAXBElement<ListarUltimoRegistroDeSuCategoriaResponse>(_ListarUltimoRegistroDeSuCategoriaResponse_QNAME, ListarUltimoRegistroDeSuCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerKardexID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "obtenerKardexID")
    public JAXBElement<ObtenerKardexID> createObtenerKardexID(ObtenerKardexID value) {
        return new JAXBElement<ObtenerKardexID>(_ObtenerKardexID_QNAME, ObtenerKardexID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerKardexIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "obtenerKardexIDResponse")
    public JAXBElement<ObtenerKardexIDResponse> createObtenerKardexIDResponse(ObtenerKardexIDResponse value) {
        return new JAXBElement<ObtenerKardexIDResponse>(_ObtenerKardexIDResponse_QNAME, ObtenerKardexIDResponse.class, null, value);
    }

}
