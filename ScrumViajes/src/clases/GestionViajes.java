package clases;

import java.util.ArrayList;

/**
 * Clase que tiene los metodos para la gestion de la lista de viajes
 */
public class GestionViajes {
	/**
	 * Lista que contiene todos los viajes
	 */
	static ArrayList<Viaje> listaViajes = new ArrayList<>();
	/**
	 * 
	 */
	static ArrayList<Viaje> listaLugares = new ArrayList<>();
	/**
	 * metodo que comprueba si el viaje recibido por parámetro ya existe en la lista
	 * @param v objeto de la clase Viaje
	 * @return devuelve si ha encontrado un viaje igual o no
	 */
	public static boolean existeViaje(Viaje v) {
		boolean existe = false;
		if (listaViajes.contains(v)) {
			existe = true;
		}
		return existe;
	}// existeViaje()
	
	/**
	 * método que añade un elemento más a la lista si este no existe
	 * @param v objeto de la clase Viaje
	 * @return devuelve si ha podido realizar la insercion o no
	 */
	public static boolean addViaje(Viaje v) {
		boolean anadido = false;
		if (!existeViaje(v)) {
			listaViajes.add(v);
			anadido = true;
		}	
		return anadido;
	}// addViaje()
	
	/**
	 * Metodo que muestra todos los elementos de la lista
	 */
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
	
	/**
	 * Metodo que añade todos los elementos del fichero a la lista la inicio del programa
	 * @param v
	 */
	public static void recuperarDatos(Viaje v) {
		listaViajes.add(v);
	}
	
	public static boolean listarLugares(String lugar) {
		int cont = 1;
		boolean siHay = true;
		for (Viaje v : listaViajes) {
			if (v.getLugar().equals(lugar)) {
				System.out.println(cont + ": " + v);
				listaLugares.add(v);
				cont++;
			}
		}// for
		if (listaLugares.size() == 0) {
			siHay = false;
		}
		return siHay;
	}// ()
	
	/**
	 * 
	 * @param index
	 */
	public static boolean borrarViaje(int index) {
		int i = 0;
		boolean borrado = false;
		while(i < listaViajes.size() && !borrado) {
			if(listaLugares.get(index).equals(listaViajes.get(i))) {
				listaViajes.remove(i);
				borrado = true;
				listaLugares.clear();
			}
			i++;
		}
		return borrado;
	}// borrarViaje
	
	/**
	 * 
	 * @param index
	 * @param precio
	 * @return
	 */
	public static boolean modificarViaje(int index, double precio) {
		int i = 0;
		boolean modificado = false;
		while(i < listaViajes.size() && !modificado) {
			if(listaLugares.get(index).equals(listaViajes.get(i))) {
				listaViajes.get(i).setPrecio(precio);
				modificado = true;
				listaLugares.clear();
			}
			i++;
		}
		return modificado;
	}// modificarViaje
	
	public static boolean modificarViaje(int index, String fecha) {
		int i = 0;
		boolean modificado = false;
		while(i < listaViajes.size() && !modificado) {
			if(listaLugares.get(index).equals(listaViajes.get(i))) {
				listaViajes.get(i).setFecha(fecha);
				modificado = true;
				listaLugares.clear();
			}
			i++;
		}
		return modificado;
	}// modificarViaje
	
	
	
}// class
