package es.gobcan.platino.servicios.opendata.business.test;

import static org.junit.Assert.assertEquals;

import es.gobcan.platino.servicios.opendata.business.persistence.dao.impl.ProcedimientoDaoImpl;
import es.gobcan.platino.servicios.opendata.business.persistence.dao.impl.ServicioDaoImpl;
import es.gobcan.platino.servicios.opendata.business.persistence.entity.ProcedimientoEntity;
import es.gobcan.platino.servicios.opendata.business.persistence.entity.ServicioEntity;
import webService.Departamento;
import webService.NivelAdmin;
import webService.UnidadAdmin;

public class Test {

	ServicioDaoImpl servicio;
	ProcedimientoDaoImpl proc;
	
	public void TestUnidadServicio() throws Exception {
		
		UnidadAdmin unidad = null; // aquí faltaría llamar al setter para comprobar darle valor
		ServicioEntity ent = servicio.busquedaUnidad(unidad);
		assertEquals("aquí iría lo que espero", ent);
	}
	
	public void TestDepartamentoProcedimiento() throws Exception {
		
		Departamento depart = null; // aquí faltaría llamar al setter para comprobar darle valor
		ProcedimientoEntity ent = proc.busquedaDepartamento(depart);
		assertEquals("aquí iría lo que espero", ent);
	}
	
	public void TestNivelServicio() throws Exception {
		
		NivelAdmin nivel = null; // aquí faltaría llamar al setter para comprobar darle valor
		ServicioEntity ent = servicio.busquedaGestion(nivel);
		assertEquals("aquí iría lo que espero", ent);
	}
}