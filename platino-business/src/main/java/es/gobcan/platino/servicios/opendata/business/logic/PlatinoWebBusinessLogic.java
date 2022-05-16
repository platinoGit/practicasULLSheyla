package es.gobcan.platino.servicios.opendata.business.logic;

import org.apache.camel.Exchange;

import webService.DatosProcedimientos;
import webService.DatosServicios;
import webService.Departamento;
import webService.Id;
import webService.NivelAdmin;
import webService.UnidadAdmin;

// Este de aqu� es el controlador
public class PlatinoWebBusinessLogic {

	private ProcedimientosLogic proclogic;
	private ServiciosLogic servlogic;
	//Falta: hacer referencia a las clases que llamo y mirar el tipo de dato que devuelve
	
	// B�squeda por unidad administrativa
	
	public DatosServicios busquedaUnidadAdminServicio(UnidadAdmin uni_adm_resp, Exchange exchange) throws Exception {
		
		return servlogic.busquedaUnidadAdminServicio(uni_adm_resp, exchange);
	}
	
	public DatosProcedimientos busquedaUnidadAdminProcedimiento(UnidadAdmin uni_adm_resp, Exchange exchange) throws Exception {
		
		return proclogic.busquedaUnidadAdminProcedimiento(uni_adm_resp, exchange);
	}
	// B�squeda por departamento
	
	public DatosServicios busquedaDepartamentoServicio(Departamento departamento, Exchange exchange) throws Exception {
		
		return servlogic.busquedaDepartamentoServicio(departamento, exchange);
	}
	
	public DatosProcedimientos busquedaDepartamentoProcedimiento(Departamento departamento, Exchange exchange) throws Exception {
		
		return proclogic.busquedaDepartamentoProcedimiento(departamento, exchange);
	}
	// B�squeda por gesti�n administrativa
	
	public DatosServicios busquedaNivelAdminServicio(NivelAdmin nivel_administrativo, Exchange exchange) throws Exception {
		
		return servlogic.busquedaNivelAdminServicio(nivel_administrativo, exchange);
	}
	
	public DatosProcedimientos busquedaNivelAdminProcedimiento(NivelAdmin nivel_administrativo, Exchange exchange) throws Exception {
		
		return proclogic.busquedaNivelAdminProcedimiento(nivel_administrativo, exchange);
	}
	
	
	// M�todo que crea el nuevo procedimiento o servicio
	public void crearServicio(DatosServicios identificador, Exchange exchange) throws Exception {
		
		servlogic.crearServicio(identificador, exchange);
	}
	
	public void crearProcedimiento(DatosProcedimientos identificador, Exchange exchange) throws Exception {
		
		proclogic.crearProcedimiento(identificador, exchange);
	}
	
	// M�todo que modificar el procedimiento o servicio
	public void modificarServicio(DatosServicios identificador, Exchange exchange) throws Exception {
		
		servlogic.modificarServicio(identificador, exchange);
	}
	
	public void modificarProcedimiento(DatosProcedimientos identificador, Exchange exchange) throws Exception {
		
		proclogic.modificarProcedimiento(identificador, exchange);
	}
	
	// M�todo que elimina el procedimiento o servicio
	public void eliminarServicio(Id identificador, Exchange exchange) throws Exception {
		
		servlogic.eliminarServicio(identificador, exchange);
	}
	
	public void eliminarProcedimiento(Id identificador, Exchange exchange) throws Exception {
		
		proclogic.eliminarProcedimiento(identificador, exchange);
	}
}
