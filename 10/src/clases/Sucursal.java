package clases;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {

	private int idSucursal;
	private Domicilio domicilio;
	private List<Empleado> empleados;
	private Empleado encargado;
	
	public Sucursal() {
		
	}

	public Sucursal(int idSucursal, Domicilio domicilio,Empleado encargado) {
		super();
		this.idSucursal = idSucursal;
		this.domicilio = domicilio;
		this.encargado=encargado;
		this.empleados=new ArrayList<Empleado>();
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Empleado getEncargado() {
		return encargado;
	}

	public void setEncargado(Empleado encargado) {
		this.encargado = encargado;
	}
	
	
	
}
