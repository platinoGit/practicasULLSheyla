package webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService (
		targetNamespace = "http://datos.abiertos.es/platino",
		name = "platinoInterface",
		portName = "PlatinoWebServicePortType",
		serviceName = "platinoInterface"
		)
public interface WebPlatinoInterface {
	
	@WebMethod
	@WebResult(name="busquedaUnidadAdmin")
	Datos busquedaUnidad(@WebParam (name = "busquedaUnidad") UnidadAdmin unidad_admin);
	
	@WebMethod
	@WebResult(name="busquedaDepartamento")
	Datos busquedaDepart(@WebParam (name = "busquedaDepart") Departamento departamento);

	@WebMethod
	@WebResult(name="busquedaNivelAdmin")
	Datos busquedaNivel(@WebParam (name = "busquedaNivel") NivelAdmin nivel_admin);

	@WebMethod
	@WebResult(name="crear")
	Datos crearDato(@WebParam (name = "crearDato") Id identificador);

	@WebMethod
	@WebResult(name="eliminar")
	void eliminarDato(@WebParam (name = "eliminarDato") Id identificador);
	
	@WebMethod
	@WebResult(name="modificar")
	void modificarDato(@WebParam (name = "modificarDato") Id identificador);


}
