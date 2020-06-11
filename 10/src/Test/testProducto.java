package Test;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import clases.Producto;

import com.google.gson.Gson;

public class testProducto {

	public static void main(String[] args) {
		
	List<Document> listaProd = new ArrayList<Document>();
	Producto prod = null;
	Gson gson = new Gson();
	
	prod = new Producto(1,"medicamento","Ibuprofeno 600","Medici",150.0);
	String json = gson.toJson(prod);
	Document producto = Document.parse(json);
	
	listaProd.add(producto);
	
	prod = new Producto(2,"medicamento","Ranitidina","Bagal",20.0);
	json = gson.toJson(prod);
	producto = Document.parse(json);
	
	listaProd.add(producto);
	
	prod=new Producto(3,"perfumeria","Cepillo de dientes","Colgate",220.0);
	json = gson.toJson(prod);
	producto= Document.parse(json);
	
	listaProd.add(producto);
	
	prod=new Producto(4,"perfumeria","Dentrifico","Oral B",178.50);
	json = gson.toJson(prod);
	producto= Document.parse(json);
	
	listaProd.add(producto);
	
	prod=new Producto(5,"perfumeria","Jabon neutro","Ala",20.0);
	json = gson.toJson(prod);
	producto= Document.parse(json);
	
	listaProd.add(producto);

	prod=new Producto(6,"perfumeria","Shampoo","Sedal",350.0);
	json = gson.toJson(prod);
	producto= Document.parse(json);
	
	listaProd.add(producto);
	
	prod=new Producto(7,"perfumeria","Desodorante","Axe",140.35);
	json = gson.toJson(prod);
	producto= Document.parse(json);
	
	listaProd.add(producto);
	
	prod=new Producto(8,"medicamento","Ranitidina","Bagal",20.0);
	json = gson.toJson(prod);
	producto= Document.parse(json);
	
	listaProd.add(producto);
	
	prod=new Producto(9,"perfumeria","Perfume XYL","Bagal",720.0);
	json = gson.toJson(prod);
	producto= Document.parse(json);
	
	listaProd.add(producto);
	
	prod=new Producto(10,"perfumeria","Acondicionador","Sedal",320.0);
	json = gson.toJson(prod);
	producto= Document.parse(json);
	
	listaProd.add(producto);
	
	//insertproductos
	
	}

}
