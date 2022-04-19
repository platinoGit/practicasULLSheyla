package es.gobcan.platino.servicios.opendata.business.routes;

public class PlatinoBusinessRoutes extends RouteBuildService {

	public void configure() throws Exception {
		
		//Recordar que no tengo declaradas las opciones
		
		from(PlatinoRoutes.BUSSINES_ROUTES).routeId(PlatinoRoutes.BUSINESS_ROUTE_ID)
		
			.doTry()
			.choice()
			
			//Aqu� preguntamos por los m�todos  
			
			//B�squeda por unidad administrativa
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.UNIDAD_ADMINISTRATIVA))
			.to(PlatinoBusinessRouteName.UNIDAD_ADMINISTRATIVA)
			
			//B�squeda por departamento
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.DEPARTAMENTO))
			.to(PlatinoBusinessRouteName.DEPARTAMENTO)
			
			//B�squeda por gesti�n administrativa
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.GESTION_ADMINISTRATIVA))
			.to(PlatinoBusinessRouteName.GESTION_ADMINISTRATIVA)
			
			//Crear procedimiento o servicio
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.CREAR))
			.to(PlatinoBusinessRouteName.CREAR)
			
			//Modificar procedimiento o servicio
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.MODIFICAR))
			.to(PlatinoBusinessRouteName.MODIFICAR)
			
			//Eliminar procedimiento o servicio
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.ELIMINAR))
			.to(PlatinoBusinessRouteName.ELIMINAR)
			
	}
}
