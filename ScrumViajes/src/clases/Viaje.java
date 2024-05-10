package clases;

/**
 * Clase con la informacion sobre los viajes
 */
public class Viaje {

	private String lugar;

	private String fecha = "01/01/2000";

	private double precio;

	public Viaje(String lugar, int dia, int mes, int ano, double precio) {

		if (lugar != null && !lugar.equals("")) {
			this.lugar = lugar;
		}
		
		
		this.fecha = formatoFecha(dia, mes, ano); 
		
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

	
	public String formatoFecha(int dia, int mes, int ano)  {
		
		String fecha = "";
		
		if(dia>0 && dia>=31) {
			if(dia<=9) {
				
			}
			
			fecha += dia + "/";	
		}
		if(mes>0 && mes<=12) {
			fecha += mes + "/";
		
		}
		if(ano > 2000) {
			fecha += ano;
		}
		
		return fecha;
		
	}
	
}
