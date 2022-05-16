package webService;

public enum UnidadAdmin {

	OPCION1("Conserjería de Administraciones Públicas, Justicia y Seguridad"),
	OPCION2("Conserjería de Agricultura, Ganadería y Pesca"),
	OPCION3("Conserjería de Derechos Sociales, Igualdad, Diversidad y Juventud"),
	OPCION4("Conserjería de Economía, Conocimiento y Empleo"),
	OPCION5("Conserjería de Educación, Universidades, Cultura y Deportes"),
	OPCION6("Conserjería de Hacienda, Presupuestos y Asuntos Europeos"),
	OPCION7("Conserjería de Obras Públicas, Transportes y Vivienda"),
	OPCION8("Conserjería de Sanidad"),
	OPCION9("Conserjería de Transición Ecológica, Lucha contra el Cambio Climático y Planificación Territorial"),
	OPCION10("Conserjería de Turismo, Industria y Comercio"),
	OPCION11("Presidencia del Gobierno");

	public String unidadAdmin;
	
	// Aquí no deja ser público
	private UnidadAdmin(String unidadAdmin) {
		this.unidadAdmin = unidadAdmin;
	} 


	
	
}
