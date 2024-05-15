package clases;

/**
 * Clase con la informacion sobre los viajes
 */
public class Viaje {

	/**
	 * Lugar a donde va el viaje
	 */
	private String lugar;
	/**
	 * Fecha del viaje
	 */
	private String fecha = "01/01/2000";
	/**
	 * Precio del viaje
	 */
	private double precio;

	/**
	 * Constructor con los atributos de viaje
	 * 
	 * @param lugar  Lugar a donde va el viaje
	 * @param fecha  Fecha del viaje
	 * @param precio Precio que tendrá el viaje
	 */
	public Viaje(String lugar, String fecha, double precio) {

		if (lugar != null && !lugar.equals("")) {
			this.lugar = lugar;
		}

		if (validaFecha(fecha)) {
			this.fecha = fecha;
		}

		if (precio >= 0) {
			this.precio = precio;
		}

	}
	
	/**
	 * Obtiene la fecha del Viaje
	 * 
	 * @return
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Cambia la fecha del Viaje
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		if (validaFecha(fecha)) {
			this.fecha = fecha;
		}
	}

	/**
	 * Obtiene el precio del Viaje
	 * 
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Cambia el precio del viaje
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	/**
	 * Obtiene el lugar del viaje
	 * 
	 * @return
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * To string con la información del viaje
	 * 
	 * @return String con la información
	 */
	@Override
	public String toString() {
		String cadena = "";

		cadena += this.lugar + ",  " + this.fecha + ", " + this.precio + "\n";

		return cadena;
	}

	/**
	 * Valida que la fecha esté en fomato dd/mm/aaaa, si es incorrecta saca el
	 * mensaje default del atributo fecha, puede dar una excepción si no se
	 * introducen números en la fecha
	 *
	 * @param fecha Fecha del viaje
	 * @return booleano para saber si la fecha tiene formato válido
	 */
	public boolean validaFecha(String fecha) {
		String[] cadena = fecha.split("/");
		boolean valida = false;
		int dia;
		int mes;
		// Valida que cada parte de la fecha tenga la longitud que debe
		if (cadena.length == 3) {
			if (cadena[0].length() == 2 && cadena[1].length() == 2 && cadena[2].length() == 4) {
				valida = true;
			}
		}
		// Si tiene todo el formato que debe tener comprueba que los números de la fecha
		// sean correctos
		if (valida) {
			dia = Integer.parseInt(cadena[0]);
			mes = Integer.parseInt(cadena[1]);
			Integer.parseInt(cadena[2]);
			if ((dia < 1 || dia > 31) || (mes < 1 || mes > 12)) {
				valida = false;
			}
		}
		return valida;
	}


	/**
	 * Comprueba si dos viajes son iguales, lo son cuando el lugar y la fecha
	 * coinciden
	 * 
	 * @return Booleano de comprobación, true si son iguales, false si no lo son
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;

		Viaje viaje = (Viaje) obj;

		if (this.lugar.equals(viaje.lugar) && this.fecha.equals(viaje.fecha)) {
			iguales = true;
		}

		return iguales;
	}

}
