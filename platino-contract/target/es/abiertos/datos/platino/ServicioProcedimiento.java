
package es.abiertos.datos.platino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServicioProcedimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServicioProcedimiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_id" type="{http://datos.abiertos.es/platino}Identificador"/&gt;
 *         &lt;element name="codigo" type="{http://datos.abiertos.es/platino}Codigo"/&gt;
 *         &lt;element name="nombre" type="{http://datos.abiertos.es/platino}Nombre"/&gt;
 *         &lt;element name="nombreEspecifico" type="{http://datos.abiertos.es/platino}NombreEspecifico"/&gt;
 *         &lt;element name="departamento" type="{http://datos.abiertos.es/platino}Departamento"/&gt;
 *         &lt;element name="uniAdmResp" type="{http://datos.abiertos.es/platino}UnidadAdministrativa"/&gt;
 *         &lt;element name="ruta" type="{http://datos.abiertos.es/platino}Ruta"/&gt;
 *         &lt;element name="tipoActuacion" type="{http://datos.abiertos.es/platino}TipoActuacion"/&gt;
 *         &lt;element name="inicioTramite" type="{http://datos.abiertos.es/platino}InicioTramite"/&gt;
 *         &lt;element name="ambito" type="{http://datos.abiertos.es/platino}Ambito"/&gt;
 *         &lt;element name="nivelAdministrativo" type="{http://datos.abiertos.es/platino}NivelAdministrativo"/&gt;
 *         &lt;element name="codigoSia" type="{http://datos.abiertos.es/platino}CodigoSia"/&gt;
 *         &lt;element name="fechaActualizacion_sia" type="{http://datos.abiertos.es/platino}FechaActSia"/&gt;
 *         &lt;element name="fechaPublicacion" type="{http://datos.abiertos.es/platino}FechaPublicacion"/&gt;
 *         &lt;element name="lastModification_date" type="{http://datos.abiertos.es/platino}LastModification"/&gt;
 *         &lt;element name="fechaInicio" type="{http://datos.abiertos.es/platino}FechaInicio"/&gt;
 *         &lt;element name="fechaFin" type="{http://datos.abiertos.es/platino}FechaFin"/&gt;
 *         &lt;element name="observacionesPlazo" type="{http://datos.abiertos.es/platino}Observaciones"/&gt;
 *         &lt;element name="familia" type="{http://datos.abiertos.es/platino}Familia"/&gt;
 *         &lt;element name="tipoProcedimiento" type="{http://datos.abiertos.es/platino}TipoProcedimiento"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicioProcedimiento", propOrder = {
    "id",
    "codigo",
    "nombre",
    "nombreEspecifico",
    "departamento",
    "uniAdmResp",
    "ruta",
    "tipoActuacion",
    "inicioTramite",
    "ambito",
    "nivelAdministrativo",
    "codigoSia",
    "fechaActualizacionSia",
    "fechaPublicacion",
    "lastModificationDate",
    "fechaInicio",
    "fechaFin",
    "observacionesPlazo",
    "familia",
    "tipoProcedimiento"
})
public class ServicioProcedimiento {

