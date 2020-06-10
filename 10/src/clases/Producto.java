package clases;

import java.util.ArrayList;
import java.util.List;

public class Producto {

	private int idProducto;
	private String tipo;
	private String descripcion;
	private String laboratorio;
	private double precio;
	private List<Venta> ventas;
	
	
	public Producto() {
		super();
	}
	public Producto(int idProducto, String tipo, String descripcion, String laboratorio, double precio) {
		super();
		this.idProducto = idProducto;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.precio = precio;
		this.ventas=new ArrayList<Venta>();
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
