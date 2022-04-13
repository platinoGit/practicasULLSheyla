
package es.abiertos.datos.platino;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getGestionAdmin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getGestionAdmin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gestion" type="{http://datos.abiertos.es/platino}NivelAdministrativo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGestionAdmin", propOrder = {
    "gestion"
})
public class GetGestionAdmin {

    @XmlElement(name = "Gestion", required = true)
    protected List<NivelAdministrativo> gestion;

    /**
     * Gets the value of the gestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NivelAdministrativo }
     * 
     * 
     */
    public List<NivelAdministrativo> getGestion() {
        if (gestion == null) {
            gestion = new ArrayList<NivelAdministrativo>();
        }
        return this.gestion;
    }

}