    @XmlElement(name = "_id", required = true)
    protected Identificador id;
    @XmlElement(required = true)
    protected Codigo codigo;
    @XmlElement(required = true)
    protected Nombre nombre;
    @XmlElement(required = true, nillable = true)
    protected NombreEspecifico nombreEspecifico;
    @XmlElement(required = true)
    protected Departamento departamento;
    @XmlElement(required = true)
    protected UnidadAdministrativa uniAdmResp;
    @XmlElement(required = true)
    protected Ruta ruta;
    @XmlElement(required = true)
    protected TipoActuacion tipoActuacion;
    @XmlElement(required = true)
    protected InicioTramite inicioTramite;
    @XmlElement(required = true)
    protected Ambito ambito;
    @XmlElement(required = true)
    protected NivelAdministrativo nivelAdministrativo;
    @XmlElement(required = true)
    protected CodigoSia codigoSia;
    @XmlElement(name = "fechaActualizacion_sia", required = true)
    protected FechaActSia fechaActualizacionSia;
    @XmlElement(required = true)
    protected FechaPublicacion fechaPublicacion;
    @XmlElement(name = "lastModification_date", required = true)
    protected LastModification lastModificationDate;
    @XmlElement(required = true)
    protected FechaInicio fechaInicio;
    @XmlElement(required = true)
    protected FechaFin fechaFin;
    @XmlElement(required = true)
    protected Observaciones observacionesPlazo;
    @XmlElement(required = true)
    protected Familia familia;
    @XmlElement(required = true)
    protected TipoProcedimiento tipoProcedimiento;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setId(Identificador value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigo(Codigo value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link Nombre }
     *     
     */
    public Nombre getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link Nombre }
     *     
     */
    public void setNombre(Nombre value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEspecifico.
     * 
     * @return
     *     possible object is
     *     {@link NombreEspecifico }
     *     
     */
    public NombreEspecifico getNombreEspecifico() {
        return nombreEspecifico;
    }

    /**
     * Define el valor de la propiedad nombreEspecifico.
     * 
     * @param value
     *     allowed object is
     *     {@link NombreEspecifico }
     *     
     */
    public void setNombreEspecifico(NombreEspecifico value) {
        this.nombreEspecifico = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link Departamento }
     *     
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento }
     *     
     */
    public void setDepartamento(Departamento value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad uniAdmResp.
     * 
     * @return
     *     possible object is
     *     {@link UnidadAdministrativa }
     *     
     */
    public UnidadAdministrativa getUniAdmResp() {
        return uniAdmResp;
    }

    /**
     * Define el valor de la propiedad uniAdmResp.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadAdministrativa }
     *     
     */
    public void setUniAdmResp(UnidadAdministrativa value) {
        this.uniAdmResp = value;
    }

    /**
     * Obtiene el valor de la propiedad ruta.
     * 
     * @return
     *     possible object is
     *     {@link Ruta }
     *     
     */
    public Ruta getRuta() {
        return ruta;
    }

    /**
     * Define el valor de la propiedad ruta.
     * 
     * @param value
     *     allowed object is
     *     {@link Ruta }
     *     
     */
    public void setRuta(Ruta value) {
        this.ruta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoActuacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoActuacion }
     *     
     */
    public TipoActuacion getTipoActuacion() {
        return tipoActuacion;
    }

    /**
     * Define el valor de la propiedad tipoActuacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoActuacion }
     *     
     */
    public void setTipoActuacion(TipoActuacion value) {
        this.tipoActuacion = value;
    }

    /**
     * Obtiene el valor de la propiedad inicioTramite.
     * 
     * @return
     *     possible object is
     *     {@link InicioTramite }
     *     
     */
    public InicioTramite getInicioTramite() {
        return inicioTramite;
    }

    /**
     * Define el valor de la propiedad inicioTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link InicioTramite }
     *     
     */
    public void setInicioTramite(InicioTramite value) {
        this.inicioTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad ambito.
     * 
     * @return
     *     possible object is
     *     {@link Ambito }
     *     
     */
    public Ambito getAmbito() {
        return ambito;
    }

    /**
     * Define el valor de la propiedad ambito.
     * 
     * @param value
     *     allowed object is
     *     {@link Ambito }
     *     
     */
    public void setAmbito(Ambito value) {
        this.ambito = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelAdministrativo.
     * 
     * @return
     *     possible object is
     *     {@link NivelAdministrativo }
     *     
     */
    public NivelAdministrativo getNivelAdministrativo() {
        return nivelAdministrativo;
    }

    /**
     * Define el valor de la propiedad nivelAdministrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link NivelAdministrativo }
     *     
     */
    public void setNivelAdministrativo(NivelAdministrativo value) {
        this.nivelAdministrativo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSia.
     * 
     * @return
     *     possible object is
     *     {@link CodigoSia }
     *     
     */
    public CodigoSia getCodigoSia() {
        return codigoSia;
    }

    /**
     * Define el valor de la propiedad codigoSia.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoSia }
     *     
     */
    public void setCodigoSia(CodigoSia value) {
        this.codigoSia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacionSia.
     * 
     * @return
     *     possible object is
     *     {@link FechaActSia }
     *     
     */
    public FechaActSia getFechaActualizacionSia() {
        return fechaActualizacionSia;
    }

    /**
     * Define el valor de la propiedad fechaActualizacionSia.
     * 
     * @param value
     *     allowed object is
     *     {@link FechaActSia }
     *     
     */
    public void setFechaActualizacionSia(FechaActSia value) {
        this.fechaActualizacionSia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacion.
     * 
     * @return
     *     possible object is
     *     {@link FechaPublicacion }
     *     
     */
    public FechaPublicacion getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Define el valor de la propiedad fechaPublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link FechaPublicacion }
     *     
     */
    public void setFechaPublicacion(FechaPublicacion value) {
        this.fechaPublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad lastModificationDate.
     * 
     * @return
     *     possible object is
     *     {@link LastModification }
     *     
     */
    public LastModification getLastModificationDate() {
        return lastModificationDate;
    }

    /**
     * Define el valor de la propiedad lastModificationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LastModification }
     *     
     */
    public void setLastModificationDate(LastModification value) {
        this.lastModificationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link FechaInicio }
     *     
     */
    public FechaInicio getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link FechaInicio }
     *     
     */
    public void setFechaInicio(FechaInicio value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link FechaFin }
     *     
     */
    public FechaFin getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link FechaFin }
     *     
     */
    public void setFechaFin(FechaFin value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionesPlazo.
     * 
     * @return
     *     possible object is
     *     {@link Observaciones }
     *     
     */
    public Observaciones getObservacionesPlazo() {
        return observacionesPlazo;
    }

    /**
     * Define el valor de la propiedad observacionesPlazo.
     * 
     * @param value
     *     allowed object is
     *     {@link Observaciones }
     *     
     */
    public void setObservacionesPlazo(Observaciones value) {
        this.observacionesPlazo = value;
    }

    /**
     * Obtiene el valor de la propiedad familia.
     * 
     * @return
     *     possible object is
     *     {@link Familia }
     *     
     */
    public Familia getFamilia() {
        return familia;
    }

    /**
     * Define el valor de la propiedad familia.
     * 
     * @param value
     *     allowed object is
     *     {@link Familia }
     *     
     */
    public void setFamilia(Familia value) {
        this.familia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProcedimiento.
     * 
     * @return
     *     possible object is
     *     {@link TipoProcedimiento }
     *     
     */
    public TipoProcedimiento getTipoProcedimiento() {
        return tipoProcedimiento;
    }

    /**
     * Define el valor de la propiedad tipoProcedimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoProcedimiento }
     *     
     */
    public void setTipoProcedimiento(TipoProcedimiento value) {
        this.tipoProcedimiento = value;
    }

}
