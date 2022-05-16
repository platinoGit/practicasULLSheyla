package es.gobcan.platino.servicios.opendata.business.mappers;

import es.gobcan.platino.servicios.opendata.business.persistence.entity.ProcedimientoEntity;
import webService.DatosProcedimientos;

public class ProcedimientoMapperImpl implements ProcedimientoMapper{

	//NOTA: aquí iría la conversión, pero he puesto esto de prueba
	ProcedimientoEntity prueba;
	DatosProcedimientos prueba2;
	@Override
	public ProcedimientoEntity procedimientoToEntidad(DatosProcedimientos servicio) {
		// TODO Auto-generated method stub
		return prueba;
	}

	@Override
	public DatosProcedimientos entidadToProcedimiento(ProcedimientoEntity servicioEntity) {
		// TODO Auto-generated method stub
		return prueba2;
	}

}
