package alvaromartinfabian;

import java.util.Date;

public class Comercial {

	protected double precio;
	protected String nombre;
	
	public Comercial(double precio, String nombre) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}

	
	
	public String getEntrada() {
		return entrada;
	}



	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}



	public DateFormat getFormat() {
		return format;
	}



	public void setFormat(DateFormat format) {
		this.format = format;
	}



	@Override
	public String toString() {
		return "Comercial [precio=" + precio + ", nombre=" + nombre + "]";
	}
	
	//Las siguientes líneas van comentadas debido a problemas de compilación
	
	String entrada = "25/06/1999"; // Metemos la fecha de nacimiento
	DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); // Necesitamos crear el formato de fecha
	opc = sc.nextInt();
	System.out.println(fecha);
	
	}
}
