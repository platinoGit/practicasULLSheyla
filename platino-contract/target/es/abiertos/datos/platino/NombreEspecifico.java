
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NombreEspecifico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NombreEspecifico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreEspecifico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NombreEspecifico", propOrder = {
    "nombreEspecifico"
})
public class NombreEspecifico {

    @XmlElement(required = true, nillable = true)
    protected String nombreEspecifico;

    /**
     * Obtiene el valor de la propiedad nombreEspecifico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEspecifico() {
        return nombreEspecifico;
    }

    /**
     * Define el valor de la propiedad nombreEspecifico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEspecifico(String value) {
        this.nombreEspecifico = value;
    }

}
