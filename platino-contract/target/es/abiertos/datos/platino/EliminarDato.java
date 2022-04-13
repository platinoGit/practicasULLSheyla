
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarDato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarDato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eliminarDato" type="{http://datos.abiertos.es/platino}Identificador"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarDato", propOrder = {
    "eliminarDato"
})
public class EliminarDato {

    @XmlElement(required = true)
    protected Identificador eliminarDato;

    /**
     * Obtiene el valor de la propiedad eliminarDato.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getEliminarDato() {
        return eliminarDato;
    }

    /**
     * Define el valor de la propiedad eliminarDato.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setEliminarDato(Identificador value) {
        this.eliminarDato = value;
    }

}
