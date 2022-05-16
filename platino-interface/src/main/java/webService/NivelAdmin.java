package webService;

public enum NivelAdmin {

	// Aqu� en el WSDL deber�a ser tipo complex type
	NIVEL_4("Tramitaci�n electr�nica completa"), NIVEL_3("Descarga y env�o electr�nico de formularios"), NIVEL_2("Descarga formularios"), NIVEL_1("Informaci�n");

	public String nivelAdmin;
	
	// Aqu� no deja ser p�blico
	private NivelAdmin(String nivelAdmin) {
		this.nivelAdmin = nivelAdmin;
	} 
}
