package es.gobcan.platino.servicios.opendata.business.persistence.dao;

import java.io.Serializable;

import webService.Departamento;
import webService.Id;
import webService.NivelAdmin;
import webService.UnidadAdmin;

public interface GenericDao <E, I extends Serializable> {
	
	// Aquí habían dicho de pasar los otros métodos a subinterfaces, problema: es poco optimo en ficheros no?
	public void crear(E entidad) throws Exception;
	public void eliminar(E entidad) throws Exception;
	public void modificar(E entidad) throws Exception;
	public E find(E identificador) throws Exception;
}
