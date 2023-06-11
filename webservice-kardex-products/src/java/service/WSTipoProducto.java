package service;

import dao.DaoTipoProducto;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import model.ModelTipoProducto;

/**
 *
 * @author josueemilian
 */
@WebService(serviceName = "WSTipoProducto")
public class WSTipoProducto {

    DaoTipoProducto daoTipoProducto = new DaoTipoProducto();

    @WebMethod(operationName = "listarTipoProducto")
    public List<ModelTipoProducto> listarTipoProducto() {
        List<ModelTipoProducto> lstTipoProducto;
        lstTipoProducto = daoTipoProducto.listar();
        return lstTipoProducto;

    }
}
