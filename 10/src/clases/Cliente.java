package clases;

public class Cliente extends Persona {
	
	private int idCliente;
	private Afiliado nroAfiliado;
	
	public Cliente() {
		super();
	}

	public Cliente(long dni, String apellido, String nombre, Domicilio domicilio, int idCliente, Afiliado nroAfiliado) {
		super(dni, apellido, nombre, domicilio);
		this.idCliente = idCliente;
		this.nroAfiliado = nroAfiliado;
	}
	
	
	

}
