package es.gobcan.platino.servicios.opendata.business.persistence.dao;

import es.gobcan.platino.servicios.opendata.business.persistence.entity.ServicioEntity;
import webService.Departamento;
import webService.NivelAdmin;
import webService.UnidadAdmin;

public interface ServicioDAO extends GenericDao{

	public ServicioEntity busquedaUnidad(UnidadAdmin unidad) throws Exception;
	public ServicioEntity busquedaDepartamento(Departamento departamento) throws Exception;
	public ServicioEntity busquedaGestion(NivelAdmin gestion) throws Exception;

}
