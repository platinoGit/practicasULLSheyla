
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearDatoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearDatoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crearDatoResponse" type="{http://datos.abiertos.es/platino}ServicioProcedimiento"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearDatoResponse", propOrder = {
    "crearDatoResponse"
})
public class CrearDatoResponse {

    @XmlElement(required = true)
    protected ServicioProcedimiento crearDatoResponse;

    /**
     * Obtiene el valor de la propiedad crearDatoResponse.
     * 
     * @return
     *     possible object is
     *     {@link ServicioProcedimiento }
     *     
     */
    public ServicioProcedimiento getCrearDatoResponse() {
        return crearDatoResponse;
    }

    /**
     * Define el valor de la propiedad crearDatoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicioProcedimiento }
     *     
     */
    public void setCrearDatoResponse(ServicioProcedimiento value) {
        this.crearDatoResponse = value;
    }

}
