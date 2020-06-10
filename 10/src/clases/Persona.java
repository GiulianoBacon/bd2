package clases;

public class Persona {

	private long dni;
	private String apellido;
	private String nombre;
	private Domicilio domicilio;
	
	public Persona() {
		super();
	}

	public Persona(long dni, String apellido, String nombre, Domicilio domicilio) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	
	
}
