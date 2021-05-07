package alvaromartinfabian;

public class Comercial {

	protected double precio;
	protected String nombre;
	
	public Comercial(double precio, String nombre) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Comercial [precio=" + precio + ", nombre=" + nombre + "]";
	}
	

	
}
