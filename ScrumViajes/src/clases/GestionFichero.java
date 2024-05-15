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
				partes = a.split(":");
				//
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
