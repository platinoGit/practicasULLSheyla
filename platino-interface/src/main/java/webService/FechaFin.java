package webService;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FechaFin", propOrder = {
		"fecha_fin"
})

public class FechaFin {

	Date fecha_fin;

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fecha_fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fecha_fin = fin;
	}
	
}
