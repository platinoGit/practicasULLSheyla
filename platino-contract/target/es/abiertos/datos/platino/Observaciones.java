
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Observaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Observaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obsv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Observaciones", propOrder = {
    "obsv"
})
public class Observaciones {

    @XmlElement(required = true)
    protected String obsv;

    /**
     * Obtiene el valor de la propiedad obsv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsv() {
        return obsv;
    }

    /**
     * Define el valor de la propiedad obsv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsv(String value) {
        this.obsv = value;
    }

}
