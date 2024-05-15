package clases;

import java.util.ArrayList;

public class Gestion<T> {
	/*static T algo;
	static ArrayList<T> listaViajes = new ArrayList<>();
	
	
	
	// metodo que comprueba si el viaje recibido por parámetro ya existe en la lista
	public static boolean existeViaje(T t) {
		boolean existe = false;
		if (listaViajes.contains(t)) {
			existe = true;
		}
		return existe;
	}// existeViaje()
	
	// método que añade un elemento más a la lista si este no existe
	public static boolean addViaje(T t) {
		boolean anadido = false;
		if (!existeViaje(t)) {
			listaViajes.add(t);
			anadido = true;
		}	
		return anadido;
	}// addViaje()
	
	public static void mostrarLista() {
		for (T tt : listaViajes) {
			System.out.println(tt);
		}
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
