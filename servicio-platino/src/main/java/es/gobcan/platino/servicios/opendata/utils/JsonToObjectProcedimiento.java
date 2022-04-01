package es.gobcan.platino.servicios.opendata.utils;

import java.sql.Date;

//import com.fasterxml.jackson.databind.*;

public class JsonToObjectProcedimiento {

	String _id, nombre, nombreEspecifico;
	String departamento, unidadAdmin, ruta;
	String TipoActuacion, TipoProcedimiento;
	String InicioTramite, ambito, nivel;
	String codigoSia;
	Date fechaActualizacion, fechaPublicacion, fechaModificacion;
	String familia, observaciones;
	Date fechaInic, fechaFin;
	
	public JsonToObjectProcedimiento() {
		// TODO Auto-generated constructor stub
	}
	
	public Date getFechaFin () {
		return fechaFin;
	}
	
	public void setFechaFin (Date fin) {
		this.fechaFin = fin;
	}
	
	public Date getfechaInic () {
		return fechaInic;
	}
	
	public void setFechaInic (Date inic) {
		this.fechaInic = inic;
	}
	
	public String getObservaciones () {
		return observaciones;
	}
	
	public void setObservaciones (String obv) {
		this.observaciones = obv;
	}
	
	public String getFamilia () {
		return familia;
	}
	
	public void setFamilia (String familia) {
		this.familia = familia;
	}
	
	public Date getfechaModificacion () {
		return fechaModificacion;
	}
	
	public void setFechaModificacion (Date act) {
		this.fechaModificacion = act;
	}
	
	public Date getfechaPublicacion () {
		return fechaPublicacion;
	}
	
	public void setFechaPublicacion (Date act) {
		this.fechaPublicacion = act;
	}
	
	public Date getfechaActualizacion () {
		return fechaActualizacion;
	}
	
	public void setFechaActualizacion (Date act) {
		this.fechaActualizacion = act;
	}
	
	public String getCodigo () {
		return codigoSia;
	}
	
	public void setCodigo (String cod) {
		this.codigoSia = cod;
	}
	
	public String getNivel () {
		return nivel;
	}
	
	public void setNivel (String nivel) {
		this.nivel = nivel;
	}
	
	public String getAmbito () {
		return ambito;
	}
	
	public void setAmbito (String ambito) {
		this.ambito = ambito;
	}
	
	public String getInicioTramite () {
		return InicioTramite;
	}
	
	public void setInicioTramite (String inicio) {
		this.InicioTramite = inicio;
	}
	
	public String getTipoProcedimiento () {
		return TipoProcedimiento;
	}
	
	public void setTipoProcedimiento (String proc) {
		this.TipoProcedimiento = proc;
	}
	
	public String getTipoActuacion () {
		return TipoActuacion;
	}
	
	public void setTipoActuacion (String act) {
		this.TipoActuacion = act;
	}
	
	public String getRuta () {
		return ruta;
	}
	
	public void setRuta (String ruta) {
		this.ruta = ruta;
	}
	
	public String getUnidadAdmin () {
		return unidadAdmin;
	}
	
	public void setUnidadAdmin (String unidad) {
		this.unidadAdmin = unidad;
	}
	
	public String getDepartamento () {
		return departamento;
	}
	
	public void setDepartamento (String departamento) {
		this.departamento = departamento;
	}
	
	public String getId () {
		return _id;
	}
	
	public void setId (String id) {
		this._id = id;
	}

	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreEspecifico () {
		return nombreEspecifico;
	}
	
	public void setNombreEspecifico (String nombreE) {
		this.nombreEspecifico = nombreE;
	}

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("prueba");


	}

}
