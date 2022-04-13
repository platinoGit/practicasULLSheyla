
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InicioTramite complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InicioTramite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inicioTramite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InicioTramite", propOrder = {
    "inicioTramite"
})
public class InicioTramite {

    @XmlElement(required = true)
    protected String inicioTramite;

    /**
     * Obtiene el valor de la propiedad inicioTramite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInicioTramite() {
        return inicioTramite;
    }

    /**
     * Define el valor de la propiedad inicioTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInicioTramite(String value) {
        this.inicioTramite = value;
    }

}
