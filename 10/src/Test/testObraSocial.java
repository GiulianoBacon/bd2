package Test;

import clases.*;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClient;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

public class testObraSocial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

		MongoDatabase db = mongoClient.getDatabase("farmacia");
		MongoCollection<Document> colobrasocial = db.getCollection("obrasocial");
		List<Document> obrasSociales = new ArrayList<Document>();

		Document obraSocial = new Document();
		obraSocial.append("idObraSocial", "1").append("nombre", "OSDE");

		Document obraSocial2 = new Document();
		obraSocial2.append("idObraSocial", "2").append("nombre", "OSMECON");

		Document obraSocial3 = new Document();
		obraSocial3.append("idObraSocial", "3").append("nombre", "Union Personal");

		obrasSociales.add(obraSocial);
		obrasSociales.add(obraSocial2);
		obrasSociales.add(obraSocial3);

		colobrasocial.insertMany(obrasSociales);
	}
}
