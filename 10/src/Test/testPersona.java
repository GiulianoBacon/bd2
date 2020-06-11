package Test;

import clases.*;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.FindIterable;
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
		MongoCollection<Document> colafiliado = db.getCollection("afiliado");
		
		List<Document> personas = new ArrayList<Document>();
		
		Document cliente1 = new Document();
		cliente1.append("dni", 1111111);
		cliente1.append("apellido", "Bacon");
		cliente1.append("nombre", "Giuliano");
		cliente1.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 1));
		cliente1.append("idCliente", "1");
		cliente1.append("nroAfiliado", null);
		personas.add(cliente1);

		Document cliente2 = new Document();
		cliente2.append("dni", 2222222);
		cliente2.append("apellido", "Taliento");
		cliente2.append("nombre", "Alejo");
		cliente2.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 2));
		cliente2.append("idCliente", "2");
		cliente2.append("nroAfiliado", null);
		personas.add(cliente2);
		
		Document cliente3 = new Document();
		cliente3.append("dni", 33333333);
		cliente3.append("apellido", "Bombara");
		cliente3.append("nombre", "Martin");
		cliente3.append("domicilio",FlitrarColeccionPorId(coldomicilio, "idDomicilio", 3));
		cliente3.append("idCliente", "3");
		cliente3.append("nroAfiliado", "null");
		personas.add(cliente3);
		
		Document cliente4 = new Document();
		cliente4.append("dni", 4444444);
		cliente4.append("apellido", "Herrera");
		cliente4.append("nombre", "Julian");
		cliente4.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 4));
		cliente4.append("idCliente", "4");
		cliente4.append("nroAfiliado", null);
		personas.add(cliente4);
		
		Document cliente5 = new Document();
		cliente5.append("dni", 5555555);
		cliente5.append("apellido", "Olivera");
		cliente5.append("nombre", "Hernan");
		cliente5.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 5));
		cliente5.append("idCliente", "5");
		cliente5.append("nroAfiliado", null);
		personas.add(cliente5);
		
		Document cliente6 = new Document();
		cliente6.append("dni", 6666666);
		cliente6.append("apellido", "Torres");
		cliente6.append("nombre", "Luciano");
		cliente6.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 6));
		cliente6.append("idCliente", "6");
		cliente6.append("nroAfiliado", null);
		personas.add(cliente6);
		
		Document cliente7 = new Document();
		cliente7.append("dni", 7777777);
		cliente7.append("apellido", "Peper");
		cliente7.append("nombre", "Jose");
		cliente7.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 7));
		cliente7.append("idCliente", "7");
		cliente7.append("nroAfiliado", null);
		personas.add(cliente7);
		
		Document cliente8 = new Document();
		cliente8.append("dni", 8888888);
		cliente8.append("apellido", "Tevez");
		cliente8.append("nombre", "Roberto");
		cliente8.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 8));
		cliente8.append("idCliente", "8");
		cliente8.append("nroAfiliado", null);
		personas.add(cliente8);
	
		Document cliente9 = new Document();
		cliente9.append("dni", 9999999);
		cliente9.append("apellido", "Lopez");
		cliente9.append("nombre", "Lara");
		cliente9.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 9));
		cliente9.append("idCliente", "9");
		cliente9.append("nroAfiliado", null);
		personas.add(cliente9);
		
		Document cliente10 = new Document();
		cliente10.append("dni", 1010101);
		cliente10.append("apellido", "Rodriguez");
		cliente10.append("nombre", "Florencia");
		cliente10.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 10));
		cliente10.append("idCliente", "10");
		cliente10.append("nroAfiliado", null);
		personas.add(cliente10);
		
		Document empleado1 = new Document();
		empleado1.append("dni", 1212121);
		empleado1.append("apellido", "Casuso");
		empleado1.append("nombre", "Stefano");
		empleado1.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 11));
		empleado1.append("idEmpleado", "1");
		empleado1.append("cuil", "1");
		empleado1.append("encargado", false);
		empleado1.append("afiliado", FlitrarColeccionPorId(colafiliado, "nroAfiliado", 1));
		personas.add(empleado1);
		
		Document empleado2 = new Document();
		empleado2.append("dni", 1313131);
		empleado2.append("apellido", "Palacio");
		empleado2.append("nombre", "Francisco");
		empleado2.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 12));
		empleado2.append("idEmpleado", "1");
		empleado2.append("cuil", "1");
		empleado2.append("encargado", false);
		empleado2.append("afiliado", FlitrarColeccionPorId(colafiliado, "nroAfiliado", 2));
		personas.add(empleado2);
		
		Document empleado3 = new Document();
		empleado3.append("dni", 1313131);
		empleado3.append("apellido", "Montana");
		empleado3.append("nombre", "Javier");
		empleado3.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 13));
		empleado3.append("idEmpleado", "1");
		empleado3.append("cuil", "1");
		empleado3.append("encargado", true);
		empleado3.append("afiliado", FlitrarColeccionPorId(colafiliado, "nroAfiliado", 3));
		personas.add(empleado3);
		
		Document empleado4 = new Document();
		empleado4.append("dni", 1414141);
		empleado4.append("apellido", "Calvi");
		empleado4.append("nombre", "Ignacio");
		empleado4.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 14));
		empleado4.append("idEmpleado", "1");
		empleado4.append("cuil", "1");
		empleado4.append("encargado", false);
		empleado4.append("afiliado", FlitrarColeccionPorId(colafiliado, "nroAfiliado", 4));
		personas.add(empleado4);
		
		Document empleado5 = new Document();
		empleado5.append("dni", 1515151);
		empleado5.append("apellido", "Bordes");
		empleado5.append("nombre", "Juan");
		empleado5.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 16));
		empleado5.append("idEmpleado", "1");
		empleado5.append("cuil", "1");
		empleado5.append("encargado", false);
		empleado5.append("afiliado", FlitrarColeccionPorId(colafiliado, "nroAfiliado", 8));
		personas.add(empleado5);
		
		Document empleado6 = new Document();
		empleado6.append("dni", 1616161);
		empleado6.append("apellido", "Copula");
		empleado6.append("nombre", "Antonio");
		empleado6.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 10));
		empleado6.append("idEmpleado", "1");
		empleado6.append("cuil", "1");
		empleado6.append("encargado", true);
		empleado6.append("afiliado", FlitrarColeccionPorId(colafiliado, "nroAfiliado", 6));
		personas.add(empleado6);
		
		Document empleado7 = new Document();
		empleado4.append("dni", 1717171);
		empleado4.append("apellido", "Diez");
		empleado4.append("nombre", "Lautaro");
		empleado4.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 1));
		empleado4.append("idEmpleado", "1");
		empleado4.append("cuil", "1");
		empleado4.append("encargado", false);
		empleado4.append("afiliado", FlitrarColeccionPorId(colafiliado, "nroAfiliado", 7));
		personas.add(empleado7);
		
		Document empleado8 = new Document();
		empleado8.append("dni", 1818181);
		empleado8.append("apellido", "Yuyo");
		empleado8.append("nombre", "Martin");
		empleado8.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 2));
		empleado8.append("idEmpleado", "1");
		empleado8.append("cuil", "1");
		empleado8.append("encargado", false);
		empleado8.append("afiliado", FlitrarColeccionPorId(colafiliado, "nroAfiliado", 8));
		personas.add(empleado8);
		
		Document empleado9 = new Document();
		empleado9.append("dni", 1919191);
		empleado9.append("apellido", "Herrera");
		empleado9.append("nombre", "Romina");
		empleado9.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 4));
		empleado9.append("idEmpleado", "1");
		empleado9.append("cuil", "1");
		empleado9.append("encargado", true);
		empleado9.append("afiliado", FlitrarColeccionPorId(colafiliado, "nroAfiliado", 9));
		personas.add(empleado9);

		colpersona.insertMany(personas);
				
		System.out.println(personas.toString());
	}

	private static Document FlitrarColeccionPorId(MongoCollection<Document> coleccion,String filtro, int num) {
		Bson bsonFilter = Filters.eq(filtro, num);
		Document documento = coleccion.find(bsonFilter).first();
		return documento;
	}

}
