package es.gobcan.platino.servicios.opendata.business.logic;

import org.apache.camel.Exchange;

import es.gobcan.platino.servicios.opendata.business.controller.Controlador;
import webService.DatosProcedimientos;
import webService.Departamento;
import webService.Id;
import webService.NivelAdmin;
import webService.UnidadAdmin;

public class ProcedimientosLogic {

	public Controlador controlador;
	public void crearProcedimiento(Id identificador, Exchange exchange) {
		// Debería hacer alguna comprobación?
		controlador.crearProcedimiento(identificador, exchange);
	}
	
	public void modificarProcedimiento(Id identificador, Exchange exchange) {
		controlador.modificarProcedimiento(identificador, exchange);
	}
	
	public void eliminarProcedimiento(Id identificador, Exchange exchange) {
		controlador.eliminarProcedimiento(identificador, exchange);
	}
	
	public DatosProcedimientos busquedaUnidadAdminProcedimiento(UnidadAdmin uni_adm_resp, Exchange exchange) {
		return controlador.busquedaUnidadAdminProcedimiento(uni_adm_resp, exchange);
	}
	
	public DatosProcedimientos busquedaNivelAdminProcedimiento(NivelAdmin nivel_administrativo, Exchange exchange) {
		return controlador.busquedaNivelAdminProcedimiento(nivel_administrativo, exchange);
	}
	
	public DatosProcedimientos busquedaDepartamentoProcedimiento(Departamento departamento, Exchange exchange) {
		return controlador.busquedaDepartamentoProcedimiento(departamento, exchange);
	}
}
