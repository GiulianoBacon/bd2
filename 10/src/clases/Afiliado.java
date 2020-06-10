package clases;

public class Afiliado {

	private int nroAfiliado;
	private ObraSocial ObraSocial;
	private Empleado empleado;
	
	public Afiliado() {
		super();
	}

	public Afiliado(int nroAfiliado, clases.ObraSocial obraSocial, Empleado empleado) {
		super();
		this.nroAfiliado = nroAfiliado;
		ObraSocial = obraSocial;
		this.empleado = empleado;
	}

	public int getNroAfiliado() {
		return nroAfiliado;
	}

	public void setNroAfiliado(int nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}

	public ObraSocial getObraSocial() {
		return ObraSocial;
	}

	public void setObraSocial(ObraSocial obraSocial) {
		ObraSocial = obraSocial;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
	
}
