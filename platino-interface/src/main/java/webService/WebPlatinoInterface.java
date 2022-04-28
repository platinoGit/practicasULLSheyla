package webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

// Todavía hay errores al compilar

@WebService(
		name = "platinoInterface",
		serviceName = "platinoInterface",
		portName = "PlatinoWebServicePortType",
		targetNamespace = "http://datos.abiertos.es/platino"

		)
public interface WebPlatinoInterface {
	
	// Para los servicios
	@WebMethod
	@WebResult(name="busquedaUnidadAdminServicio")
	DatosServicios busquedaUnidadServicio(@WebParam(name = "uni_adm_resp") UnidadAdmin uni_adm_resp);
	
	@WebMethod
	@WebResult(name="busquedaDepartamentoServicio")
	DatosServicios busquedaDepartServicio(@WebParam(name = "departamento") Departamento departamento);

	@WebMethod
	@WebResult(name="busquedaNivelAdminServicio")
	DatosServicios busquedaNivelServicio(@WebParam(name = "nivel_administrativo") NivelAdmin nivel_administrativo);

	@WebMethod
	@WebResult(name="crearServicio")
	void crearDatoServicio(@WebParam(name = "identificador") Id identificador);

	@WebMethod
	@WebResult(name="eliminarServicio")
	void eliminarDatoServicio(@WebParam(name = "identificador") Id identificador);
	
	@WebMethod
	@WebResult(name="modificarServicio")
	void modificarDatoServicio(@WebParam(name = "identificador") Id identificador);
	
	//Para los procedimientos

	@WebMethod
	@WebResult(name="busquedaUnidadAdminProcedimiento")
	DatosProcedimientos busquedaUnidadProcedimiento(@WebParam(name = "uni_adm_resp") UnidadAdmin uni_adm_resp);
	
	@WebMethod
	@WebResult(name="busquedaDepartamentoProcedimiento")
	DatosProcedimientos busquedaDepartProcedimiento(@WebParam(name = "departamento") Departamento departamento);

	@WebMethod
	@WebResult(name="busquedaNivelAdminProcedimiento")
	DatosProcedimientos busquedaNivelProcedimiento(@WebParam(name = "nivel_administrativo") NivelAdmin nivel_administrativo);

	@WebMethod
	@WebResult(name="crearProcedimiento")
	void crearDatoProcedimiento(@WebParam(name = "identificador") Id identificador);

	@WebMethod
	@WebResult(name="eliminarProcedimiento")
	void eliminarDatoProcedimiento(@WebParam(name = "identificador") Id identificador);
	
	@WebMethod
	@WebResult(name="modificarProcedimiento")
	void modificarDatoProcedimiento(@WebParam(name = "identificador") Id identificador);


}
