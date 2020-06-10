package Test;

import clases.*;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import com.google.gson.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		
		MongoDatabase db= mongoClient.getDatabase("farmacia");
		MongoCollection<Document> col=db.getCollection("persona");
		MongoCollection<Document> coldomicilio=db.getCollection("domicilio");
		
		FindIterable<Document> cursor = col.find();
		
		for (String name : db.listCollectionNames()) {
		    System.out.println(name.toString());
		}
		
		MongoCursor<Document> cur = col.find().iterator();
		while(cur.hasNext()) {
		
			System.out.println(cur.next());
			
			
		}
		
		List<Document> domicilios = new ArrayList<Document>();
		Domicilio dom=new Domicilio(1,"BSAS","LUIS GUILLON","JUJUY",211);
		
		Document domicilio1=new Document();
		
		domicilio1.append("idDomicilio", dom.getIdDomicilio())
		.append("provincia", dom.getProvincia())
		.append("localidad", dom.getLocalidad())
		.append("calle", dom.getCalle())
		.append("numero", dom.getNumero());
		domicilios.add(domicilio1);
	
		
		
		
		
		coldomicilio.insertMany(domicilios);
		
		
		
    

	
	
	
   // Alejo TalientoList<Document> documents = new ArrayList<Document>();
    //6:54 PMAlejo Talientocollection.insertMany(documents)
    
//		
//		Document persona1 = new Document();
//		persona1.append("dni", 41432889);
//		persona1.append("apellido", "Bacon");
//		persona1.append("nombre", "Giuliano");
//		persona1.append("domicilio", new Document("idDomicilio", dom.getIdDomicilio())
//	   	.append("provincia", dom.getProvincia())
//				.append("localidad", dom.getLocalidad())
//				.append("calle", dom.getCalle())
//				.append("numero", dom.getNumero()));
//		
//		
//		
//		col.insertOne(persona1);
		
		
	
	String json= new Gson().toJson(dom);
	System.out.println(json);
	
	Domicilio json2=new Gson().fromJson(json, Domicilio.class);
	System.out.println(json2.toString());
	}
	
		
}

