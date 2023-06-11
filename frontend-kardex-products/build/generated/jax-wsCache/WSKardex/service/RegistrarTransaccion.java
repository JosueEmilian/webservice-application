
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrarTransaccion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrarTransaccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_USUARIO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ID_PRODUCTO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ID_TIPO_MOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CANTIDAD" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrarTransaccion", propOrder = {
    "idusuario",
    "idproducto",
    "idtipomovimiento",
    "cantidad",
    "descripcion"
})
public class RegistrarTransaccion {

    @XmlElement(name = "ID_USUARIO")
    protected int idusuario;
    @XmlElement(name = "ID_PRODUCTO")
    protected int idproducto;
    @XmlElement(name = "ID_TIPO_MOVIMIENTO")
    protected int idtipomovimiento;
    @XmlElement(name = "CANTIDAD")
    protected int cantidad;
    @XmlElement(name = "DESCRIPCION")
    protected String descripcion;

    /**
     * Gets the value of the idusuario property.
     * 
     */
    public int getIDUSUARIO() {
        return idusuario;
    }

    /**
     * Sets the value of the idusuario property.
     * 
     */
    public void setIDUSUARIO(int value) {
        this.idusuario = value;
    }

    /**
     * Gets the value of the idproducto property.
     * 
     */
    public int getIDPRODUCTO() {
        return idproducto;
    }

    /**
     * Sets the value of the idproducto property.
     * 
     */
    public void setIDPRODUCTO(int value) {
        this.idproducto = value;
    }

    /**
     * Gets the value of the idtipomovimiento property.
     * 
     */
    public int getIDTIPOMOVIMIENTO() {
        return idtipomovimiento;
    }

    /**
     * Sets the value of the idtipomovimiento property.
     * 
     */
    public void setIDTIPOMOVIMIENTO(int value) {
        this.idtipomovimiento = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCANTIDAD() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCANTIDAD(int value) {
        this.cantidad = value;
    }

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

}
