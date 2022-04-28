package webService;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

// Aclarar si en herencia es así
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosServicios", propOrder = {

		"identificador",
		"codigo",
		"nombre",
		"nombre_especifico",
		"departamento",
		"uni_adm_resp",
		"ruta",
		"tipo_actuacion",
		"inicio_tramite",
		"ambito",
		"nivel_administrativo",
		"codigoSIA",
		"fecha_actualizacion_sia",
		"fecha_publicacion",
		"modification_date",
		"fecha_inicio",
		"fecha_fin",
		"obs"

})

public class DatosServicios {

	public Id getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Id identificador) {
		this.identificador = identificador;
	}
	public Codigo getCodigo() {
		return codigo;
	}
	public void setCodigo(Codigo codigo) {
		this.codigo = codigo;
	}
	public Nombre getNombre() {
		return nombre;
	}
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}
	public NombreE getNombre_especifico() {
		return nombre_especifico;
	}
	public void setNombre_especifico(NombreE nombre_especifico) {
		this.nombre_especifico = nombre_especifico;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public UnidadAdmin getUni_adm_resp() {
		return uni_adm_resp;
	}
	public void setUni_adm_resp(UnidadAdmin uni_adm_resp) {
		this.uni_adm_resp = uni_adm_resp;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	public TipoA getTipo_actuacion() {
		return tipo_actuacion;
	}
	public void setTipo_actuacion(TipoA tipo_actuacion) {
		this.tipo_actuacion = tipo_actuacion;
	}
	public Inicio getInicio_tramite() {
		return inicio_tramite;
	}
	public void setInicio_tramite(Inicio inicio_tramite) {
		this.inicio_tramite = inicio_tramite;
	}
	public Ambito getAmbito() {
		return ambito;
	}
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	public NivelAdmin getNivel_administrativo() {
		return nivel_administrativo;
	}
	public void setNivel_administrativo(NivelAdmin nivel_administrativo) {
		this.nivel_administrativo = nivel_administrativo;
	}
	public CodigoSIA getCodigoSIA() {
		return codigoSIA;
	}
	public void setCodigoSIA(CodigoSIA codigoSIA) {
		this.codigoSIA = codigoSIA;
	}
	public Actuacion getFecha_actualizacion_sia() {
		return fecha_actualizacion_sia;
	}
	public void setFecha_actualizacion_sia(Actuacion fecha_actualizacion_sia) {
		this.fecha_actualizacion_sia = fecha_actualizacion_sia;
	}
	public Publicacion getFecha_publicacion() {
		return fecha_publicacion;
	}
	public void setFecha_publicacion(Publicacion fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}
	public Modificacion getModification_date() {
		return modification_date;
	}
	public void setModification_date(Modificacion modification_date) {
		this.modification_date = modification_date;
	}
	public FechaInicio getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(FechaInicio fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public FechaFin getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(FechaFin fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public Observaciones getObs() {
		return obs;
	}
	public void setObs(Observaciones obs) {
		this.obs = obs;
	}
	protected Id identificador;
	protected Codigo codigo;
	protected Nombre nombre;
	protected NombreE nombre_especifico;
	protected Departamento departamento;
	protected UnidadAdmin uni_adm_resp;
	protected Ruta ruta;
	protected TipoA tipo_actuacion;
	protected Inicio inicio_tramite;
	protected Ambito ambito;
	protected NivelAdmin nivel_administrativo;
	protected CodigoSIA codigoSIA;
	protected Actuacion fecha_actualizacion_sia;
	protected Publicacion fecha_publicacion;
	protected Modificacion modification_date;
	protected FechaInicio fecha_inicio;
	protected FechaFin fecha_fin;
	protected Observaciones obs;


}
