package webService;

public enum TipoA {
	
	OPCION1("PROCEDIMIENTO"),
	OPCION2("SERVICIO");

	public String tipoa;
	
	// Aquí no deja ser público
	private TipoA(String tipoa) {
		this.tipoa = tipoa;
	} 

}
