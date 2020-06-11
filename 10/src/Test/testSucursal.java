package Test;

import clases.*;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.MongoClient;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

public class testSucursal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

		MongoDatabase db = mongoClient.getDatabase("farmacia");
		MongoCollection<Document> colsucursal = db.getCollection("sucursal");
		MongoCollection<Document> colpersona = db.getCollection("persona");
		MongoCollection<Document> coldomicilio = db.getCollection("domicilio");
		
		List<Document> sucursales = new ArrayList<Document>();
		List<Document> empleados_Sucursal1 = new ArrayList<Document>();
		List<Document> empleados_Sucursal2 = new ArrayList<Document>();
		List<Document> empleados_Sucursal3 = new ArrayList<Document>();

		empleados_Sucursal1.add(FlitrarColeccionPorId(colpersona, "idEmpleado", 1));
		empleados_Sucursal1.add(FlitrarColeccionPorId(colpersona, "idEmpleado", 2));
		empleados_Sucursal1.add(FlitrarColeccionPorId(colpersona, "idEmpleado", 3));
		
		empleados_Sucursal2.add(FlitrarColeccionPorId(colpersona, "idEmpleado", 4));
		empleados_Sucursal2.add(FlitrarColeccionPorId(colpersona, "idEmpleado", 5));
		empleados_Sucursal2.add(FlitrarColeccionPorId(colpersona, "idEmpleado", 6));
		
		empleados_Sucursal3.add(FlitrarColeccionPorId(colpersona, "idEmpleado", 7));
		empleados_Sucursal3.add(FlitrarColeccionPorId(colpersona, "idEmpleado", 8));
		empleados_Sucursal3.add(FlitrarColeccionPorId(colpersona, "idEmpleado", 9));

		Document sucursal1 = new Document();
		sucursal1.append("idSucursal", 1);
		sucursal1.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 14));
		sucursal1.append("empleados", empleados_Sucursal1);
		sucursales.add(sucursal1);

		Document sucursal2 = new Document();
		sucursal2.append("idSucursal", 2);
		sucursal2.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 15));
		sucursal2.append("empleados", empleados_Sucursal2);
		sucursales.add(sucursal2);

		Document sucursal3 = new Document();
		sucursal3.append("idSucursal", 3);
		sucursal3.append("domicilio", FlitrarColeccionPorId(coldomicilio, "idDomicilio", 16));
		sucursal3.append("empleados", empleados_Sucursal3);
		sucursales.add(sucursal3);
	
		colsucursal.insertMany(sucursales);
		
	}

	private static Document FlitrarColeccionPorId(MongoCollection<Document> coleccion, String filtro, int num) {
		Bson bsonFilter = Filters.eq(filtro, num);
		Document documento = coleccion.find(bsonFilter).first();
		return documento;
	}

}
