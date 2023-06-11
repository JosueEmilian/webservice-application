
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrarProducto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrarProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRECIO" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="EXISTENCIA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ID_TIPO_PRODUCTO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarProducto", propOrder = {
    "descripcion",
    "precio",
    "existencia",
    "idtipoproducto"
})
public class RegistrarProducto {

    @XmlElement(name = "DESCRIPCION")
    protected String descripcion;
    @XmlElement(name = "PRECIO")
    protected double precio;
    @XmlElement(name = "EXISTENCIA")
    protected int existencia;
    @XmlElement(name = "ID_TIPO_PRODUCTO")
    protected int idtipoproducto;

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION() {
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
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     */
    public double getPRECIO() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     */
    public void setPRECIO(double value) {
        this.precio = value;
    }

    /**
     * Gets the value of the existencia property.
     * 
     */
    public int getEXISTENCIA() {
        return existencia;
    }

    /**
     * Sets the value of the existencia property.
     * 
     */
    public void setEXISTENCIA(int value) {
        this.existencia = value;
    }

    /**
     * Gets the value of the idtipoproducto property.
     * 
     */
    public int getIDTIPOPRODUCTO() {
        return idtipoproducto;
    }

    /**
     * Sets the value of the idtipoproducto property.
     * 
     */
    public void setIDTIPOPRODUCTO(int value) {
        this.idtipoproducto = value;
    }

}
