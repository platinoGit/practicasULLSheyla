package es.gobcan.platino.servicios.opendata.business.persistence.dao;

import java.io.Serializable;

import webService.Departamento;
import webService.Id;
import webService.NivelAdmin;
import webService.UnidadAdmin;

public interface GenericDao <E, I extends Serializable> {
	
	public void crear(E entidad) throws Exception;
	public void eliminar(E entidad) throws Exception;
	public void modificar(E entidad) throws Exception;
	public E busquedaUnidad(E unidad) throws Exception;
	public E busquedaDepartamento(E departamento) throws Exception;
	public E busquedaGestion(E gestion) throws Exception;
	public E find(E identificador) throws Exception;
	public void update(E entidad) throws Exception;

	// no sé si añadir operaciones adicionales
}
