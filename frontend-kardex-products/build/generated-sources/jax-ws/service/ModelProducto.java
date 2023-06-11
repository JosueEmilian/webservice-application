
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modelProducto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="existencia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTipoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="strTipoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelProducto", propOrder = {
    "descripcion",
    "existencia",
    "id",
    "idTipoProducto",
    "precio",
    "strTipoProducto"
})
public class ModelProducto {

    protected String descripcion;
    protected int existencia;
    protected int id;
    protected int idTipoProducto;
    protected double precio;
    protected String strTipoProducto;

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the existencia property.
     * 
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * Sets the value of the existencia property.
     * 
     */
    public void setExistencia(int value) {
        this.existencia = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the idTipoProducto property.
     * 
     */
    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    /**
     * Sets the value of the idTipoProducto property.
     * 
     */
    public void setIdTipoProducto(int value) {
        this.idTipoProducto = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Gets the value of the strTipoProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTipoProducto() {
        return strTipoProducto;
    }

    /**
     * Sets the value of the strTipoProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTipoProducto(String value) {
        this.strTipoProducto = value;
    }

}
