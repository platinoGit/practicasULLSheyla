package webService;

public enum Departamento {

	// Ejemplo enum: https://jarroba.com/enum-enumerados-en-java-con-ejemplos/
	// Aqu� en el WSDL deber�a ser tipo complex type
	DEPAR1("Direcci�n General de Patrimonio y Contrataci�n"), 
	DEPAR2("Direcci�n General del Tesoro y Pol�tica Financiera"),
	DEPAR3("Intervenci�n General"), 
	DEPAR4("Secretar�a General T�cnica"),
	DEPAR5("Agencia Tributaria Canaria"),
	DEPAR6("Servicio Canario de Empleo (SCE)"),
	DEPAR7("Servicio Canario de la Salud (SCS)"),
	DEPAR8("Direcci�n General de Protecci�n a la Infancia y la Familia"),
	DEPAR9("Direcci�n General de Derechos Sociales e Inmigraci�n"),
	DEPAR10("Direcci�n General de Dependencia y Discapacidad"),
	DEPAR11("Direcci�n General Lucha contra el cambio clim�tico y Medio ambiente"),
	DEPAR12("Direcci�n General de Transparencia y Participaci�n Ciudadana"),
	DEPAR13("Direcci�n General de Agricultura"),
	DEPAR14("Direcci�n General Planificaci�n Territorial, Transici�n Ecol�gica y Aguas"),
	DEPAR15("Direcci�n General de Centros, Infraestructura y Promoci�n Educativa"),
	DEPAR16("Direcci�n General de la Funci�n P�blica"),
	DEPAR17("Direcci�n General de Seguridad y Emergencia"),
	DEPAR18("Direcci�n General de Comercio y Consumo"),
	DEPAR19("Direcci�n General de Emigraci�n"),
	DEPAR20("Direcci�n General de Energ�a"),
	DEPAR21("Direcci�n General de Ganader�a"),
	DEPAR22("Direcci�n General de Industria"),
	DEPAR23("Direcci�n General de Patrimonio y Contrataci�n"),
	DEPAR24("Direcci�n General de Programas Asistenciales"),
	DEPAR25("Direcci�n General de Recursos Humanos"),
	DEPAR26("Direcci�n General de Trabajo"),
	DEPAR27("Instituto Canario de Igualdad (ICI)"),
	DEPAR28("Instituto Canario de Vivienda"),
	DEPAR29("Viceconsejer�a de Administraciones Publicas y Transparencia"),	
	DEPAR30("Viceconsejer�a de Igualdad y Diversidad"),
	DEPAR31("Viceconsejer�a de Turismo");
	
	public String departamento;
	
	// Aqu� no deja ser p�blico
	private Departamento(String departamento) {
		this.departamento = departamento;
	}
}
