package es.gobcan.platino.servicios.opendata.business.mappers;

import es.gobcan.platino.servicios.opendata.business.persistence.entity.ServicioEntity;
import webService.DatosServicios;

public interface ServicioMapper {

	//Conversiones (de servicio entity a servicio normal y viceversa)
	
	ServicioEntity servicioToEntidad(DatosServicios servicio);
	DatosServicios entidadToServicio(ServicioEntity servicioEntity);
}
