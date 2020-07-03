package clases;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Venta {

	private int nroTicket;
	private GregorianCalendar fecha;
	private String formaPago;
	private double pagoTotal;
	private Empleado empleado;
	private List<Producto> productos;
	private Sucursal sucursal;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Venta() {
	}

	public Venta(int nroTicket, GregorianCalendar fecha, String formaPago, double pagoTotal, Empleado empleado,List<Producto> productos,Sucursal sucursal, Cliente cliente) {
		super();
		this.nroTicket = nroTicket;
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.pagoTotal = pagoTotal;
		this.productos= productos;
		this.empleado=empleado;
		this.sucursal = sucursal;
		this.cliente=cliente;
	}

	public int getNroTicket() {
		return nroTicket;
	}

	public void setNroTicket(int nroTicket) {
		this.nroTicket = nroTicket;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public double getPagoTotal() {
		return pagoTotal;
	}

	public void setPagoTotal(double pagoTotal) {
		this.pagoTotal = pagoTotal;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "Venta [nroTicket=" + nroTicket + ", fecha=" + fecha + ", formaPago=" + formaPago + ", pagoTotal="
				+ pagoTotal + ", empleado=" + empleado + ", productos=" + productos + ", sucursal=" + sucursal + "]";
	}
}
