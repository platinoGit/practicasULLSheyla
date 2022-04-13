
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarDatoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarDatoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eliminarDatoResponse" type="{http://datos.abiertos.es/platino}ServicioProcedimiento"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarDatoResponse", propOrder = {
    "eliminarDatoResponse"
})
public class EliminarDatoResponse {

    @XmlElement(required = true)
    protected ServicioProcedimiento eliminarDatoResponse;

    /**
     * Obtiene el valor de la propiedad eliminarDatoResponse.
     * 
     * @return
     *     possible object is
     *     {@link ServicioProcedimiento }
     *     
     */
    public ServicioProcedimiento getEliminarDatoResponse() {
        return eliminarDatoResponse;
    }

    /**
     * Define el valor de la propiedad eliminarDatoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicioProcedimiento }
     *     
     */
    public void setEliminarDatoResponse(ServicioProcedimiento value) {
        this.eliminarDatoResponse = value;
    }

}
