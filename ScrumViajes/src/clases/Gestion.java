package clases;

import java.util.ArrayList;

public class Gestion<T> {
	T algo;
	ArrayList<T> listaViajes = new ArrayList<>();
	
	
	// metodo que comprueba si el viaje recibido por parámetro ya existe en la lista
	public boolean existeViaje(T t) {
		boolean existe = false;
		if (listaViajes.contains(t)) {
			existe = true;
		}
		return existe;
	}// existeViaje()
	
	// método que añade un elemento más a la lista si este no existe
	public boolean addViaje(T t) {
		boolean anadido = false;
		if (!existeViaje(t)) {
			listaViajes.add(t);
			anadido = true;
		}	
		return anadido;
	}// addViaje()
	
	public boolean borrarViaje(String lugar) {
		boolean borrado = false;
		int cont = 0;
		for (T t2: listaViajes) {
			/*if (t2.lugar.equals(lugar)){
			  listaViajes.remove(cont);
			}*/
			cont ++;
		}
		
		return borrado;
	}
}// class
