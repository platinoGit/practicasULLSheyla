package es.gobcan.platino.servicios.opendata.business.mappers;

import es.gobcan.platino.servicios.opendata.business.persistence.entity.ProcedimientoEntity;
import webService.DatosProcedimientos;

public interface ProcedimientoMapper {

	//Métodos para conversiones
	ProcedimientoEntity procedimientoToEntidad(DatosProcedimientos servicio);
	DatosProcedimientos entidadToProcedimiento(ProcedimientoEntity servicioEntity);
}
