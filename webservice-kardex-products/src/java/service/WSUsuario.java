package service;

import dao.DaoUsuario;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.ModelUsuario;
import java.util.*;

/**
 *
 * @author josueemilian
 */
@WebService(serviceName = "WSUsuario")
public class WSUsuario {

    DaoUsuario daoUsuario = new DaoUsuario();

    @WebMethod(operationName = "listarUsuarios")
    public List<ModelUsuario> listarUsuarios() {
        List<ModelUsuario> lstUsuarios;
        lstUsuarios = daoUsuario.listar();
        return lstUsuarios;
    }
}
