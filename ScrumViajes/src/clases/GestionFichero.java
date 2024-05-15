package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestionFichero {

	public static void leerFichero() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/ficheros/datosTurismo.txt"));
			String a;
			String[] partes = new String[3];
			while((a = br.readLine()) != null) {
				//Viaje nuevoViaje = new Viaje(-,-,-);
				partes = a.split(":");
				//nuevoViaje = (partes[1], partes[2], parseInt(partes[3]));
				//Gestion.addViaje(nuevoViaje);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
