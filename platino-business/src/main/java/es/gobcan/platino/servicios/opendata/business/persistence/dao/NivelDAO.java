package es.gobcan.platino.servicios.opendata.business.persistence.dao;

import webService.NivelAdmin;

public interface NivelDAO<E> extends GenericDao{
	
	public E busquedaUnidad(NivelAdmin unidad) throws Exception;

}
