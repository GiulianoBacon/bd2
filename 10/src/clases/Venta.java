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

	public Venta() {
	}

	public Venta(int nroTicket, GregorianCalendar fecha, String formaPago, double pagoTotal, Empleado empleado,Sucursal sucursal) {
		super();
		this.nroTicket = nroTicket;
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.pagoTotal = pagoTotal;
		this.productos=new ArrayList<Producto>();
		this.empleado=empleado;
		this.sucursal = sucursal;
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

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	
	
}
