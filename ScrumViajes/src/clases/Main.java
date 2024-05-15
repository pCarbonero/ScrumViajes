package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Inicializamos el escaner en estatico
	static Scanner sc = new Scanner(System.in);

	/**
	 * Clase main de nuestra Agencia de viajes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//cargamos el fichero en la lista
		GestionFichero.leerFichero();
		// Inicialimos la variable opción
		int opc;

		do {
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

	/**
	 * Metodo que muestra un menú con las opciones de nuestro programa
	 */
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

	/**
	 * Metodo que entra en la opcion de nuestro menú
	 */
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
		/*case 3 -> {

		}
		case 4 -> {

		}
		case 5 -> {

		}*/
		case 6 -> {
			System.out.println("Has salido ");
		}
		default -> {
			System.out.println("oción no válida ");
		}
		}
	}

	/**
	 * Metodo que envia el objeto con los datos necesarios
	 * 
	 * @return
	 */
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
