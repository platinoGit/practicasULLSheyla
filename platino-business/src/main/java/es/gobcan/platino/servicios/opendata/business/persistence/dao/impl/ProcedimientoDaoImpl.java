package es.gobcan.platino.servicios.opendata.business.persistence.dao.impl;

import es.gobcan.platino.servicios.opendata.business.persistence.dao.ProcedimientoDAO;
import es.gobcan.platino.servicios.opendata.business.persistence.entity.ProcedimientoEntity;
import webService.Departamento;
import webService.NivelAdmin;
import webService.UnidadAdmin;

@SuppressWarnings("rawtypes")
public class ProcedimientoDaoImpl extends GenerarDaoImpl implements ProcedimientoDAO{

	@SuppressWarnings({ "unchecked" })
	protected ProcedimientoDaoImpl(Class entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProcedimientoEntity busquedaUnidad(UnidadAdmin unidad) throws Exception {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("unchecked")
			ProcedimientoEntity objeto = (ProcedimientoEntity) this.getEntityManager().find(entityClass, unidad);
			if (objeto == null) {
				throw new Exception(MENSAJE_ERROR);
			}
			return objeto;
		} catch (Exception e){
			throw new Exception (e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProcedimientoEntity busquedaDepartamento(Departamento departamento) throws Exception {
		// TODO Auto-generated method stub
		try {
			ProcedimientoEntity objeto = (ProcedimientoEntity) this.getEntityManager().find(entityClass, departamento);
			if (objeto == null) {
				throw new Exception(MENSAJE_ERROR);
			}
			return objeto;
		} catch (Exception e){
			throw new Exception (e.getMessage(), e);
		
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProcedimientoEntity busquedaGestion(NivelAdmin gestion) throws Exception {
		// TODO Auto-generated method stub
		try {
			ProcedimientoEntity objeto = (ProcedimientoEntity) this.getEntityManager().find(entityClass, gestion);
			if (objeto == null) {
				throw new Exception(MENSAJE_ERROR);
			}
			return objeto;
		} catch (Exception e){
			throw new Exception (e.getMessage(), e);
		}
	}

}
