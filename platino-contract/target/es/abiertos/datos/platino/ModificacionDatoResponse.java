
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificacionDatoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificacionDatoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modificacionDatoResponse" type="{http://datos.abiertos.es/platino}ServicioProcedimiento"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificacionDatoResponse", propOrder = {
    "modificacionDatoResponse"
})
public class ModificacionDatoResponse {

    @XmlElement(required = true)
    protected ServicioProcedimiento modificacionDatoResponse;

    /**
     * Obtiene el valor de la propiedad modificacionDatoResponse.
     * 
     * @return
     *     possible object is
     *     {@link ServicioProcedimiento }
     *     
     */
    public ServicioProcedimiento getModificacionDatoResponse() {
        return modificacionDatoResponse;
    }

    /**
     * Define el valor de la propiedad modificacionDatoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicioProcedimiento }
     *     
     */
    public void setModificacionDatoResponse(ServicioProcedimiento value) {
        this.modificacionDatoResponse = value;
    }

}
