
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSProducto", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSProducto {


    /**
     * 
     * @return
     *     returns java.util.List<service.ModelProducto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarReporte", targetNamespace = "http://service/", className = "service.ListarReporte")
    @ResponseWrapper(localName = "listarReporteResponse", targetNamespace = "http://service/", className = "service.ListarReporteResponse")
    @Action(input = "http://service/WSProducto/listarReporteRequest", output = "http://service/WSProducto/listarReporteResponse")
    public List<ModelProducto> listarReporte();

    /**
     * 
     * @param descripcion
     * @param existencia
     * @param precio
     * @param idTIPOPRODUCTO
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrarProducto", targetNamespace = "http://service/", className = "service.RegistrarProducto")
    @ResponseWrapper(localName = "registrarProductoResponse", targetNamespace = "http://service/", className = "service.RegistrarProductoResponse")
    @Action(input = "http://service/WSProducto/registrarProductoRequest", output = "http://service/WSProducto/registrarProductoResponse")
    public boolean registrarProducto(
        @WebParam(name = "DESCRIPCION", targetNamespace = "")
        String descripcion,
        @WebParam(name = "PRECIO", targetNamespace = "")
        double precio,
        @WebParam(name = "EXISTENCIA", targetNamespace = "")
        int existencia,
        @WebParam(name = "ID_TIPO_PRODUCTO", targetNamespace = "")
        int idTIPOPRODUCTO);

    /**
     * 
     * @return
     *     returns java.util.List<service.ModelProducto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarProductos", targetNamespace = "http://service/", className = "service.ListarProductos")
    @ResponseWrapper(localName = "listarProductosResponse", targetNamespace = "http://service/", className = "service.ListarProductosResponse")
    @Action(input = "http://service/WSProducto/listarProductosRequest", output = "http://service/WSProducto/listarProductosResponse")
    public List<ModelProducto> listarProductos();

}
