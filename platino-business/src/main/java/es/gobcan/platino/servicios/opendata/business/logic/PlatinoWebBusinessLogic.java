package es.gobcan.platino.servicios.opendata.business.logic;

import org.apache.camel.Exchange;

public class PlatinoWebBusinessLogic {

	private DatosLogic datoslogic;
	//Falta: hacer referencia a las clases que llamo
	//Antes del return, los métodos llaman al logic
	
	// Búsqueda por unidad administrativa
	
	public ServicioProcedimiento getUnidAdmin(UnidadAdministrativa unidad, Exchange exchange) throws Exception {
		
		return datoslogic.getUnidAdmin(unidad, exchange);
	}
	// Búsqueda por departamento
	
	public ServicioProcedimiento getDepartamento(Departamento departamento, Exchange exchange) throws Exception {
		
		return datoslogic.getDepartamento(departamento, exchange);
	}
	// Búsqueda por gestión administrativa
	
	public ServicioProcedimiento getGestionAdmin(NivelAdministrativo nivel, Exchange exchange) throws Exception {
		
		return datoslogic.getGestionAdmin(nivel, exchange);
	}
	// Método que crea el nuevo procedimiento o servicio
	public ServicioProcedimiento crear(String informacion, Exchange exchange) throws Exception {
		
		return datoslogic.crear(informacion, exchange);
	}
	
	// Método que modificar el procedimiento o servicio
	public ServicioProcedimiento modificar(Identificador id, Exchange exchange) throws Exception {
		
		return datoslogic.modificar(id, exchange);
	}
	
	// Método que elimina el procedimiento o servicio
	public ServicioProcedimiento eliminar(Identificador id, Exchange exchange) throws Exception {
		
		return datoslogic.eliminar(id, exchange);
	}
}
