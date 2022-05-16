package es.gobcan.platino.servicios.opendata.business.persistence.dao;

import es.gobcan.platino.servicios.opendata.business.persistence.entity.ProcedimientoEntity;
import webService.Departamento;
import webService.NivelAdmin;
import webService.UnidadAdmin;

public interface ProcedimientoDAO extends GenericDao {

	public ProcedimientoEntity busquedaUnidad(UnidadAdmin unidad) throws Exception;
	public ProcedimientoEntity busquedaDepartamento(Departamento departamento) throws Exception;
	public ProcedimientoEntity busquedaGestion(NivelAdmin gestion) throws Exception;

}
