package es.gobcan.platino.servicios.opendata.business.logic;

import org.apache.camel.Exchange;

import webService.DatosProcedimientos;
import webService.DatosServicios;
import webService.Departamento;
import webService.Id;
import webService.NivelAdmin;
import webService.UnidadAdmin;

// Este de aquí es el controlador
public class PlatinoWebBusinessLogic {

	private ProcedimientosLogic proclogic;
	private ServiciosLogic servlogic;
	//Falta: hacer referencia a las clases que llamo y mirar el tipo de dato que devuelve
	
	// Búsqueda por unidad administrativa
	
	public DatosServicios busquedaUnidadAdminServicio(UnidadAdmin uni_adm_resp, Exchange exchange) throws Exception {
		
		return servlogic.busquedaUnidadAdminServicio(uni_adm_resp, exchange);
	}
	
	public DatosProcedimientos busquedaUnidadAdminProcedimiento(UnidadAdmin uni_adm_resp, Exchange exchange) throws Exception {
		
		return proclogic.busquedaUnidadAdminProcedimiento(uni_adm_resp, exchange);
	}
	// Búsqueda por departamento
	
	public DatosServicios busquedaDepartamentoServicio(Departamento departamento, Exchange exchange) throws Exception {
		
		return servlogic.busquedaDepartamentoServicio(departamento, exchange);
	}
	
	public DatosProcedimientos busquedaDepartamentoProcedimiento(Departamento departamento, Exchange exchange) throws Exception {
		
		return proclogic.busquedaDepartamentoProcedimiento(departamento, exchange);
	}
	// Búsqueda por gestión administrativa
	
	public DatosServicios busquedaNivelAdminServicio(NivelAdmin nivel_administrativo, Exchange exchange) throws Exception {
		
		return servlogic.busquedaNivelAdminServicio(nivel_administrativo, exchange);
	}
	
	public DatosProcedimientos busquedaNivelAdminProcedimiento(NivelAdmin nivel_administrativo, Exchange exchange) throws Exception {
		
		return proclogic.busquedaNivelAdminProcedimiento(nivel_administrativo, exchange);
	}
	
	
	// Método que crea el nuevo procedimiento o servicio
	public void crearServicio(Id identificador, Exchange exchange) throws Exception {
		
		servlogic.crearServicio(identificador, exchange);
	}
	
	public void crearProcedimiento(Id identificador, Exchange exchange) throws Exception {
		
		proclogic.crearProcedimiento(identificador, exchange);
	}
	
	// Método que modificar el procedimiento o servicio
	public void modificarServicio(Id identificador, Exchange exchange) throws Exception {
		
		servlogic.modificarServicio(identificador, exchange);
	}
	
	public void modificarProcedimiento(Id identificador, Exchange exchange) throws Exception {
		
		proclogic.modificarProcedimiento(identificador, exchange);
	}
	
	// Método que elimina el procedimiento o servicio
	public void eliminarServicio(Id identificador, Exchange exchange) throws Exception {
		
		servlogic.eliminarServicio(identificador, exchange);
	}
	
	public void eliminarProcedimiento(Id identificador, Exchange exchange) throws Exception {
		
		proclogic.eliminarProcedimiento(identificador, exchange);
	}
}
