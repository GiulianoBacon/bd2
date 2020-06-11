package Test;

import clases.*;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.google.gson.Gson;
import com.mongodb.client.MongoClient;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

public class testAfiliado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

			MongoDatabase db = mongoClient.getDatabase("farmacia");
			MongoCollection<Document> colObraSocial = db.getCollection("obrasocial");
			MongoCollection<Document> colafiliado = db.getCollection("afiliado");
			MongoCollection<Document> colpersona = db.getCollection("persona");

			List<Document> afiliados = new ArrayList<Document>();

			Document afiliado = new Document();
			afiliado.append("nroAfiliado", 1);
			afiliado.append("obraSocial", FlitrarColeccionPorId(colObraSocial, "idObraSocial", 1));
			afiliado.append("empleado", FlitrarColeccionPorId(colpersona, "idEmpleado", 1));
			afiliados.add(afiliado);

			Document afiliado2 = new Document();
			afiliado2.append("nroAfiliado", 2);
			afiliado2.append("obraSocial", FlitrarColeccionPorId(colObraSocial, "idObraSocial", 2));
			afiliado2.append("empleado", FlitrarColeccionPorId(colpersona, "idEmpleado", 2));
			afiliados.add(afiliado2);

			Document afiliado3 = new Document();
			afiliado3.append("nroAfiliado", 3);
			afiliado3.append("obraSocial", FlitrarColeccionPorId(colObraSocial, "idObraSocial", 3));
			afiliado3.append("empleado", FlitrarColeccionPorId(colpersona, "idEmpleado", 3));
			afiliados.add(afiliado3);

			Document afiliado4 = new Document();
			afiliado4.append("nroAfiliado", 4);
			afiliado4.append("obraSocial", FlitrarColeccionPorId(colObraSocial, "idObraSocial", 1));
			afiliado4.append("empleado", FlitrarColeccionPorId(colpersona, "idEmpleado", 4));
			afiliados.add(afiliado4);

			Document afiliado5 = new Document();
			afiliado5.append("nroAfiliado", 5);
			afiliado5.append("obraSocial", FlitrarColeccionPorId(colObraSocial, "idObraSocial", 2));
			afiliado5.append("empleado", FlitrarColeccionPorId(colpersona, "idEmpleado", 5));
			afiliados.add(afiliado5);

			Document afiliado6 = new Document();
			afiliado6.append("nroAfiliado", 6);
			afiliado6.append("obraSocial", FlitrarColeccionPorId(colObraSocial, "idObraSocial", 3));
			afiliado6.append("empleado", FlitrarColeccionPorId(colpersona, "idEmpleado", 6));
			afiliados.add(afiliado6);

			Document afiliado7 = new Document();
			afiliado7.append("nroAfiliado", 7);
			afiliado7.append("obraSocial", FlitrarColeccionPorId(colObraSocial, "idObraSocial", 1));
			afiliado7.append("empleado", FlitrarColeccionPorId(colpersona, "idEmpleado", 7));
			afiliados.add(afiliado7);

			Document afiliado8 = new Document();
			afiliado8.append("nroAfiliado", 8);
			afiliado8.append("obraSocial", FlitrarColeccionPorId(colObraSocial, "idObraSocial", 2));
			afiliado8.append("empleado", FlitrarColeccionPorId(colpersona, "idEmpleado", 8));
			afiliados.add(afiliado8);

			Document afiliado9 = new Document();
			afiliado9.append("nroAfiliado", 9);
			afiliado9.append("obraSocial", FlitrarColeccionPorId(colObraSocial, "idObraSocial", 3));
			afiliado9.append("empleado", FlitrarColeccionPorId(colpersona, "idEmpleado", 9));
			afiliados.add(afiliado9);

			colafiliado.insertMany(afiliados);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static Document FlitrarColeccionPorId(MongoCollection<Document> coleccion,String filtro, int num) {
		Bson bsonFilter = Filters.eq(filtro, num);
		Document documento = coleccion.find(bsonFilter).first();
		return documento;
	}

}
