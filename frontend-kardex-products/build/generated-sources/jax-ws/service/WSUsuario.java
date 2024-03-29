
package service;

import java.util.List;
import javax.jws.WebMethod;
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
@WebService(name = "WSUsuario", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSUsuario {


    /**
     * 
     * @return
     *     returns java.util.List<service.ModelUsuario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarUsuarios", targetNamespace = "http://service/", className = "service.ListarUsuarios")
    @ResponseWrapper(localName = "listarUsuariosResponse", targetNamespace = "http://service/", className = "service.ListarUsuariosResponse")
    @Action(input = "http://service/WSUsuario/listarUsuariosRequest", output = "http://service/WSUsuario/listarUsuariosResponse")
    public List<ModelUsuario> listarUsuarios();

}
