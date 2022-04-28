package webService;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Publicacion", propOrder = {
		"fecha_publicacion"
})
public class Publicacion {
	
	Date fecha_publicacion;

	/**
	 * @return the publicacion
	 */
	public Date getPublicacion() {
		return fecha_publicacion;
	}

	/**
	 * @param publicacion the publicacion to set
	 */
	public void setPublicacion(Date publicacion) {
		this.fecha_publicacion = publicacion;
	}

}
