package es.gobcan.platino.servicios.opendata.business.persistence.dao.impl;

import es.gobcan.platino.servicios.opendata.business.persistence.dao.ServicioDAO;
import es.gobcan.platino.servicios.opendata.business.persistence.entity.ServicioEntity;
import webService.Departamento;
import webService.NivelAdmin;
import webService.UnidadAdmin;

@SuppressWarnings("rawtypes")
public class ServicioDaoImpl extends GenerarDaoImpl implements ServicioDAO{

	@SuppressWarnings({ "unchecked" })
	protected ServicioDaoImpl(Class entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ServicioEntity busquedaUnidad(UnidadAdmin unidad) throws Exception {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("unchecked")
			ServicioEntity objeto = (ServicioEntity) this.getEntityManager().find(entityClass, unidad);
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
	public ServicioEntity busquedaDepartamento(Departamento departamento) throws Exception {
		// TODO Auto-generated method stub
		try {
			ServicioEntity objeto = (ServicioEntity) this.getEntityManager().find(entityClass, departamento);
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
	public ServicioEntity busquedaGestion(NivelAdmin gestion) throws Exception {
		// TODO Auto-generated method stub
		try {
			ServicioEntity objeto = (ServicioEntity) this.getEntityManager().find(entityClass, gestion);
			if (objeto == null) {
				throw new Exception(MENSAJE_ERROR);
			}
			return objeto;
		} catch (Exception e){
			throw new Exception (e.getMessage(), e);
		}
	}

	
}
