package Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import clases.Producto;
import clases.Venta;

public class insertVentaBorrarDespues {

	
	public static void main(String[] args) {
		
		List<Document> listaVenta = new ArrayList<Document>();
		Venta venta = null;
		Gson gson = new Gson();
		String idProducto = "idProducto";
		String efectivo = "efectivo";
		String tarjeta = "tarjeta";
		
		MongoCollection<Document> prodcol= db.getCollection("producto");
		
		List<Producto> productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"1").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"2").toJson(), Producto.class));
		venta = new Venta(1,new GregorianCalendar(2020,10,15),tarjeta,340.40,empleado1,productosVenta);
		String json = gson.toJson(venta);
		Document ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"6").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"8").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"3").toJson(), Producto.class));
		venta = new Venta(2,new GregorianCalendar(2020,10,12),efectivo,450.0,empleado2,productosVenta);
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"3").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"6").toJson(), Producto.class));
		venta = new Venta(3,new GregorianCalendar(2020,10,11),tarjeta,2350.0,empleado3,productosVenta);
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"8").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"10").toJson(), Producto.class));
		venta = new Venta(4,new GregorianCalendar(2020,5,9),tarjeta,15340.0,empleado4,productosVenta);
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"8").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"2").toJson(), Producto.class));
		venta = new Venta(5,new GregorianCalendar(2020,2,27),tarjeta,1150.0,empleado5,productosVenta);
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"1").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"7").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"9").toJson(), Producto.class));
		venta = new Venta(6,new GregorianCalendar(2020,1,30),efectivo,170.0,empleado6,productosVenta);
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"1").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"10").toJson(), Producto.class));
		venta = new Venta(7,new GregorianCalendar(2019,10,9),tarjeta,150.0,empleado7,productosVenta);
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"1").toJson(), Producto.class));
		venta = new Venta(8,new GregorianCalendar(2020,11,29),efectivo,444.0,empleado8,productosVenta);
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
		productosVenta = new ArrayList<>();
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"9").toJson(), Producto.class));
		productosVenta.add(gson.fromJson(filtrarColeccionPorId(prodcol,idProducto,"4").toJson(), Producto.class));
		venta = new Venta(9,new GregorianCalendar(2020,8,10),tarjeta,333.0,empleado9,productosVenta);
		json = gson.toJson(venta);
		ventaDocument = Document.parse(json);
		listaVenta.add(ventaDocument);
		
	}
	
	private static Document filtrarColeccionPorId(MongoCollection<Document> coleccion,String filtro, String num) {
		Bson bsonFilter = Filters.eq("filtro", "num");
		Document documento = coleccion.find(bsonFilter).first();
		return documento;
	}

}
