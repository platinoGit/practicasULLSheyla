
package es.abiertos.datos.platino;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUnidAdminResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUnidAdminResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Unidad_administrativaResponse" type="{http://datos.abiertos.es/platino}ServicioProcedimiento" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUnidAdminResponse", propOrder = {
    "unidadAdministrativaResponse"
})
public class GetUnidAdminResponse {

    @XmlElement(name = "Unidad_administrativaResponse", required = true)
    protected List<ServicioProcedimiento> unidadAdministrativaResponse;

    /**
     * Gets the value of the unidadAdministrativaResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadAdministrativaResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadAdministrativaResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicioProcedimiento }
     * 
     * 
     */
    public List<ServicioProcedimiento> getUnidadAdministrativaResponse() {
        if (unidadAdministrativaResponse == null) {
            unidadAdministrativaResponse = new ArrayList<ServicioProcedimiento>();
        }
        return this.unidadAdministrativaResponse;
    }

}
