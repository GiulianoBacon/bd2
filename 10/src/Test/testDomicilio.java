package Test;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClient;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

public class testDomicilio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

		MongoDatabase db = mongoClient.getDatabase("farmacia");

		MongoCollection<Document> coldomicilio = db.getCollection("domicilio");
		List<Document> domicilios = new ArrayList<Document>();
		
		Document domicilio1 = new Document();
		domicilio1.append("idDomicilio", 1);
		domicilio1.append("provincia", "BSAS");
		domicilio1.append("localidad", "LUIS GUILLON");
		domicilio1.append("calle", "JUJUY");
		domicilio1.append("numero", 211);
		domicilios.add(domicilio1);

		Document domicilio2 = new Document();
		domicilio2.append("idDomicilio", 2);
		domicilio2.append("provincia", "BSAS");
		domicilio2.append("localidad", "MONTE GRANDE");
		domicilio2.append("calle", "SALTA");
		domicilio2.append("numero", 333);
		domicilios.add(domicilio2);

		Document domicilio3 = new Document();
		domicilio3.append("idDomicilio", 3);
		domicilio3.append("provincia", "BSAS");
		domicilio3.append("localidad", "TEMPERLEY");
		domicilio3.append("calle", "MENDOZA");
		domicilio3.append("numero", 444);
		domicilios.add(domicilio3);

		Document domicilio4 = new Document();
		domicilio4.append("idDomicilio", 4);
		domicilio4.append("provincia", "BSAS");
		domicilio4.append("localidad", "TURDERA");
		domicilio4.append("calle", "SAVEDRA");
		domicilio4.append("numero", 555);
		domicilios.add(domicilio4);

		Document domicilio5 = new Document();
		domicilio5.append("idDomicilio", 5);
		domicilio5.append("provincia", "BSAS");
		domicilio5.append("localidad", "TEMPERLEY");
		domicilio5.append("calle", "BOULEVARD");
		domicilio5.append("numero", 666);
		domicilios.add(domicilio5);

		Document domicilio6 = new Document();
		domicilio6.append("idDomicilio", 6);
		domicilio6.append("provincia", "BSAS");
		domicilio6.append("localidad", "TEMPERLEY");
		domicilio6.append("calle", "CORREA");
		domicilio6.append("numero", 777);
		domicilios.add(domicilio6);

		Document domicilio7 = new Document();
		domicilio7.append("idDomicilio", 7);
		domicilio7.append("provincia", "BSAS");
		domicilio7.append("localidad", "BURZACO");
		domicilio7.append("calle", "ALSINA");
		domicilio7.append("numero", 888);
		domicilios.add(domicilio7);

		
		Document domicilio8 = new Document();
		domicilio8.append("idDomicilio", 8);
		domicilio8.append("provincia", "BSAS");
		domicilio8.append("localidad", "TEMPERLEY");
		domicilio8.append("calle", "ESPERANZA");
		domicilio8.append("numero", 999);
		domicilios.add(domicilio8);
		  
		Document domicilio9 = new Document();
		domicilio9.append("idDomicilio", 9);
		domicilio9.append("provincia", "BSAS");
		domicilio9.append("localidad", "LOMAS");
		domicilio9.append("calle", "LAPRIDA");
		domicilio9.append("numero", 101);
		domicilios.add(domicilio9);
		  
		Document domicilio10 = new Document();
		domicilio10.append("idDomicilio", 10);
		domicilio10.append("provincia", "BSAS");
		domicilio10.append("localidad", "LOMAS");
		domicilio10.append("calle", "COLOMBRES");
		domicilio10.append("numero", 202);
		domicilios.add(domicilio10);
		
		Document domicilio11 = new Document();
		domicilio11.append("idDomicilio", 11);
		domicilio11.append("provincia", "BSAS");
		domicilio11.append("localidad", "TEMPERLEY");
		domicilio11.append("calle", "MEEKS");
		domicilio11.append("numero", 303);
		domicilios.add(domicilio11);
		  
		Document domicilio12 = new Document();
		domicilio12.append("idDomicilio", 12);
		domicilio12.append("provincia", "BSAS");
		domicilio12.append("localidad", "LONGCHAMPS");
		domicilio12.append("calle", "HIPOLITO YRIGOYEN");
		domicilio12.append("numero", 404);
		domicilios.add(domicilio12);
		  
		Document domicilio13 = new Document();
		domicilio13.append("idDomicilio", 13);
		domicilio13.append("provincia", "BSAS");
		domicilio13.append("localidad", "BURZACO");
		domicilio13.append("calle", "S.DOMINGO");
		domicilio13.append("numero", 505);
		domicilios.add(domicilio13);
		  
		Document domicilio14 = new Document();
		domicilio14.append("idDomicilio", 14);
		domicilio14.append("provincia", "BSAS");
		domicilio14.append("localidad", "ADROGUE");
		domicilio14.append("calle", "MITRE");
		domicilio14.append("numero", 606);
		domicilios.add(domicilio14);
		  
		Document domicilio15 = new Document();
		domicilio15.append("idDomicilio", 15);
		domicilio15.append("provincia", "BSAS");
		domicilio15.append("localidad", "ADROGUE");
		domicilio15.append("calle", "ESPORA");
		domicilio15.append("numero", 707);
		domicilios.add(domicilio15);
		  
		Document domicilio16 = new Document();
		domicilio16.append("idDomicilio", 16);
		domicilio16.append("provincia", "BSAS");
		domicilio16.append("localidad", "ADROGUE");
		domicilio16.append("calle", "P.BROWN");
		domicilio16.append("numero", 808);
		domicilios.add(domicilio16);
		 
		coldomicilio.insertMany(domicilios);

	}
}
