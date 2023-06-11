
package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSTipoProducto", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8080/Backend-ParcialFinalProgramacionIII/WSTipoProducto?WSDL")
public class WSTipoProducto_Service
    extends Service
{

    private final static URL WSTIPOPRODUCTO_WSDL_LOCATION;
    private final static WebServiceException WSTIPOPRODUCTO_EXCEPTION;
    private final static QName WSTIPOPRODUCTO_QNAME = new QName("http://service/", "WSTipoProducto");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Backend-ParcialFinalProgramacionIII/WSTipoProducto?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSTIPOPRODUCTO_WSDL_LOCATION = url;
        WSTIPOPRODUCTO_EXCEPTION = e;
    }

    public WSTipoProducto_Service() {
        super(__getWsdlLocation(), WSTIPOPRODUCTO_QNAME);
    }

    public WSTipoProducto_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSTIPOPRODUCTO_QNAME, features);
    }

    public WSTipoProducto_Service(URL wsdlLocation) {
        super(wsdlLocation, WSTIPOPRODUCTO_QNAME);
    }

    public WSTipoProducto_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSTIPOPRODUCTO_QNAME, features);
    }

    public WSTipoProducto_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSTipoProducto_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSTipoProducto
     */
    @WebEndpoint(name = "WSTipoProductoPort")
    public WSTipoProducto getWSTipoProductoPort() {
        return super.getPort(new QName("http://service/", "WSTipoProductoPort"), WSTipoProducto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSTipoProducto
     */
    @WebEndpoint(name = "WSTipoProductoPort")
    public WSTipoProducto getWSTipoProductoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "WSTipoProductoPort"), WSTipoProducto.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSTIPOPRODUCTO_EXCEPTION!= null) {
            throw WSTIPOPRODUCTO_EXCEPTION;
        }
        return WSTIPOPRODUCTO_WSDL_LOCATION;
    }

}