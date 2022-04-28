package es.gobcan.platino.servicios.opendata.business.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

import webService.Actuacion;
import webService.Ambito;
import webService.Codigo;
import webService.CodigoSIA;
import webService.Departamento;
import webService.Familia;
import webService.FechaFin;
import webService.FechaInicio;
import webService.Inicio;
import webService.Modificacion;
import webService.NivelAdmin;
import webService.Nombre;
import webService.NombreE;
import webService.Observaciones;
import webService.Publicacion;
import webService.Ruta;
import webService.TipoA;
import webService.TipoProcedimiento;
import webService.UnidadAdmin;

@Entity
@Table(name = "PROCEDIMIENTOS")

public class ProcedimientoEntity extends Entidad implements Serializable {

	/**Serial version por defecto*/
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, name = "codigo")
	private Codigo codigo;
	
	@Column(nullable = false, name = "nombre")
	private Nombre nombre;
	
	@Column(nullable = true, name = "nombre_especifico")
	private NombreE nombre_especifico;
	
	@Column(nullable = false, name = "departamento")
	private Departamento departamento;
	
	@Column(nullable = false, name = "uni_adm_resp")
	private UnidadAdmin uni_adm_resp;
	
	@Column(nullable = false, name = "ruta")
	private Ruta ruta;
	
	@Column(nullable = false, name = "tipo_actuacion")
	private TipoA tipo_actuacion;
	
	@Column(nullable = false, name = "tipo_procedimiento")
	private TipoProcedimiento tipo_procedimiento;
	
	@Column(nullable = false, name = "inicio_tramite")
	private Inicio inicio_tramite;
	
	@Column(nullable = false, name = "ambito")
	private Ambito ambito;
	
	@Column(nullable = false, name = "nivel_administrativo")
	private NivelAdmin nivel_administrativo;
	
	@Column(nullable = false, name = "codigoSIA")
	private CodigoSIA codigoSIA;
	
	@Column(nullable = false, name = "fecha_actualizacion_sia")
	private Actuacion fecha_actualizacion_sia;
	
	@Column(nullable = false, name = "fecha_publicacion")
	private Publicacion fecha_publicacion;
	
	@Column(nullable = false, name = "modification_date")
	private Modificacion modification_date;
	
	@Column(nullable = false, name = "familia")
	private Familia familia;
	
	@Column(nullable = false, name = "fecha_inicio")
	private FechaInicio fecha_inicio;
	
	@Column(nullable = false, name = "fecha_fin")
	private FechaFin fecha_fin;
	
	@Column(nullable = false, name = "obs")
	private Observaciones obs;

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

	public TipoProcedimiento getTipo_procedimiento() {
		return tipo_procedimiento;
	}

	public void setTipo_procedimiento(TipoProcedimiento tipo_procedimiento) {
		this.tipo_procedimiento = tipo_procedimiento;
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

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
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
}
