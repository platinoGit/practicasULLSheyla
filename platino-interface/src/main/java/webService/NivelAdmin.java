package webService;

public enum NivelAdmin {

	// Aquí en el WSDL debería ser tipo complex type
	NIVEL_4("Tramitación electrónica completa"), NIVEL_3("Descarga y envío electrónico de formularios"), NIVEL_2("Descarga formularios"), NIVEL_1("Información");

	public String nivelAdmin;
	
	// Aquí no deja ser público
	private NivelAdmin(String nivelAdmin) {
		this.nivelAdmin = nivelAdmin;
	} 
}
