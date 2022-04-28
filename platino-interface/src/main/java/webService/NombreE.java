package webService;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NombreE", propOrder = {
		"nombre_especifico"
})

public class NombreE {

	String nombre_especifico;

	/**
	 * @return the nombre_especifico
	 */
	public String getNombre_especifico() {
		return nombre_especifico;
	}

	/**
	 * @param nombre_especifico the nombre_especifico to set
	 */
	public void setNombre_especifico(String nombre_especifico) {
		this.nombre_especifico = nombre_especifico;
	}
}
