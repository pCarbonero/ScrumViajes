package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFichero {

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
