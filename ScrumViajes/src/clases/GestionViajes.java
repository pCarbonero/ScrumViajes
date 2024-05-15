package clases;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class GestionViajes {
	static ArrayList<Viaje> listaViajes = new ArrayList<>();
	
	
	
	// metodo que comprueba si el viaje recibido por parámetro ya existe en la lista
	public static boolean existeViaje(Viaje v) {
		boolean existe = false;
		if (listaViajes.contains(v)) {
			existe = true;
		}
		return existe;
	}// existeViaje()
	
	// método que añade un elemento más a la lista si este no existe
	public static boolean addViaje(Viaje v) {
		boolean anadido = false;
		if (!existeViaje(v)) {
			listaViajes.add(v);
			GestionFichero.EscribirFichero(v);
			anadido = true;
		}	
		return anadido;
	}// addViaje()
	
	public static void mostrarLista() {
		if (listaViajes.size() <= 0) {
			System.out.println();
		}
		else {
			for (Viaje v : listaViajes) {
				System.out.println(v);
			}
		}
	}//
	
	public static void recuperarDatos(Viaje v) {
		listaViajes.add(v);
	}
	
	/*
	public boolean borrarViaje(String lugar) {
		boolean borrado = false;
		int cont = 0;
		for (T t2: listaViajes) {
			/*if (t2.getLugar().equals(lugar)){
			  listaViajes.remove(cont);
			  borrado = true;
			}
			cont ++;
		}	
		return borrado;
	}
	
	public int buscarViaje(String lugar, String fecha) {
		int index = -1;
		int cont = 0;
		while (cont < listaViajes.size()) {
			/*if (t2.getLugar().equals(lugar) && t2.getFecha().equals(fecha)){
			  listaViajes.remove(cont);
			}
			cont ++;
		}	
		return index;
	}*/
}// class
