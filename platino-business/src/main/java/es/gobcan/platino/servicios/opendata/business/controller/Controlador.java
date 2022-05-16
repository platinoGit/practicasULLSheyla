package es.gobcan.platino.servicios.opendata.business.controller;

import javax.transaction.Transactional;

import org.apache.camel.Exchange;

import es.gobcan.platino.servicios.opendata.business.mappers.ProcedimientoMapper;
import es.gobcan.platino.servicios.opendata.business.mappers.ServicioMapper;
import es.gobcan.platino.servicios.opendata.business.persistence.dao.GenericDao;
import es.gobcan.platino.servicios.opendata.business.persistence.dao.impl.GenerarDaoImpl;
import es.gobcan.platino.servicios.opendata.business.persistence.dao.impl.ProcedimientoDaoImpl;
import es.gobcan.platino.servicios.opendata.business.persistence.dao.impl.ServicioDaoImpl;
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
	
	public ProcedimientoDaoImpl procc;
	public ServicioDaoImpl servi;

	@Transactional
	public void crearProcedimiento(DatosProcedimientos identificador, Exchange exchange) {
		// TODO Auto-generated method stub
		ProcedimientoEntity proc = Mappers.getMapper(ProcedimientoMapper.class).procedimientoToEntidad(identificador);
		try {
			procc.crear(proc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@Transactional
	public void modificarProcedimiento(DatosProcedimientos identificador, Exchange exchange) {
		// TODO Auto-generated method stub
		ProcedimientoEntity proc = Mappers.getMapper(ProcedimientoMapper.class).procedimientoToEntidad(identificador);
		try {
			procc.modificar(proc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Transactional
	public void eliminarProcedimiento(Id identificador, Exchange exchange) {
		// TODO Auto-generated method stub
		try {
			procc.eliminar(identificador);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public DatosProcedimientos busquedaUnidadAdminProcedimiento(UnidadAdmin uni_adm_resp, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ProcedimientoEntity var = procc.busquedaUnidad(uni_adm_resp);
		return Mappers.getMapper(ProcedimientoMapper.class).entidadToProcedimiento(var);
		
	}
	
	@Transactional
	public DatosProcedimientos busquedaNivelAdminProcedimiento(NivelAdmin nivel_administrativo, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ProcedimientoEntity var = procc.busquedaGestion(nivel_administrativo);
		return Mappers.getMapper(ProcedimientoMapper.class).entidadToProcedimiento(var);
	}
	
	@Transactional
	public DatosProcedimientos busquedaDepartamentoProcedimiento(Departamento departamento, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ProcedimientoEntity var = procc.busquedaDepartamento(departamento);
		return Mappers.getMapper(ProcedimientoMapper.class).entidadToProcedimiento(var);
	}

	@Transactional
	public void crearServicio(DatosServicios identificador, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ServicioEntity serv = Mappers.getMapper(ServicioMapper.class).servicioToEntidad(identificador);
		servi.crear(serv);
		
	}
	
	@Transactional
	public void modificarServicio(DatosServicios identificador, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ServicioEntity serv = Mappers.getMapper(ServicioMapper.class).servicioToEntidad(identificador);
		servi.modificar(serv);
	}

	@Transactional
	public void eliminarServicio(Id identificador, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		servi.eliminar(identificador);
	}
	
	@Transactional
	public DatosServicios busquedaUnidadAdminServicio(UnidadAdmin uni_adm_resp, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ServicioEntity var = servi.busquedaUnidad(uni_adm_resp);
		return Mappers.getMapper(ServicioMapper.class).entidadToServicio(var);
	}
	
	@Transactional
	public DatosServicios busquedaNivelAdminServicio(NivelAdmin nivel_administrativo, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ServicioEntity var = servi.busquedaGestion(nivel_administrativo);
		return Mappers.getMapper(ServicioMapper.class).entidadToServicio(var);
	}

	@Transactional
	public DatosServicios busquedaDepartamentoServicio(Departamento departamento, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ServicioEntity var = servi.busquedaDepartamento(departamento);
		return Mappers.getMapper(ServicioMapper.class).entidadToServicio(var);
	}


}
