package es.gobcan.platino.servicios.opendata.entrypoint.logic;

import org.apache.camel.builder.RouteBuilder;

// Esto viene del ejemplo del Chema, hay que mofificarlo

public class RouteBuilderServices extends RouteBuilder{

	public static final String OPERATION_SERVICE = "operationService";
	public static final String SOAP_ACTION = "SOAPAction";
	public static final String GET_VERSION = "getVersion";
	public static final String DIRECT_VM = "direct-vm:";
	public static final String METHOD = "?method=";
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	
}
