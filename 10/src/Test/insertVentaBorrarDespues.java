package Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import clases.Empleado;
import clases.Producto;
import clases.Sucursal;
import clases.Venta;

public class insertVentaBorrarDespues {

	
	public static void main(String[] args) {
		
		List<Document> listaVenta = new ArrayList<Document>();
		Venta venta = null;
		Gson gson = new Gson();
		String idProducto = "idProducto";
		String idSucursal = "idSucursal";
		String efectivo = "efectivo";
		String tarjeta = "tarjeta";
		
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

		MongoDatabase db = mongoClient.getDatabase("farmacia");
		MongoCollection<Document> sucursalcol= db.getCollection("sucursal");
		MongoCollection<Document> prodcol= db.getCollection("producto");
		MongoCollection<Document> colpersona= db.getCollection("persona");
		
		List<Producto> productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,1).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,2).toJson(), Producto.class));
		venta = new Venta(1,new GregorianCalendar(2020,10,15),tarjeta,340.40,filtrarEmpleadoPorId(colpersona,"idEmpleado", 1),productosVenta,filtrarSucursalPorId(sucursalcol,"idSucursal",1));
		String json = gson.toJson(venta);
		Document ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,6).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,8).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,3).toJson(), Producto.class));
		venta = new Venta(2,new GregorianCalendar(2020,10,12),efectivo,450.0,filtrarEmpleadoPorId(colpersona,"idEmpleado", 2),productosVenta,filtrarSucursalPorId(sucursalcol,"idSucursal",1));
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,3).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,6).toJson(), Producto.class));
		venta = new Venta(3,new GregorianCalendar(2020,10,11),tarjeta,2350.0,filtrarEmpleadoPorId(colpersona,"idEmpleado", 3),productosVenta,filtrarSucursalPorId(sucursalcol,idSucursal,3));
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,8).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,10).toJson(), Producto.class));
		venta = new Venta(4,new GregorianCalendar(2020,5,9),tarjeta,15340.0,filtrarEmpleadoPorId(colpersona,"idEmpleado", 4),productosVenta,filtrarSucursalPorId(sucursalcol,idSucursal,2));
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,8).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,2).toJson(), Producto.class));
		venta = new Venta(5,new GregorianCalendar(2020,2,27),tarjeta,1150.0,filtrarEmpleadoPorId(colpersona,"idEmpleado", 5),productosVenta,filtrarSucursalPorId(sucursalcol,idSucursal,1));
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,1).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,7).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,9).toJson(), Producto.class));
		venta = new Venta(6,new GregorianCalendar(2020,1,30),efectivo,170.0,filtrarEmpleadoPorId(colpersona,"idEmpleado", 5),productosVenta,filtrarSucursalPorId(sucursalcol,idSucursal,3));
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,1).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,10).toJson(), Producto.class));
		venta = new Venta(7,new GregorianCalendar(2019,10,9),tarjeta,150.0,filtrarEmpleadoPorId(colpersona,"idEmpleado", 6),productosVenta,filtrarSucursalPorId(sucursalcol,idSucursal,2));
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,1).toJson(), Producto.class));
		venta = new Venta(8,new GregorianCalendar(2020,11,29),efectivo,444.0,filtrarEmpleadoPorId(colpersona,"idEmpleado", 7),productosVenta,filtrarSucursalPorId(sucursalcol,idSucursal,3));
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,9).toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,4).toJson(), Producto.class));
		venta = new Venta(9,new GregorianCalendar(2020,8,10),tarjeta,333.0,filtrarEmpleadoPorId(colpersona,"idEmpleado", 8),productosVenta,filtrarSucursalPorId(sucursalcol,idSucursal,1));
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
	}
	
	private static Document filtrarColeccionPorId(MongoCollection<Document> coleccion,String filtro, int num) {
		Bson bsonFilter = Filters.eq(filtro, num);
		Document documento = coleccion.find(bsonFilter).first();
		return documento;
	}
	
	private static Sucursal filtrarSucursalPorId(MongoCollection<Document> coleccion,String filtro, int num) {
		Bson bsonFilter = Filters.eq(filtro, num);
		Document documento = coleccion.find(bsonFilter).first();
		Gson gson = new Gson();
		return gson.fromJson(documento.toJson(), Sucursal.class);
	}
	
	private static Empleado filtrarEmpleadoPorId(MongoCollection<Document> coleccion,String filtro, int num) {
		Bson bsonFilter = Filters.eq(filtro, num);
		Document documento = coleccion.find(bsonFilter).first();
		Gson gson = new Gson();
		return gson.fromJson(documento.toJson(), Empleado.class);
	}

}
