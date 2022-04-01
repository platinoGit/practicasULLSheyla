package es.gobcan.platino.servicios.opendata.utils;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpResponse;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

//import org.apache.camel.json.simple.JsonObject;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonToObjectServicio {

	static private int BufferSize = 1024;
	String id, codigo, nombre;
	String unidadAdmin;
	Date fechaActualizacion, fechaPublicacion, fechaModificacion;
	
	public static String downloadFromURL () throws IOException {
		
		String Url = "";
		try {
			BufferedInputStream input = new BufferedInputStream(new URL("https://datos.canarias.es/catalogos/general/api/3/action/datastore_search").openStream());
			int bytes_leidos = 0;
			byte[] byteContenido = new byte[BufferSize];
			
			while((bytes_leidos = input.read(byteContenido)) != -1) {
				Url += new String(byteContenido, 0, bytes_leidos);
			}
			return Url;
		} catch (MalformedURLException exp) {
			exp.printStackTrace();
			System.out.println("Mal formación");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Salida";
	}
	public JsonToObjectServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public String getId () {
		return id;
	}
	
	public void setId (String id) {
		this.id = id;
	}
	
	public String getCodigo () {
		return codigo;
	}
	
	public void setCodigo (String cod) {
		this.codigo= cod;
	}

	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getUnidadAdmin () {
		return unidadAdmin;
	}
	
	public void setUnidadAdmin (String unidad) {
		this.unidadAdmin = unidad;
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

	public static void main(String[] args) throws Exception {
		
		System.out.println("prueba");
		// TODO Auto-generated method stub
		// Opción 2
		/*String url = "https://datos.canarias.es/catalogos/general/api/3/action/datastore_search";
		ReadJson reader = new ReadJson();
		JsonObject json = reader.readJsonFromUrl(url);
		System.out.println(json.toString());*/

		// Opción 3
		try {
			URL url = new URL("https://datos.canarias.es/catalogos/general/api/3/action/datastore_search");
			URLConnection urlCon = url.openConnection();
			System.out.println(urlCon.getContentType()); //esto da null

			InputStream is = urlCon.getInputStream();
			System.out.println("hola1"); //aqui ya da fallo

			FileOutputStream fos = new FileOutputStream("C:");
			byte[] array = new byte[1000];
			
			int leido = is.read(array);
			while (leido > 0) {
				fos.write(array, 0, leido);
				leido = is.read(array);
				
			}
			is.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
