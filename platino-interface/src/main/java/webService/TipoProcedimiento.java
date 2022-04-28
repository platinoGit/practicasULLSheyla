package webService;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoProcedimiento", propOrder = {
		"tipoProcedimiento"
})

public class TipoProcedimiento {

	String tipoProcedimiento;

	/**
	 * @return the tipo
	 */
	public String getTipoProcedimiento() {
		return tipoProcedimiento;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipoProcedimiento(String tipoProcedimiento) {
		this.tipoProcedimiento = tipoProcedimiento;
	}
}
