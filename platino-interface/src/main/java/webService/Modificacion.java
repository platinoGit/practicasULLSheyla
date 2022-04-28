package webService;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Modificacion", propOrder = {
		"modification_date"
})

public class Modificacion {

	Date modification_date;

	/**
	 * @return the modificacion
	 */
	public Date getModificacion() {
		return modification_date;
	}

	/**
	 * @param modificacion the modificacion to set
	 */
	public void setModificacion(Date modificacion) {
		this.modification_date = modificacion;
	}
}
