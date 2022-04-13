
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearDato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearDato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crearDato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearDato", propOrder = {
    "crearDato"
})
public class CrearDato {

    @XmlElement(required = true)
    protected String crearDato;

    /**
     * Obtiene el valor de la propiedad crearDato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrearDato() {
        return crearDato;
    }

    /**
     * Define el valor de la propiedad crearDato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrearDato(String value) {
        this.crearDato = value;
    }

}
