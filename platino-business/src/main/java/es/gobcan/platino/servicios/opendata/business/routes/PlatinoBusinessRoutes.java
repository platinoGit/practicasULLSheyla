package es.gobcan.platino.servicios.opendata.business.routes;

import org.apache.camel.builder.RouteBuilder;

public class PlatinoBusinessRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		//Recordar que no tengo declaradas las opciones
		// Como puedo redireccionar los m�todos al platinoWebBusinessLogic
		
		from(PlatinoRoutes.BUSSINES_ROUTES).routeId(PlatinoRoutes.BUSINESS_ROUTE_ID)
		
			.doTry()
			.choice()
			
			//Aqu� preguntamos por los m�todos  
			
			//B�squeda por unidad administrativa
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.UNIDAD_ADMINISTRATIVA_SERVICIO))
			.to(PlatinoBusinessRouteName.UNIDAD_ADMINISTRATIVA_SERVICIO)
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.UNIDAD_ADMINISTRATIVA_PROCEDIMIENTO))
			.to(PlatinoBusinessRouteName.UNIDAD_ADMINISTRATIVA_PROCEDIMIENTO)
			
			//B�squeda por departamento
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.DEPARTAMENTO_SERVICO))
			.to(PlatinoBusinessRouteName.DEPARTAMENTO_SERVICIO)
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.DEPARTAMENTO_PROCEDIMIENTO))
			.to(PlatinoBusinessRouteName.DEPARTAMENTO_PROCEDIMIENTO)
			
			//B�squeda por gesti�n administrativa
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.GESTION_ADMINISTRATIVA_SERVICIOS))
			.to(PlatinoBusinessRouteName.GESTION_ADMINISTRATIVA_SERVICIOS)
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.GESTION_ADMINISTRATIVA_PROCEDIMIENTOS))
			.to(PlatinoBusinessRouteName.GESTION_ADMINISTRATIVA_PROCEDIMIENTOS)
			
			//Crear procedimiento o servicio
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.CREAR_SERVICIOS))
			.to(PlatinoBusinessRouteName.CREAR_SERVICIOS)
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.CREAR_PROCEDIMIENTOS))
			.to(PlatinoBusinessRouteName.CREAR_PROCEDIMIENTOS)
			
			//Modificar procedimiento o servicio
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.MODIFICAR_SERVICIOS))
			.to(PlatinoBusinessRouteName.MODIFICAR_SERVICIOS)
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.MODIFICAR_PROCEDIMIENTOS))
			.to(PlatinoBusinessRouteName.MODIFICAR_PROCEDIMIENTOS)
			
			//Eliminar procedimiento o servicio
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.ELIMINAR_SERVICIOS))
			.to(PlatinoBusinessRouteName.ELIMINAR_SERVICIOS)
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.ELIMINAR_PROCEDIMIENTOS))
			.to(PlatinoBusinessRouteName.ELIMINAR_PROCEDIMIENTOS)
			
	}
}
