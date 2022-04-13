
package es.abiertos.datos.platino;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.abiertos.datos.platino package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUnidAdmin_QNAME = new QName("http://datos.abiertos.es/platino", "getUnidAdmin");
    private final static QName _GetUnidAdminResponse_QNAME = new QName("http://datos.abiertos.es/platino", "getUnidAdminResponse");
    private final static QName _GetDepartamento_QNAME = new QName("http://datos.abiertos.es/platino", "getDepartamento");
    private final static QName _GetDepartamentoResponse_QNAME = new QName("http://datos.abiertos.es/platino", "getDepartamentoResponse");
    private final static QName _GetGestionAdmin_QNAME = new QName("http://datos.abiertos.es/platino", "getGestionAdmin");
    private final static QName _GetGestionAdminResponse_QNAME = new QName("http://datos.abiertos.es/platino", "getGestionAdminResponse");
    private final static QName _CrearDato_QNAME = new QName("http://datos.abiertos.es/platino", "crearDato");
    private final static QName _CrearDatoResponse_QNAME = new QName("http://datos.abiertos.es/platino", "crearDatoResponse");
    private final static QName _ModificacionDato_QNAME = new QName("http://datos.abiertos.es/platino", "modificacionDato");
    private final static QName _ModificacacionDatoResponse_QNAME = new QName("http://datos.abiertos.es/platino", "modificacacionDatoResponse");
    private final static QName _EliminarDato_QNAME = new QName("http://datos.abiertos.es/platino", "eliminarDato");
    private final static QName _EliminarDatoResponse_QNAME = new QName("http://datos.abiertos.es/platino", "eliminarDatoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.abiertos.datos.platino
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUnidAdmin }
     * 
     */
    public GetUnidAdmin createGetUnidAdmin() {
        return new GetUnidAdmin();
    }

    /**
     * Create an instance of {@link GetUnidAdminResponse }
     * 
     */
    public GetUnidAdminResponse createGetUnidAdminResponse() {
        return new GetUnidAdminResponse();
    }

    /**
     * Create an instance of {@link GetDepartamento }
     * 
     */
    public GetDepartamento createGetDepartamento() {
        return new GetDepartamento();
    }

    /**
     * Create an instance of {@link GetDepartamentoResponse }
     * 
     */
    public GetDepartamentoResponse createGetDepartamentoResponse() {
        return new GetDepartamentoResponse();
    }

    /**
     * Create an instance of {@link GetGestionAdmin }
     * 
     */
    public GetGestionAdmin createGetGestionAdmin() {
        return new GetGestionAdmin();
    }

    /**
     * Create an instance of {@link GetGestionAdminResponse }
     * 
     */
    public GetGestionAdminResponse createGetGestionAdminResponse() {
        return new GetGestionAdminResponse();
    }

    /**
     * Create an instance of {@link CrearDato }
     * 
     */
    public CrearDato createCrearDato() {
        return new CrearDato();
    }

    /**
     * Create an instance of {@link CrearDatoResponse }
     * 
     */
    public CrearDatoResponse createCrearDatoResponse() {
        return new CrearDatoResponse();
    }

    /**
     * Create an instance of {@link ModificacionDato }
     * 
     */
    public ModificacionDato createModificacionDato() {
        return new ModificacionDato();
    }

    /**
     * Create an instance of {@link ModificacionDatoResponse }
     * 
     */
    public ModificacionDatoResponse createModificacionDatoResponse() {
        return new ModificacionDatoResponse();
    }

    /**
     * Create an instance of {@link EliminarDato }
     * 
     */
    public EliminarDato createEliminarDato() {
        return new EliminarDato();
    }

    /**
     * Create an instance of {@link EliminarDatoResponse }
     * 
     */
    public EliminarDatoResponse createEliminarDatoResponse() {
        return new EliminarDatoResponse();
    }

    /**
     * Create an instance of {@link Identificador }
     * 
     */
    public Identificador createIdentificador() {
        return new Identificador();
    }

    /**
     * Create an instance of {@link Codigo }
     * 
     */
    public Codigo createCodigo() {
        return new Codigo();
    }

    /**
     * Create an instance of {@link Nombre }
     * 
     */
    public Nombre createNombre() {
        return new Nombre();
    }

    /**
     * Create an instance of {@link NombreEspecifico }
     * 
     */
    public NombreEspecifico createNombreEspecifico() {
        return new NombreEspecifico();
    }

    /**
     * Create an instance of {@link Departamento }
     * 
     */
    public Departamento createDepartamento() {
        return new Departamento();
    }

    /**
     * Create an instance of {@link UnidadAdministrativa }
     * 
     */
    public UnidadAdministrativa createUnidadAdministrativa() {
        return new UnidadAdministrativa();
    }

    /**
     * Create an instance of {@link Ruta }
     * 
     */
    public Ruta createRuta() {
        return new Ruta();
    }

    /**
     * Create an instance of {@link TipoActuacion }
     * 
     */
    public TipoActuacion createTipoActuacion() {
        return new TipoActuacion();
    }

    /**
     * Create an instance of {@link InicioTramite }
     * 
     */
    public InicioTramite createInicioTramite() {
        return new InicioTramite();
    }

    /**
     * Create an instance of {@link Ambito }
     * 
     */
    public Ambito createAmbito() {
        return new Ambito();
    }

    /**
     * Create an instance of {@link NivelAdministrativo }
     * 
     */
    public NivelAdministrativo createNivelAdministrativo() {
        return new NivelAdministrativo();
    }

    /**
     * Create an instance of {@link CodigoSia }
     * 
     */
    public CodigoSia createCodigoSia() {
        return new CodigoSia();
    }

    /**
     * Create an instance of {@link FechaActSia }
     * 
     */
    public FechaActSia createFechaActSia() {
        return new FechaActSia();
    }

    /**
     * Create an instance of {@link FechaPublicacion }
     * 
     */
    public FechaPublicacion createFechaPublicacion() {
        return new FechaPublicacion();
    }

    /**
     * Create an instance of {@link LastModification }
     * 
     */
    public LastModification createLastModification() {
        return new LastModification();
    }

    /**
     * Create an instance of {@link FechaInicio }
     * 
     */
    public FechaInicio createFechaInicio() {
        return new FechaInicio();
    }

    /**
     * Create an instance of {@link FechaFin }
     * 
     */
    public FechaFin createFechaFin() {
        return new FechaFin();
    }

    /**
     * Create an instance of {@link Observaciones }
     * 
     */
    public Observaciones createObservaciones() {
        return new Observaciones();
    }

    /**
     * Create an instance of {@link Familia }
     * 
     */
    public Familia createFamilia() {
        return new Familia();
    }

    /**
     * Create an instance of {@link TipoProcedimiento }
     * 
     */
    public TipoProcedimiento createTipoProcedimiento() {
        return new TipoProcedimiento();
    }

    /**
     * Create an instance of {@link ServicioProcedimiento }
     * 
     */
    public ServicioProcedimiento createServicioProcedimiento() {
        return new ServicioProcedimiento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnidAdmin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUnidAdmin }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "getUnidAdmin")
    public JAXBElement<GetUnidAdmin> createGetUnidAdmin(GetUnidAdmin value) {
        return new JAXBElement<GetUnidAdmin>(_GetUnidAdmin_QNAME, GetUnidAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnidAdminResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUnidAdminResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "getUnidAdminResponse")
    public JAXBElement<GetUnidAdminResponse> createGetUnidAdminResponse(GetUnidAdminResponse value) {
        return new JAXBElement<GetUnidAdminResponse>(_GetUnidAdminResponse_QNAME, GetUnidAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartamento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDepartamento }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "getDepartamento")
    public JAXBElement<GetDepartamento> createGetDepartamento(GetDepartamento value) {
        return new JAXBElement<GetDepartamento>(_GetDepartamento_QNAME, GetDepartamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartamentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDepartamentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "getDepartamentoResponse")
    public JAXBElement<GetDepartamentoResponse> createGetDepartamentoResponse(GetDepartamentoResponse value) {
        return new JAXBElement<GetDepartamentoResponse>(_GetDepartamentoResponse_QNAME, GetDepartamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGestionAdmin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGestionAdmin }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "getGestionAdmin")
    public JAXBElement<GetGestionAdmin> createGetGestionAdmin(GetGestionAdmin value) {
        return new JAXBElement<GetGestionAdmin>(_GetGestionAdmin_QNAME, GetGestionAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGestionAdminResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGestionAdminResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "getGestionAdminResponse")
    public JAXBElement<GetGestionAdminResponse> createGetGestionAdminResponse(GetGestionAdminResponse value) {
        return new JAXBElement<GetGestionAdminResponse>(_GetGestionAdminResponse_QNAME, GetGestionAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDato }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearDato }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "crearDato")
    public JAXBElement<CrearDato> createCrearDato(CrearDato value) {
        return new JAXBElement<CrearDato>(_CrearDato_QNAME, CrearDato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDatoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearDatoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "crearDatoResponse")
    public JAXBElement<CrearDatoResponse> createCrearDatoResponse(CrearDatoResponse value) {
        return new JAXBElement<CrearDatoResponse>(_CrearDatoResponse_QNAME, CrearDatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificacionDato }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificacionDato }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "modificacionDato")
    public JAXBElement<ModificacionDato> createModificacionDato(ModificacionDato value) {
        return new JAXBElement<ModificacionDato>(_ModificacionDato_QNAME, ModificacionDato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificacionDatoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificacionDatoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "modificacacionDatoResponse")
    public JAXBElement<ModificacionDatoResponse> createModificacacionDatoResponse(ModificacionDatoResponse value) {
        return new JAXBElement<ModificacionDatoResponse>(_ModificacacionDatoResponse_QNAME, ModificacionDatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDato }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarDato }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "eliminarDato")
    public JAXBElement<EliminarDato> createEliminarDato(EliminarDato value) {
        return new JAXBElement<EliminarDato>(_EliminarDato_QNAME, EliminarDato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDatoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarDatoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://datos.abiertos.es/platino", name = "eliminarDatoResponse")
    public JAXBElement<EliminarDatoResponse> createEliminarDatoResponse(EliminarDatoResponse value) {
        return new JAXBElement<EliminarDatoResponse>(_EliminarDatoResponse_QNAME, EliminarDatoResponse.class, null, value);
    }

}
