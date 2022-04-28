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

	public void crearServicio(Id identificador, Exchange exchange) {
		controlador.crearServicio(identificador, exchange);
	}
	
	public void modificarServicio(Id identificador, Exchange exchange) {
		controlador.modificarServicio(identificador, exchange);
	}
	
	public void eliminarServicio(Id identificador, Exchange exchange) {
		controlador.eliminarServicio(identificador,exchange);
	}
	
	public DatosServicios busquedaUnidadAdminServicio(UnidadAdmin uni_adm_resp, Exchange exchange) {
		return controlador.busquedaUnidadAdminServicio(uni_adm_resp, exchange);
	}
	
	public DatosServicios busquedaNivelAdminServicio(NivelAdmin nivel_administrativo, Exchange exchange) {
		return controlador.busquedaNivelAdminServicio(nivel_administrativo, exchange);
	}
	
	public DatosServicios busquedaDepartamentoServicio(Departamento departamento, Exchange exchange) {
		return controlador.busquedaDepartamentoServicio(departamento, exchange);
	}
}
