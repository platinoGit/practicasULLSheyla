package webService;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FechaInicio", propOrder = {
		"fecha_inicio"
})

public class FechaInicio {

	Date fecha_inicio;

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha_inicio;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha_inicio = fecha;
	}
	
}
