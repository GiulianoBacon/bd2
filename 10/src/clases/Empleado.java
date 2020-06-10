package clases;

public class Empleado extends Persona{

	private int idEmpleado;
	private long cuil;
	private boolean encargado;
	private Afiliado afiliado;
	
	public Empleado() {
		super();
	}

	public Empleado(long dni, String apellido, String nombre, Domicilio domicilio, int idEmpleado,
			long cuil, boolean encargado, Afiliado afiliado) {
		super(dni, apellido, nombre, domicilio);
		this.idEmpleado = idEmpleado;
		this.cuil = cuil;
		this.encargado=encargado;
		this.afiliado=afiliado;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public long getCuil() {
		return cuil;
	}

	public void setCuil(long cuil) {
		this.cuil = cuil;
	}

	public boolean isEncargado() {
		return encargado;
	}

	public void setEncargado(boolean encargado) {
		this.encargado = encargado;
	}

	public Afiliado getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(Afiliado afiliado) {
		this.afiliado = afiliado;
	}
	
	
	
	
	
	
	
}
