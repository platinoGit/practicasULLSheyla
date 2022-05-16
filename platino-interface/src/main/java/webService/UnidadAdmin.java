package webService;

public enum UnidadAdmin {

	OPCION1("Conserjer�a de Administraciones P�blicas, Justicia y Seguridad"),
	OPCION2("Conserjer�a de Agricultura, Ganader�a y Pesca"),
	OPCION3("Conserjer�a de Derechos Sociales, Igualdad, Diversidad y Juventud"),
	OPCION4("Conserjer�a de Econom�a, Conocimiento y Empleo"),
	OPCION5("Conserjer�a de Educaci�n, Universidades, Cultura y Deportes"),
	OPCION6("Conserjer�a de Hacienda, Presupuestos y Asuntos Europeos"),
	OPCION7("Conserjer�a de Obras P�blicas, Transportes y Vivienda"),
	OPCION8("Conserjer�a de Sanidad"),
	OPCION9("Conserjer�a de Transici�n Ecol�gica, Lucha contra el Cambio Clim�tico y Planificaci�n Territorial"),
	OPCION10("Conserjer�a de Turismo, Industria y Comercio"),
	OPCION11("Presidencia del Gobierno");

	public String unidadAdmin;
	
	// Aqu� no deja ser p�blico
	private UnidadAdmin(String unidadAdmin) {
		this.unidadAdmin = unidadAdmin;
	} 


	
	
}