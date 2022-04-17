package es.gobcan.platino.servicios.opendata.utils;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;

import org.json.*;


public class JsonToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String URL_API = "https://datos.canarias.es/catalogos/general/api/3/action/datastore_search?resource_id=d48507fd-8636-4c97-83fd-edd9ebefbbf2&limit=5";
		//Cliente para la conexi�n
		Client client = ClientBuilder.newClient();
		//Definici�n URL
		WebTarget target = client.target(URL_API);
		String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println(response);
		System.out.println(target.request(MediaType.APPLICATION_JSON).get(String.class));

		try {
			
			//Opcion 1
			//JSONObject json = new JSONObject(IOUtils.toString(new URL("https://datos.canarias.es/catalogos/general/api/3/action/datastore_search?resource_id=d48507fd-8636-4c97-83fd-edd9ebefbbf2&limit=5"), Charset.forName("UTF-8")));
			//System.out.println(json);
			
			//Opcion 2
			//JSONObject json = new JSONObject(response);
			
			//Opcion 3
			//ObjectMapper obj = new ObjectMapper();
			//Example example = obj.readValue(null, Example.class);
			
			//Opcion 4
			JSONObject json = new JSONObject(response);
			System.out.println(json.get("success"));
			
			//Opcion 5
			//Tema serialized con las clases getters y setters
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
