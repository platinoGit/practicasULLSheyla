package webService;

public enum Departamento {

	// Ejemplo enum: https://jarroba.com/enum-enumerados-en-java-con-ejemplos/
	// Aquí en el WSDL debería ser tipo complex type
	DEPAR1("Dirección General de Patrimonio y Contratación"), 
	DEPAR2("Dirección General del Tesoro y Política Financiera"),
	DEPAR3("Intervención General"), 
	DEPAR4("Secretaría General Técnica"),
	DEPAR5("Agencia Tributaria Canaria"),
	DEPAR6("Servicio Canario de Empleo (SCE)"),
	DEPAR7("Servicio Canario de la Salud (SCS)"),
	DEPAR8("Dirección General de Protección a la Infancia y la Familia"),
	DEPAR9("Dirección General de Derechos Sociales e Inmigración"),
	DEPAR10("Dirección General de Dependencia y Discapacidad"),
	DEPAR11("Dirección General Lucha contra el cambio climático y Medio ambiente"),
	DEPAR12("Dirección General de Transparencia y Participación Ciudadana"),
	DEPAR13("Dirección General de Agricultura"),
	DEPAR14("Dirección General Planificación Territorial, Transición Ecológica y Aguas"),
	DEPAR15("Dirección General de Centros, Infraestructura y Promoción Educativa"),
	DEPAR16("Dirección General de la Función Pública"),
	DEPAR17("Dirección General de Seguridad y Emergencia"),
	DEPAR18("Dirección General de Comercio y Consumo"),
	DEPAR19("Dirección General de Emigración"),
	DEPAR20("Dirección General de Energía"),
	DEPAR21("Dirección General de Ganadería"),
	DEPAR22("Dirección General de Industria"),
	DEPAR23("Dirección General de Patrimonio y Contratación"),
	DEPAR24("Dirección General de Programas Asistenciales"),
	DEPAR25("Dirección General de Recursos Humanos"),
	DEPAR26("Dirección General de Trabajo"),
	DEPAR27("Instituto Canario de Igualdad (ICI)"),
	DEPAR28("Instituto Canario de Vivienda"),
	DEPAR29("Viceconsejería de Administraciones Publicas y Transparencia"),	
	DEPAR30("Viceconsejería de Igualdad y Diversidad"),
	DEPAR31("Viceconsejería de Turismo");
	
	public String departamento;
	
	// Aquí no deja ser público
	private Departamento(String departamento) {
		this.departamento = departamento;
	}
}
