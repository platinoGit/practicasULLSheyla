package es.gobcan.platino.servicios.opendata.business.logic;

import org.apache.camel.Exchange;

import es.gobcan.platino.servicios.opendata.business.controller.Controlador;
import webService.DatosServicios;
import webService.Departamento;
import webService.Id;
import webService.NivelAdmin;
import webService.UnidadAdmin;

public class ServiciosLogic {
	
	public Controlador controlador;

	public void crearServicio(DatosServicios identificador, Exchange exchange) throws Exception {
		controlador.crearServicio(identificador, exchange);
	}
	
	public void modificarServicio(DatosServicios identificador, Exchange exchange) throws Exception {
		controlador.modificarServicio(identificador, exchange);
	}
	
	public void eliminarServicio(Id identificador, Exchange exchange) throws Exception {
		controlador.eliminarServicio(identificador,exchange);
	}
	
	public DatosServicios busquedaUnidadAdminServicio(UnidadAdmin uni_adm_resp, Exchange exchange) throws Exception {
		return controlador.busquedaUnidadAdminServicio(uni_adm_resp, exchange);
	}
	
	public DatosServicios busquedaNivelAdminServicio(NivelAdmin nivel_administrativo, Exchange exchange) throws Exception {
		return controlador.busquedaNivelAdminServicio(nivel_administrativo, exchange);
	}
	
	public DatosServicios busquedaDepartamentoServicio(Departamento departamento, Exchange exchange) throws Exception {
		return controlador.busquedaDepartamentoServicio(departamento, exchange);
	}
}
