package webService;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodigoSIA", propOrder = {
		"codigoSIA"
})

public class CodigoSIA {

	String codigoSIA;

	/**
	 * @return the codigoSia
	 */
	public String getCodigoSia() {
		return codigoSIA;
	}

	/**
	 * @param codigoSia the codigoSia to set
	 */
	public void setCodigoSia(String codigoSia) {
		this.codigoSIA = codigoSia;
	}
	
	
}
