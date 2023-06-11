package service;

import dao.DaoKardex;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.ModelKardex;
import java.util.*;
import java.sql.Timestamp;

/**
 *
 * @author josueemilian
 */
@WebService(serviceName = "WSKardex")
public class WSKardex {

    DaoKardex daoKardex = new DaoKardex();
    ModelKardex kardex = new ModelKardex();

    //WEBMETHOD LISTAR 
    @WebMethod(operationName = "listarKardex")
    public List<ModelKardex> listarKardex() {
        List<ModelKardex> lstKardex = new ArrayList<>();
        lstKardex = daoKardex.listar();
        return lstKardex;
    }
    
    //WEBMETHOD LISTAR ULTIMO REGISTRO DE SU CATEGORIA
        @WebMethod(operationName = "listarUltimoRegistroDeSuCategoria")
    public List<ModelKardex> listarUltimoRegistroDeSuCategoria() {
        List<ModelKardex> lstKardex = new ArrayList<>();
        lstKardex = daoKardex.listarUltimoRegistroDeSuCategoria();
        return lstKardex;
    }

    //WEBMETHOD --> LISTAR KARDEX INDIVIDUAL
    @WebMethod(operationName = "obtenerKardexID")
    public ModelKardex obtenerKardexID(@WebParam(name = "id") int id) {
        return daoKardex.list(id);
    }

    //WEBMETHOD --> Realizar transacciones 
    @WebMethod(operationName = "RegistrarTransaccion")
    public boolean RealizaTransaccion(
            @WebParam(name = "ID_USUARIO") int idUsuario,
            @WebParam(name = "ID_PRODUCTO") int idProducto,
            @WebParam(name = "ID_TIPO_MOVIMIENTO") int idTipoMovimiento,
            @WebParam(name = "CANTIDAD") int cantidad,
            @WebParam(name = "DESCRIPCION") String descripcion) {

        kardex.setIdUsuario(idUsuario);
        kardex.setIdProducto(idProducto);
        kardex.setIdTipoMovimiento(idTipoMovimiento);
        kardex.setCantidad(cantidad);
        kardex.setDescripcion(descripcion);
        kardex.setFecha(new Timestamp(System.currentTimeMillis()));

        daoKardex.Register(kardex);
        return true;
    }

    //WEBMETHOD --> ACTUALIZAR ULTIMO REGISTRO KARDEX
    @WebMethod(operationName = "actualizarKardex")
    public boolean actualizarKardex(
            @WebParam(name = "idKardex") int idKardex,
            @WebParam(name = "idUsuario") int idUsuario,
            @WebParam(name = "idProducto") int idProducto,
            @WebParam(name = "idTipoMovimiento") int idTipoMovimiento,
            @WebParam(name = "cantidad") int cantidad) {

        kardex.setId(idKardex);
        kardex.setIdUsuario(idUsuario);
        kardex.setIdProducto(idProducto);
        kardex.setIdTipoMovimiento(idTipoMovimiento);
        kardex.setCantidad(cantidad);

        boolean cambioExitoso = daoKardex.Update(kardex);
        return cambioExitoso;
    }
    
        //WEBMETHOD --> ELIMINAR ULTIMO REGISTRO KARDEX
    @WebMethod(operationName = "eliminarUltimoRegistro")
    public boolean eliminarUltimoRegistro(@WebParam(name = "ID") int id) {
        kardex.setId(id);
        return daoKardex.Delete(kardex);
    }
}
