package es.gobcan.platino.servicios.opendata.business.persistence.entity;

import java.util.ResourceBundle;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class Entidad {
	
	// Este id es del persistence, ver si deberia coger el de interface
	// Preguntar el tema del labels
	@Id
	private Id identificador;
	
	@Transient
	private ResourceBundle labels;
	
	@Transient
	public String getLabels(String key) {
		if (labels == null)
			labels = ResourceBundle.getBundle("labels");
		return labels.getString(key);
	}

	public Id getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(Id identificador) {
		this.identificador = identificador;
	}

	public ResourceBundle getLabels() {
		return labels;
	}

	public void setLabels(ResourceBundle labels) {
		this.labels = labels;
	}
}
