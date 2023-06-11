package service;

import dao.DaoProducto;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.ModelProducto;

/**
 *
 * @author josueemilian
 */
@WebService(serviceName = "WSProducto")
public class WSProducto {

    DaoProducto daoProducto = new DaoProducto();
    ModelProducto producto = new ModelProducto();

    //WEBMETHOD --> LISTAR PRODUCTOS
    @WebMethod(operationName = "listarProductos")
    public List<ModelProducto> listarProductos() {
        List<ModelProducto> lstProductos;
        lstProductos = daoProducto.listar();
        return lstProductos;
    }

    //WEBMETHOD --> LISTAR REPORTE 
    @WebMethod(operationName = "listarReporte")
    public List<ModelProducto> listarReporte() {
        List<ModelProducto> lstReporte;
        lstReporte = daoProducto.listarReporte();
        return lstReporte;
    }


    //WEBMETHOD --> REGISTRAR PRODUCTO 
    @WebMethod(operationName = "registrarProducto")
    public boolean registrarProducto(
            @WebParam(name = "DESCRIPCION") String descripcion,
            @WebParam(name = "PRECIO") double precio,
            @WebParam(name = "EXISTENCIA") int existencia,
            @WebParam(name = "ID_TIPO_PRODUCTO") int idTipoProducto) {

        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setExistencia(existencia);
        producto.setIdTipoProducto(idTipoProducto);

        daoProducto.Register(producto);
        return true;
    }

}
