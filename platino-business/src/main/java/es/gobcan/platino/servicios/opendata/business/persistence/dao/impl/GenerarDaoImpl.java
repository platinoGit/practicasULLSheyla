package es.gobcan.platino.servicios.opendata.business.persistence.dao.impl;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import es.gobcan.platino.servicios.opendata.business.persistence.dao.GenericDao;
import webService.Departamento;
import webService.Id;
import webService.NivelAdmin;
import webService.UnidadAdmin;

public abstract class GenerarDaoImpl<E, I extends Serializable> implements GenericDao<E,I> {

	protected static final Logger log = Logger.getLogger(GenerarDaoImpl.class.getCanonicalName());
	public static final String MENSAJE_ERROR = "Elemento no encontrado";
	protected Class<E> entityClass;
	
	@PersistenceContext
	protected EntityManager manager;
	
	protected EntityManager getEntityManager() {
		return this.manager;
	}
	
	@PersistenceContext
	public void setEntityManager (EntityManager entityManager) {
		
		this.manager = entityManager;
	}
	
	protected GenerarDaoImpl(Class<E> entityClass) {
		
		this.entityClass = entityClass;
	}
	
	@Override
	@Transactional
	public void crear(E entidad) throws Exception {
		
		try {
			this.getEntityManager().persist(entidad);
			this.getEntityManager().flush();
		} catch (Exception e) {
			throw new Exception(e.getMessage(),e);
		}
	}
	
	@Override
	@Transactional
	public void eliminar(E entidad) throws Exception {
		try {
			this.getEntityManager().remove(entidad);
			this.getEntityManager().flush();
		} catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}
	}
	
	@Override
	@Transactional
	public void modificar(E entidad) throws Exception {
		
		try {
			this.getEntityManager().refresh(entidad);
			this.getEntityManager().flush();
		} catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}
	}
	
	@Override
	@Transactional
	public E find(E identificador) throws Exception {
		
		try {
			E objeto = this.getEntityManager().find(entityClass, identificador);
			if (objeto == null) {
				throw new Exception(MENSAJE_ERROR);
			}
			return objeto;
		} catch (Exception e) {
			throw new Exception (e.getMessage(), e);
		}

	}
}
