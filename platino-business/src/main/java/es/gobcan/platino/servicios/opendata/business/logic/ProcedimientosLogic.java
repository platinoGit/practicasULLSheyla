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
	public void crearProcedimiento(DatosProcedimientos identificador, Exchange exchange) {
		controlador.crearProcedimiento(identificador, exchange);
	}
	
	public void modificarProcedimiento(DatosProcedimientos identificador, Exchange exchange) {
		controlador.modificarProcedimiento(identificador, exchange);
	}
	
	public void eliminarProcedimiento(Id identificador, Exchange exchange) {
		controlador.eliminarProcedimiento(identificador, exchange);
	}
	
	public DatosProcedimientos busquedaUnidadAdminProcedimiento(UnidadAdmin uni_adm_resp, Exchange exchange) throws Exception {
		return controlador.busquedaUnidadAdminProcedimiento(uni_adm_resp, exchange);
	}
	
	public DatosProcedimientos busquedaNivelAdminProcedimiento(NivelAdmin nivel_administrativo, Exchange exchange) throws Exception {
		return controlador.busquedaNivelAdminProcedimiento(nivel_administrativo, exchange);
	}
	
	public DatosProcedimientos busquedaDepartamentoProcedimiento(Departamento departamento, Exchange exchange) throws Exception {
		return controlador.busquedaDepartamentoProcedimiento(departamento, exchange);
	}
}
