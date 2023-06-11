package model;

/**
 *
 * @author josueemilian
 */
public class ModelProducto {

    private int id;
    private int idTipoProducto;
    private String strTipoProducto;
    private String descripcion;
    private double precio;
    private int existencia;

    public ModelProducto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getStrTipoProducto() {
        return strTipoProducto;
    }

    public void setStrTipoProducto(String strTipoProducto) {
        this.strTipoProducto = strTipoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }


}
