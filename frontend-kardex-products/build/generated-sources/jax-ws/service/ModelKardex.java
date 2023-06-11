
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modelKardex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelKardex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="existencia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha" type="{http://service/}timestamp" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTipoMovimiento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTipoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strTipoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelKardex", propOrder = {
    "cantidad",
    "descripcion",
    "existencia",
    "fecha",
    "id",
    "idProducto",
    "idTipoMovimiento",
    "idTipoProducto",
    "idUsuario",
    "saldo",
    "strFecha",
    "strProducto",
    "strTipoMovimiento",
    "strUsuario"
})
public class ModelKardex {

    protected int cantidad;
    protected String descripcion;
    protected int existencia;
    protected Timestamp fecha;
    protected int id;
    protected int idProducto;
    protected int idTipoMovimiento;
    protected int idTipoProducto;
    protected int idUsuario;
    protected int saldo;
    protected String strFecha;
    protected String strProducto;
    protected String strTipoMovimiento;
    protected String strUsuario;

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
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setFecha(Timestamp value) {
        this.fecha = value;
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
     * Gets the value of the saldo property.
     * 
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Sets the value of the saldo property.
     * 
     */
    public void setSaldo(int value) {
        this.saldo = value;
    }

    /**
     * Gets the value of the strFecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFecha() {
        return strFecha;
    }

    /**
     * Sets the value of the strFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFecha(String value) {
        this.strFecha = value;
    }

    /**
     * Gets the value of the strProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrProducto() {
        return strProducto;
    }

    /**
     * Sets the value of the strProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrProducto(String value) {
        this.strProducto = value;
    }

    /**
     * Gets the value of the strTipoMovimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTipoMovimiento() {
        return strTipoMovimiento;
    }

    /**
     * Sets the value of the strTipoMovimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTipoMovimiento(String value) {
        this.strTipoMovimiento = value;
    }

    /**
     * Gets the value of the strUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrUsuario() {
        return strUsuario;
    }

    /**
     * Sets the value of the strUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrUsuario(String value) {
        this.strUsuario = value;
    }

}
