package mongo;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.*;

import java.util.Arrays;

import org.bson.Document;



public class MongoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		
		MongoDatabase db= mongoClient.getDatabase("farmacia");
		MongoCollection<Document> col=db.getCollection("persona");
		
		FindIterable<Document> cursor = col.find();
		
		for (String name : db.listCollectionNames()) {
		    System.out.println(name.toString());
		}
		
		MongoCursor<Document> cur = col.find().iterator();
		while(cur.hasNext()) {
		
			System.out.println(cur.next());
			
			
		}
		
		
		
		
	}
}
