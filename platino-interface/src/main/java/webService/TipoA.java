package webService;

public enum TipoA {
	
	OPCION1("PROCEDIMIENTO"),
	OPCION2("SERVICIO");

	public String tipoa;
	
	// Aqu� no deja ser p�blico
	private TipoA(String tipoa) {
		this.tipoa = tipoa;
	} 

}