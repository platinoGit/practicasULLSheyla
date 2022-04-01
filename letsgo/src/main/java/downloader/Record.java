package downloader;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Record {

	@SerializedName("_id")
	@Expose
	private Integer id;
	@SerializedName("codigo")
	@Expose
	private Integer codigo;
	@SerializedName("nombre")
	@Expose
	private String nombre;
	@SerializedName("nombre_especifico")
	@Expose
	private String nombreEspecifico;
	@SerializedName("departamento")
	@Expose
	private String departamento;
	@SerializedName("uni_adm_resp")
	@Expose
	private String uniAdmResp;
	@SerializedName("ruta")
	@Expose
	private String ruta;
	@SerializedName("tipo_actuacion")
	@Expose
	private String tipoActuacion;
	@SerializedName("inicio_tramite")
	@Expose
	private String inicioTramite;
	@SerializedName("ambito")
	@Expose
	private String ambito;
	@SerializedName("nivel_administrativo")
	@Expose
	private String nivelAdministrativo;
	@SerializedName("codigo_sia")
	@Expose
	private Integer codigoSia;
	@SerializedName("fecha_actualizacion_sia")
	@Expose
	private String fechaActualizacionSia;
	@SerializedName("fecha_publicacion")
	@Expose
	private String fechaPublicacion;
	@SerializedName("last_modification_date")
	@Expose
	private String lastModificationDate;
	@SerializedName("fecha_inicio")
	@Expose
	private Object fechaInicio;
	@SerializedName("fecha_fin")
	@Expose
	private Object fechaFin;
	@SerializedName("observaciones_plazo")
	@Expose
	private String observacionesPlazo;

	public Integer getId() {
	return id;
	}

	public void setId(Integer id) {
	this.id = id;
	}

	public Integer getCodigo() {
	return codigo;
	}

	public void setCodigo(Integer codigo) {
	this.codigo = codigo;
	}

	public String getNombre() {
	return nombre;
	}

	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	public String getNombreEspecifico() {
	return nombreEspecifico;
	}

	public void setNombreEspecifico(String nombreEspecifico) {
	this.nombreEspecifico = nombreEspecifico;
	}

	public String getDepartamento() {
	return departamento;
	}

	public void setDepartamento(String departamento) {
	this.departamento = departamento;
	}

	public String getUniAdmResp() {
	return uniAdmResp;
	}

	public void setUniAdmResp(String uniAdmResp) {
	this.uniAdmResp = uniAdmResp;
	}

	public String getRuta() {
	return ruta;
	}

	public void setRuta(String ruta) {
	this.ruta = ruta;
	}

	public String getTipoActuacion() {
	return tipoActuacion;
	}

	public void setTipoActuacion(String tipoActuacion) {
	this.tipoActuacion = tipoActuacion;
	}

	public String getInicioTramite() {
	return inicioTramite;
	}

	public void setInicioTramite(String inicioTramite) {
	this.inicioTramite = inicioTramite;
	}

	public String getAmbito() {
	return ambito;
	}

	public void setAmbito(String ambito) {
	this.ambito = ambito;
	}

	public String getNivelAdministrativo() {
	return nivelAdministrativo;
	}

	public void setNivelAdministrativo(String nivelAdministrativo) {
	this.nivelAdministrativo = nivelAdministrativo;
	}

	public Integer getCodigoSia() {
	return codigoSia;
	}

	public void setCodigoSia(Integer codigoSia) {
	this.codigoSia = codigoSia;
	}

	public String getFechaActualizacionSia() {
	return fechaActualizacionSia;
	}

	public void setFechaActualizacionSia(String fechaActualizacionSia) {
	this.fechaActualizacionSia = fechaActualizacionSia;
	}

	public String getFechaPublicacion() {
	return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
	this.fechaPublicacion = fechaPublicacion;
	}

	public String getLastModificationDate() {
	return lastModificationDate;
	}

	public void setLastModificationDate(String lastModificationDate) {
	this.lastModificationDate = lastModificationDate;
	}

	public Object getFechaInicio() {
	return fechaInicio;
	}

	public void setFechaInicio(Object fechaInicio) {
	this.fechaInicio = fechaInicio;
	}

	public Object getFechaFin() {
	return fechaFin;
	}

	public void setFechaFin(Object fechaFin) {
	this.fechaFin = fechaFin;
	}

	public String getObservacionesPlazo() {
	return observacionesPlazo;
	}

	public void setObservacionesPlazo(String observacionesPlazo) {
	this.observacionesPlazo = observacionesPlazo;
	}
}
