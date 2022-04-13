
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UnidadAdministrativa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnidadAdministrativa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uniAdmResp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadAdministrativa", propOrder = {
    "uniAdmResp"
})
public class UnidadAdministrativa {

    @XmlElement(required = true)
    protected String uniAdmResp;

    /**
     * Obtiene el valor de la propiedad uniAdmResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniAdmResp() {
        return uniAdmResp;
    }

    /**
     * Define el valor de la propiedad uniAdmResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniAdmResp(String value) {
        this.uniAdmResp = value;
    }

}
