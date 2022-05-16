package es.gobcan.platino.servicios.opendata.business.mappers;

import es.gobcan.platino.servicios.opendata.business.persistence.entity.ServicioEntity;
import webService.DatosServicios;

public class ServicioMapperImpl implements ServicioMapper{

	ServicioEntity prueba;
	DatosServicios prueba2;
	@Override
	public ServicioEntity servicioToEntidad(DatosServicios servicio) {
		// TODO Auto-generated method stub
		return prueba;
	}

	@Override
	public DatosServicios entidadToServicio(ServicioEntity servicioEntity) {
		// TODO Auto-generated method stub
		return prueba2;
	}

}
