package model;
import java.sql.Timestamp;
/**
 *
 * @author josueemilian
 */
public class ModelKardex {
    
    
    private int id;
    private int idUsuario;
    private int idProducto;
    private int idTipoMovimiento;
    private int cantidad;
    private int existencia;
    private int saldo;
    private String descripcion;
    private Timestamp fecha;

//    STR
    private String strUsuario;
    private String strProducto;
    private String strTipoMovimiento;
    private String strFecha;
    
    //VAR EXTRA PARA MANEJO BOTON ULTIMO REGISTRO
    private int idTipoProducto;

    public ModelKardex() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(int idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getStrUsuario() {
        return strUsuario;
    }

    public void setStrUsuario(String strUsuario) {
        this.strUsuario = strUsuario;
    }

    public String getStrProducto() {
        return strProducto;
    }

    public void setStrProducto(String strProducto) {
        this.strProducto = strProducto;
    }

    public String getStrTipoMovimiento() {
        return strTipoMovimiento;
    }

    public void setStrTipoMovimiento(String strTipoMovimiento) {
        this.strTipoMovimiento = strTipoMovimiento;
    }

    public String getStrFecha() {
        return strFecha;
    }

    public void setStrFecha(String strFecha) {
        this.strFecha = strFecha;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }
    


}
