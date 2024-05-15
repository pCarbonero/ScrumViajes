package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Metodo que contiene los metodos para la lectura y escritura del fichero para la lista de viajes
 */
public class GestionFichero {

	/**
	 * Metodo que se encarga de leer todos los viajes del fichero y crea un objeto de Viaje para cada uno
	 */
	public static void leerFichero() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/ficheros/datosTurismo.txt"));
			String linea;
			String[] partes = new String[3];
			while((linea = br.readLine()) != null) {
				Viaje nuevoViaje = null;
				partes = linea.split("::");
				nuevoViaje = new Viaje(partes[0], partes[1], Double.parseDouble(partes[2]));
				GestionViajes.recuperarDatos(nuevoViaje);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// leer
	
	/**
	 * Metodo que se encarga de registrar en el fichero un nuevo viaje insertado en la lista
	 * @param v objeto de la clase Viaje
	 */
	public static void EscribirFichero(Viaje v) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ficheros/datosTurismo.txt", true));		
			bw.newLine();
			bw.write(v.toString());
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
