
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actualizarKardex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actualizarKardex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idKardex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTipoMovimiento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarKardex", propOrder = {
    "idKardex",
    "idUsuario",
    "idProducto",
    "idTipoMovimiento",
    "cantidad"
})
public class ActualizarKardex {

    protected int idKardex;
    protected int idUsuario;
    protected int idProducto;
    protected int idTipoMovimiento;
    protected int cantidad;

    /**
     * Gets the value of the idKardex property.
     * 
     */
    public int getIdKardex() {
        return idKardex;
    }

    /**
     * Sets the value of the idKardex property.
     * 
     */
    public void setIdKardex(int value) {
        this.idKardex = value;
    }

    /**
     * Gets the value of the idUsuario property.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the idProducto property.
     * 
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Sets the value of the idProducto property.
     * 
     */
    public void setIdProducto(int value) {
        this.idProducto = value;
    }

    /**
     * Gets the value of the idTipoMovimiento property.
     * 
     */
    public int getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    /**
     * Sets the value of the idTipoMovimiento property.
     * 
     */
    public void setIdTipoMovimiento(int value) {
        this.idTipoMovimiento = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

}
