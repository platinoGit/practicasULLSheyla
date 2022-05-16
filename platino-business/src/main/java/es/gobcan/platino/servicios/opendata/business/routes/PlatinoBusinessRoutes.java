package es.gobcan.platino.servicios.opendata.Business.routes;

import org.apache.camel.builder.RouteBuilder;

public class PlatinoBusinessRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		// Redireccionar los métodos al platinoWebBusinessLogic
		
		from(PlatinoBusinessRoutes.BUSINESS_ROUTES).routeId("platino-Business")
		
			.doTry()
			.choice()
			
			//Aquí preguntamos por los métodos  
			
			//Búsqueda por unidad administrativa
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.UNIDAD_ADMINISTRATIVA_SERVICIO))
			.to("bean:BusinessLogic?method=busquedaUnidadAdminServicio")
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.UNIDAD_ADMINISTRATIVA_PROCEDIMIENTO))
			.to("bean:BusinessLogic?method=busquedaUnidadAdminProcedimiento")
			
			//Búsqueda por departamento
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.DEPARTAMENTO_SERVICO))
			.to("bean:BusinessLogic?method=busquedaDepartamentoServicio")
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.DEPARTAMENTO_PROCEDIMIENTO))
			.to("bean:BusinessLogic?method=busquedaDepartamentoProcedimiento")
			
			//Búsqueda por gestión administrativa
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.GESTION_ADMINISTRATIVA_SERVICIOS))
			.to("bean:BusinessLogic?method=busquedaNivelAdminServicio")
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.GESTION_ADMINISTRATIVA_PROCEDIMIENTOS))
			.to("bean:BusinessLogic?method=busquedaNivelAdminProcedimiento")
			
			//Crear procedimiento o servicio
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.CREAR_SERVICIOS))
			.to("bean:BusinessLogic?method=crearServicio")
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.CREAR_PROCEDIMIENTOS))
			.to("bean:BusinessLogic?method=crearProcedimiento")
			
			//Modificar procedimiento o servicio
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.MODIFICAR_SERVICIOS))
			.to("bean:BusinessLogic?method=modificarServicio")
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.MODIFICAR_PROCEDIMIENTOS))
			.to("bean:BusinessLogic?method=modificarProcedimiento")
			
			//Eliminar procedimiento o servicio
			
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.ELIMINAR_SERVICIOS))
			.to("bean:BusinessLogic?method=eliminarServicio")
			
			.when(header(OPERATION_SERVICE).isEqualTo(PlatinoOperations.ELIMINAR_PROCEDIMIENTOS))
			.to("bean:BusinessLogic?method=eliminarProcedimiento")
			
	}
}
