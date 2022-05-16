package es.gobcan.platino.servicios.opendata.business.persistence.dao;

import webService.Departamento;

public interface DepartamentoDAO<E> extends GenericDao {

	public E busquedaDepartamento(Departamento departamento) throws Exception;

}
