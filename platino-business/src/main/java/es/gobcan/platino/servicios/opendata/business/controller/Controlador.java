package es.gobcan.platino.servicios.opendata.business.controller;

import javax.transaction.Transactional;

import org.apache.camel.Exchange;

import es.gobcan.platino.servicios.opendata.business.mappers.Mapper;
import es.gobcan.platino.servicios.opendata.business.persistence.dao.GenericDao;
import es.gobcan.platino.servicios.opendata.business.persistence.dao.impl.GenerarDaoImpl;
import es.gobcan.platino.servicios.opendata.business.persistence.entity.ProcedimientoEntity;
import es.gobcan.platino.servicios.opendata.business.persistence.entity.ServicioEntity;
import webService.DatosProcedimientos;
import webService.DatosServicios;
import webService.Departamento;
import webService.Id;
import webService.NivelAdmin;
import webService.UnidadAdmin;
import org.mapstruct.factory.Mappers;

public class Controlador {
	
	
	public GenerarDaoImpl dao;

	@Transactional
	public void crearProcedimiento(Id identificador, Exchange exchange) {
		// TODO Auto-generated method stub
		ProcedimientoEntity proc = Mappers.getMapper(Mapper.class).prueba(identificador);
		dao.crear(proc); // Sí debería crear aquí también metodos separados para servicios o procedimientos
	}
	
	@Transactional
	public void modificarProcedimiento(Id identificador, Exchange exchange) {
		// TODO Auto-generated method stub
		ProcedimientoEntity proc = Mappers.getMapper(Mapper.class).prueba(identificador);
		dao.modificar(proc);
	}
	
	@Transactional
	public void eliminarProcedimiento(Id identificador, Exchange exchange) {
		// TODO Auto-generated method stub
		ProcedimientoEntity proc = Mappers.getMapper(Mapper.class).prueba(identificador);
		dao.eliminar(proc);
	}

	@Transactional
	public Object busquedaUnidadAdminProcedimiento(UnidadAdmin uni_adm_resp, Exchange exchange) {
		// TODO Auto-generated method stub
		ProcedimientoEntity proc = Mappers.getMapper(Mapper.class).prueba(uni_adm_resp);
		return dao.busquedaUnidad(proc);
	}
	
	@Transactional
	public Object busquedaNivelAdminProcedimiento(NivelAdmin nivel_administrativo, Exchange exchange) {
		// TODO Auto-generated method stub
		ProcedimientoEntity proc = Mappers.getMapper(Mapper.class).prueba(nivel_administrativo);
		return dao.busquedaGestion(proc);
	}
	
	@Transactional
	public Object busquedaDepartamentoProcedimiento(Departamento departamento, Exchange exchange) {
		// TODO Auto-generated method stub
		ProcedimientoEntity proc = Mappers.getMapper(Mapper.class).prueba(departamento);
		return dao.busquedaDepartamento(proc);
	}

	@Transactional
	public void crearServicio(Id identificador, Exchange exchange) {
		// TODO Auto-generated method stub
		ServicioEntity serv = Mappers.getMapper(Mapper.class).prueba(identificador);
		dao.crear(serv);
		
	}
	
	@Transactional
	public void modificarServicio(Id identificador, Exchange exchange) {
		// TODO Auto-generated method stub
		ServicioEntity serv = Mappers.getMapper(Mapper.class).prueba(identificador);
		dao.modificar(serv);
	}

	@Transactional
	public void eliminarServicio(Id identificador, Exchange exchange) {
		// TODO Auto-generated method stub
		ServicioEntity serv = Mappers.getMapper(Mapper.class).prueba(identificador);
		dao.eliminar(serv);
	}
	
	@Transactional
	public Object busquedaUnidadAdminServicio(UnidadAdmin uni_adm_resp, Exchange exchange) {
		// TODO Auto-generated method stub
		ServicioEntity serv = Mappers.getMapper(Mapper.class).prueba(uni_adm_resp);
		return dao.busquedaUnidad(serv);
	}
	
	@Transactional
	public Object busquedaNivelAdminServicio(NivelAdmin nivel_administrativo, Exchange exchange) {
		// TODO Auto-generated method stub
		ServicioEntity serv = Mappers.getMapper(Mapper.class).prueba(nivel_administrativo);
		return dao.busquedaGestion(serv);
	}

	@Transactional
	public Object busquedaDepartamentoServicio(Departamento departamento, Exchange exchange) {
		// TODO Auto-generated method stub
		ServicioEntity serv = Mappers.getMapper(Mapper.class).prueba(departamento);
		return dao.busquedaDepartamento(serv);
	}


}
