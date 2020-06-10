package clases;

public class Domicilio {

	private int idDomicilio;
	private String provincia;
	private String localidad;
	private String calle;
	private int numero;
	public Domicilio() {
		super();
	}
	public Domicilio(int idDomicilio, String provincia, String localidad, String calle, int numero) {
		super();
		this.idDomicilio = idDomicilio;
		this.provincia = provincia;
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
	}
	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Domicilio [idDomicilio=" + idDomicilio + ", provincia=" + provincia + ", localidad=" + localidad
				+ ", calle=" + calle + ", numero=" + numero + "]";
	}
	
	
	
}
