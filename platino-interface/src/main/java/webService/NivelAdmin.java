package webService;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NivelAdmin", propOrder = {
		"nivel_administrativo"
})

public class NivelAdmin {

	protected String nivel_administrativo;

	/**
	 * @return the nivel_administrativo
	 */
	public String getNivel_administrativo() {
		return nivel_administrativo;
	}

	/**
	 * @param nivel_administrativo the nivel_administrativo to set
	 */
	public void setNivel_administrativo(String nivel_administrativo) {
		this.nivel_administrativo = nivel_administrativo;
	}
}
