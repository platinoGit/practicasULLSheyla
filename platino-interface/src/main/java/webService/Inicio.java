package webService;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Inicio", propOrder = {
		"inicio_tramite"
})

public class Inicio {

	String inicio_tramite;

	/**
	 * @return the inicio_tramite
	 */
	public String getInicio_tramite() {
		return inicio_tramite;
	}

	/**
	 * @param inicio_tramite the inicio_tramite to set
	 */
	public void setInicio_tramite(String inicio_tramite) {
		this.inicio_tramite = inicio_tramite;
	}
}
