package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Inicializamos el escaner en estatico
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// cargamos el fichero en la lista
		GestionFichero.leerFichero();
		// Inicialimos la variable opción
		int opc;

		// bucle que se reoite hasta que se elija una opción válida
		do {
			// bucle que se repite si no se inserta un valor correcto
			do {
				opc = -1;
				// Lanzamos el metodo muestra menú
				muestraMenu();
				try {
					opc = sc.nextInt();
					sc.nextLine();
					elijeOpcion(opc);
				} catch (InputMismatchException e) {
					System.out.println("Valor no valido");
					sc.nextLine();
				}
			} while (opc < 0);
		} while (opc != 6);

		// Cerramos el escaner
		sc.close();
	}


	// Metodo que muestra un menú con las opciones de nuestro programa 
	public static void muestraMenu() {
		System.out.println("========================");
		System.out.println("-         Menú         -");
		System.out.println("========================");
		System.out.println("1. Lista de viajes");
		System.out.println("2. Añadir viaje");
		System.out.println("3. Modifica el viaje");
		System.out.println("4. Elimina el viaje");
		System.out.println("5. Guardar los cambios");
		System.out.println("6. Salir");
		System.out.println("========================");
	}

	// Metodo que entra en la opcion de nuestro menú
	public static void elijeOpcion(int opc) {
		boolean resultado;
		switch (opc) {
		case 1 -> {
			GestionViajes.mostrarLista();
			System.out.println("OPCION 1");
		}
		case 2 -> {
			resultado = GestionViajes.addViaje(pasaObj());

			if (resultado) {
				System.out.println("Viaje añadido correctamente");
			} else {
				System.out.println("No se ha podido añadir el viaje");
			}
		}
		case 3 -> {
			modificado();
		}
		case 4 -> {
			borrado();
		}
		case 5 -> {
			GestionFichero.EscribirFichero();
		}
		case 6 -> {
			System.out.println("Has salido ");
		}
		default -> {
			System.out.println("opción no válida ");
		}
		}
	}

	// metodo que se encarga de pedir la info necesaria para modificar un viaje
	public static void modificado() {
		String lugarAModificar;
		int index = -1;
		int opcMod = 0;
		double nuevoPrecio = 0;
		String nuevaFecha = "";
		System.out.println("Dime un lugar ");
		lugarAModificar = sc.nextLine();
		if (GestionViajes.listarLugares(lugarAModificar)) {
			do {
				try {
					System.out.println("Que lugar quieres modificar ");
					index = sc.nextInt() - 1;
					sc.nextLine();
				} catch (InputMismatchException e) {
					System.out.println("No válido");
					sc.nextLine();
				}
			} while (index < 0 || index > GestionViajes.listaViajes.size());

			System.out.println("¿Que quieres modificar?");
			do {
				try {
					System.out.println("1. Precio");
					System.out.println("2. Fecha");
					opcMod = sc.nextInt();
					sc.nextLine();
				} catch (InputMismatchException e) {
					System.out.println("No es válido");
				}
			} while (opcMod < 1 || opcMod > 2);

			if (opcMod == 1) {
				System.out.println("Introduzca el nuevo precio ");
				nuevoPrecio = sc.nextDouble();
				sc.nextLine();
				if (GestionViajes.modificarViaje(index, nuevoPrecio)) {
					System.out.println("Modificación realizada correctamente ");
				} else {
					System.out.println("Error. No se pudo modificar.");
				}
			} // opc 1

			if (opcMod == 2) {
				System.out.println("Introduzca la nueva fecha ");
				nuevaFecha = sc.nextLine();
				if (GestionViajes.modificarViaje(index, nuevaFecha)) {
					System.out.println("Modificación realizada correctamente ");
				} else {
					System.out.println("Error. No se pudo modificar.");
				}
			} // opc 2

		}
	}

	// metodo que se encarga de pedir la info necesaria para borrar un viaje
	public static void borrado() {
		String lugarABorrar;
		int index;
		System.out.println("Dime un lugar ");
		lugarABorrar = sc.nextLine();
		if (GestionViajes.listarLugares(lugarABorrar)) {
			System.out.println("QUE VIAJE QUIERES BORRAR");
			index = sc.nextInt() - 1;
			if (GestionViajes.borrarViaje(index)) {
				System.out.println("Viaje borrado correctamente ");
			} else {
				System.out.println("Hubo un error. No se pudo borrar el viaje ");
			}
		}
	}//

	// metodo que se encarga decrear un objeto de la clase Viaje
	public static Viaje pasaObj() {
		String lugar;
		String fecha;
		Double precio;

		Viaje v = null;
		do {
			try {
				System.out.println("Dame el lugar del viaje");
				lugar = sc.nextLine();

				System.out.println("Dame el precio del viaje");
				precio = sc.nextDouble();
				sc.nextLine();

				System.out.println("Dame la fecha del viaje en formato dd/mm/aaaa");
				fecha = sc.nextLine();

				v = new Viaje(lugar, fecha, precio);
			} catch (InputMismatchException e) {
				System.out.println("El tipo no es el correcto");
			}
		} while (v == null);

		return v;
	}

}
