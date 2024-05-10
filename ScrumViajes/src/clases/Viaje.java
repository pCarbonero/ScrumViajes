package clases;

/**
 * Clase con la informacion sobre los viajes
 */
public class Viaje {

	private String lugar;

	private String fecha;

	private double precio;

	public Viaje(String lugar, int dia, int mes, int ano, double precio) {

		if (lugar != null && !lugar.equals("")) {
			this.lugar = lugar;
		}
		
		//asignar el atributo fecha AQUI
			//funcion que formatea la fecha
		if(precio >= 0) {
			this.precio = precio;
		}
		
		
	

	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getLugar() {
		return lugar;
	}

}
