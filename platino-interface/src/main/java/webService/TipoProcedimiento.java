package webService;

public enum TipoProcedimiento {

	OPCION1("COMUNICACION_PREVIA_DECLARACION_RESPONSABLE"),
	OPCION2("OTRO_PROCEDIMIENTO"),
	OPCION3("SUBVENCIONES_PREMIOS_BECAS");

	public String tipo;
	
	// Aquí no deja ser público
	private TipoProcedimiento(String tipo) {
		this.tipo = tipo;
	} 
}
