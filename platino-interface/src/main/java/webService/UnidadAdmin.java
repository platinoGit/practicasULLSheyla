package webService;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadAdmin", propOrder = {
		"uni_adm_resp"
})

public class UnidadAdmin {

	protected String uni_adm_resp;

	/**
	 * @return the uni_adm_resp
	 */
	public String getUni_adm_resp() {
		return uni_adm_resp;
	}

	/**
	 * @param uni_adm_resp the uni_adm_resp to set
	 */
	public void setUni_adm_resp(String uni_adm_resp) {
		this.uni_adm_resp = uni_adm_resp;
	}


}
