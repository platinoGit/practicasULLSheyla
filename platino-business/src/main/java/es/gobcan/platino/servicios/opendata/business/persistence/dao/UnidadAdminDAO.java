package es.gobcan.platino.servicios.opendata.business.persistence.dao;

import webService.UnidadAdmin;

public interface UnidadAdminDAO<E> extends GenericDao{

	public E busquedaUnidad(UnidadAdmin unidad) throws Exception;
	
}
