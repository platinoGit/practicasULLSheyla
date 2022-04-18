package webService;

import javax.xml.bind.annotation.*;

@XmlType(name = "Datos", propOrder = {
		"_id",
		"codigo",
		"nombre",
		"nombre_especifico",
		"departamento",
		"uni_adm_resp",
		"ruta",
		"tipo_actuacion",
		"familia",
		"procedimiento",
		"inicio_tramite",
		"ambito",
		"nivel_administrativo",
		"codigo_sia",
		"fecha_actualizacion_sia",
		"fecha_publicacion",
		"last_modification_date",
		"fecha_inicio",
		"fecha_fin",
		"observaciones_plazo"

})
public abstract class Datos {

	// Tipo_actuacion: definida en las hijas. Por otro lado, tipo procedimiento y familia solo en procedimientos

	protected Id _id;
	/**
	 * @return the _id
	 */
	public Id get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(Id _id) {
		this._id = _id;
	}
	/**
	 * @return the codigo
	 */
	public Codigo getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Codigo codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public Nombre getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the nombre_especifico
	 */
	public NombreE getNombre_especifico() {
		return nombre_especifico;
	}
	/**
	 * @param nombre_especifico the nombre_especifico to set
	 */
	public void setNombre_especifico(NombreE nombre_especifico) {
		this.nombre_especifico = nombre_especifico;
	}
	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	/**
	 * @return the uni_adm_resp
	 */
	public UnidadAdmin getUni_adm_resp() {
		return uni_adm_resp;
	}
	/**
	 * @param uni_adm_resp the uni_adm_resp to set
	 */
	public void setUni_adm_resp(UnidadAdmin uni_adm_resp) {
		this.uni_adm_resp = uni_adm_resp;
	}
	/**
	 * @return the ruta
	 */
	public Ruta getRuta() {
		return ruta;
	}
	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	/**
	 * @return the tipo_actuacion
	 */
	public abstract TipoA getTipo_actuacion();
	/**
	 * @param tipo_actuacion the tipo_actuacion to set
	 */
	public abstract void setTipo_actuacion(TipoA tipo_actuacion);
	/**
	 * @return the familia
	 */
	public abstract Familia getFamilia();
	/**
	 * @param familia the familia to set
	 */
	public abstract void setFamilia(Familia familia);
	/**
	 * @return the procedimiento
	 */
	public abstract TipoProcedimiento getProcedimiento();
	/**
	 * @param procedimiento the procedimiento to set
	 */
	public abstract void setProcedimiento(TipoProcedimiento procedimiento);
	/**
	 * @return the inicio_tramite
	 */
	public Inicio getInicio_tramite() {
		return inicio_tramite;
	}
	/**
	 * @param inicio_tramite the inicio_tramite to set
	 */
	public void setInicio_tramite(Inicio inicio_tramite) {
		this.inicio_tramite = inicio_tramite;
	}
	/**
	 * @return the ambito
	 */
	public Ambito getAmbito() {
		return ambito;
	}
	/**
	 * @param ambito the ambito to set
	 */
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	/**
	 * @return the nivel_administrativo
	 */
	public NivelAdmin getNivel_administrativo() {
		return nivel_administrativo;
	}
	/**
	 * @param nivel_administrativo the nivel_administrativo to set
	 */
	public void setNivel_administrativo(NivelAdmin nivel_administrativo) {
		this.nivel_administrativo = nivel_administrativo;
	}
	/**
	 * @return the codigo_sia
	 */
	public CodigoSIA getCodigo_sia() {
		return codigo_sia;
	}
	/**
	 * @param codigo_sia the codigo_sia to set
	 */
	public void setCodigo_sia(CodigoSIA codigo_sia) {
		this.codigo_sia = codigo_sia;
	}
	/**
	 * @return the fecha_actualizacion_sia
	 */
	public Actuacion getFecha_actualizacion_sia() {
		return fecha_actualizacion_sia;
	}
	/**
	 * @param fecha_actualizacion_sia the fecha_actualizacion_sia to set
	 */
	public void setFecha_actualizacion_sia(Actuacion fecha_actualizacion_sia) {
		this.fecha_actualizacion_sia = fecha_actualizacion_sia;
	}
	/**
	 * @return the fecha_publicacion
	 */
	public Publicacion getFecha_publicacion() {
		return fecha_publicacion;
	}
	/**
	 * @param fecha_publicacion the fecha_publicacion to set
	 */
	public void setFecha_publicacion(Publicacion fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}
	/**
	 * @return the last_modification_date
	 */
	public Modificacion getLast_modification_date() {
		return last_modification_date;
	}
	/**
	 * @param last_modification_date the last_modification_date to set
	 */
	public void setLast_modification_date(Modificacion last_modification_date) {
		this.last_modification_date = last_modification_date;
	}
	/**
	 * @return the fecha_inicio
	 */
	public FechaInicio getFecha_inicio() {
		return fecha_inicio;
	}
	/**
	 * @param fecha_inicio the fecha_inicio to set
	 */
	public void setFecha_inicio(FechaInicio fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	/**
	 * @return the fecha_fin
	 */
	public FechaFin getFecha_fin() {
		return fecha_fin;
	}
	/**
	 * @param fecha_fin the fecha_fin to set
	 */
	public void setFecha_fin(FechaFin fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	/**
	 * @return the observaciones_plazo
	 */
	public Observaciones getObservaciones_plazo() {
		return observaciones_plazo;
	}
	/**
	 * @param observaciones_plazo the observaciones_plazo to set
	 */
	public void setObservaciones_plazo(Observaciones observaciones_plazo) {
		this.observaciones_plazo = observaciones_plazo;
	}
	protected Codigo codigo;
	protected Nombre nombre;
	protected NombreE nombre_especifico;
	protected Departamento departamento; 
	protected UnidadAdmin uni_adm_resp;
	protected Ruta ruta;
	protected TipoA tipo_actuacion; //esto cambiará según si es procedimiento o servicio
	protected Familia familia; //solo en procedimiento
	protected TipoProcedimiento procedimiento; //solo en procedimiento
	protected Inicio inicio_tramite;
	protected Ambito ambito;
	protected NivelAdmin nivel_administrativo; 
	protected CodigoSIA codigo_sia; 
	protected Actuacion fecha_actualizacion_sia;
	protected Publicacion fecha_publicacion;
	protected Modificacion last_modification_date;
	protected FechaInicio fecha_inicio;
	protected FechaFin fecha_fin;
	protected Observaciones observaciones_plazo;
}
