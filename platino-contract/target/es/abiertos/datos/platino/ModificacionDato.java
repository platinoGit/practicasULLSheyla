
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificacionDato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificacionDato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modificacionDato" type="{http://datos.abiertos.es/platino}Identificador"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificacionDato", propOrder = {
    "modificacionDato"
})
public class ModificacionDato {

    @XmlElement(required = true)
    protected Identificador modificacionDato;

    /**
     * Obtiene el valor de la propiedad modificacionDato.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getModificacionDato() {
        return modificacionDato;
    }

    /**
     * Define el valor de la propiedad modificacionDato.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setModificacionDato(Identificador value) {
        this.modificacionDato = value;
    }

}
