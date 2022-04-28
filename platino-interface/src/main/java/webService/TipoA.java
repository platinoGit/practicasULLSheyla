package webService;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoA", propOrder = {
		"tipo_actuacion"
})

public class TipoA {

	String tipo_actuacion;

	/**
	 * @return the tipo_actuacion
	 */
	public String getTipo_actuacion() {
		return tipo_actuacion;
	}

	/**
	 * @param tipo_actuacion the tipo_actuacion to set
	 */
	public void setTipo_actuacion(String tipo_actuacion) {
		this.tipo_actuacion = tipo_actuacion;
	}
	
}
