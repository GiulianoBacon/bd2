package Test;

import clases.*;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.MongoClient;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.google.gson.*;

public class testPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

		MongoDatabase db = mongoClient.getDatabase("farmacia");
		MongoCollection<Document> colpersona = db.getCollection("persona");
		MongoCollection<Document> coldomicilio = db.getCollection("domicilio");
		List<Document> personas = new ArrayList<Document>();
		
		Document cliente1 = new Document();
		cliente1.append("dni", 41432889);
		cliente1.append("apellido", "Bacon");
		cliente1.append("nombre", "Giuliano");
		cliente1.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", "1"));
		personas.add(cliente1);

		Document cliente2 = new Document();
		cliente1.append("dni", 41432889);
		cliente1.append("apellido", "Bacon");
		cliente1.append("nombre", "Giuliano");
		cliente1.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", "1"));
		personas.add(cliente2);
		
		Document cliente3 = new Document();
		cliente1.append("dni", 41432889);
		cliente1.append("apellido", "Bacon");
		cliente1.append("nombre", "Giuliano");
		cliente1.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", "1"));
		personas.add(cliente3);
		
		Document cliente4 = new Document();
		cliente1.append("dni", 41432889);
		cliente1.append("apellido", "Bacon");
		cliente1.append("nombre", "Giuliano");
		cliente1.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", "1"));
		personas.add(cliente4);

		colpersona.insertMany(personas);
		
		String json= new Gson().toJson(personas);
		System.out.println(json);
				
		Persona json2 = new Gson().fromJson(json, Persona.class);
		System.out.println(json.toString());
	}

	private static Document FlitrarColeccionPorId(MongoCollection<Document> coleccion,String filtro, String num) {
		Bson bsonFilter = Filters.eq("filtro", "num");
		Document documento = coleccion.find(bsonFilter).first();
		return documento;
	}

}
