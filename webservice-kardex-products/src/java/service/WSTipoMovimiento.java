package service;

import dao.DaoTipoMovimiento;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.ModelTipoMovimiento;
import java.util.*;

/**
 *
 * @author josueemilian
 */
@WebService(serviceName = "WSTipoMovimiento")
public class WSTipoMovimiento {
    
    DaoTipoMovimiento daoTipoMovimiento = new DaoTipoMovimiento();
    ModelTipoMovimiento tipoMovimiento = new ModelTipoMovimiento();
    
    @WebMethod(operationName = "listarTipoMovimiento")
    public List<ModelTipoMovimiento> listarTipoMovimiento (){
        List<ModelTipoMovimiento> lstTipoMovimiento;
        lstTipoMovimiento = daoTipoMovimiento.listar();
        return lstTipoMovimiento;
    }

}
