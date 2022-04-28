package webService;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Actuacion", propOrder = {
		"fecha_actualizacion_sia"
})

public class Actuacion {

	Date fecha_actualizacion_sia;

	/**
	 * @return the actuacion
	 */
	public Date getActuacion() {
		return fecha_actualizacion_sia;
	}

	/**
	 * @param actuacion the actuacion to set
	 */
	public void setActuacion(Date actuacion) {
		this.fecha_actualizacion_sia = actuacion;
	}
	
	
}
