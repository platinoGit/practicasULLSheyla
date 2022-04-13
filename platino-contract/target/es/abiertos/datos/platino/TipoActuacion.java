
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoActuacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoActuacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoActuacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoActuacion", propOrder = {
    "tipoActuacion"
})
public class TipoActuacion {

    @XmlElement(required = true)
    protected String tipoActuacion;

    /**
     * Obtiene el valor de la propiedad tipoActuacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoActuacion() {
        return tipoActuacion;
    }

    /**
     * Define el valor de la propiedad tipoActuacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoActuacion(String value) {
        this.tipoActuacion = value;
    }

}
