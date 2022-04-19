package es.gobcan.platino.servicios.opendata.business.logic;

import org.apache.camel.Exchange;

public class PlatinoWebBusinessLogic {

	private DatosLogic datoslogic;
	//Falta: hacer referencia a las clases que llamo
	//Antes del return, los m�todos llaman al logic
	
	// B�squeda por unidad administrativa
	
	public ServicioProcedimiento getUnidAdmin(UnidadAdministrativa unidad, Exchange exchange) throws Exception {
		
		return datoslogic.getUnidAdmin(unidad, exchange);
	}
	// B�squeda por departamento
	
	public ServicioProcedimiento getDepartamento(Departamento departamento, Exchange exchange) throws Exception {
		
		return datoslogic.getDepartamento(departamento, exchange);
	}
	// B�squeda por gesti�n administrativa
	
	public ServicioProcedimiento getGestionAdmin(NivelAdministrativo nivel, Exchange exchange) throws Exception {
		
		return datoslogic.getGestionAdmin(nivel, exchange);
	}
	// M�todo que crea el nuevo procedimiento o servicio
	public ServicioProcedimiento crear(String informacion, Exchange exchange) throws Exception {
		
		return datoslogic.crear(informacion, exchange);
	}
	
	// M�todo que modificar el procedimiento o servicio
	public ServicioProcedimiento modificar(Identificador id, Exchange exchange) throws Exception {
		
		return datoslogic.modificar(id, exchange);
	}
	
	// M�todo que elimina el procedimiento o servicio
	public ServicioProcedimiento eliminar(Identificador id, Exchange exchange) throws Exception {
		
		return datoslogic.eliminar(id, exchange);
	}
}