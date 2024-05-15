package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	//Inicializamos el escaner en estatico
	static Scanner sc = new Scanner(System.in);

	/**
	 * Clase main de nuestra Agencia de viajes
	 * @param args
	 */
	public static void main(String[] args) {
		//Inicialimos la variable opción
		int opc = 0;
		
		//Lanzamos el metodo muestra menú
		muestraMenu();
		
		try {
			opc=sc.nextInt();
			sc.nextLine();
			elijeOpcion(opc);
		} catch (InputMismatchException e) {
			System.out.println("Valor no valido");
			sc.nextLine();
		}
		
		//Repetimos el bucle hasta que se seleccione la opcion 6
		while (opc!=6) {
			//Lanzamos el metodo muestra menú
			muestraMenu();
			try {
				opc=sc.nextInt();
				sc.nextLine();
				elijeOpcion(opc);
			} catch (InputMismatchException e) {
				System.out.println("Valor no valido");
				sc.nextLine();
			}
			
		};
		System.out.println("Saliendo...");
		
		//Cerramos el escaner
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
		System.out.println("-------------------------");
	}
	
	/**
	 * Metodo que entra en la opcion de nuestro menú
	 */
	public static void elijeOpcion(int opc) {
		boolean resultado;
		switch (opc) {
		case 1->{
		//	Gestion.mostrarLista();
		}
		case 2->{
			//resultado=Gestion.addViaje(pasaObj());
			/*if (resultado) {
				System.out.println("Viaje añadido correctamente");
			} else {
				System.out.println("No se ha podido añadir el viaje");
			}*/
		}
		case 3->{
			
		}
		case 4->{
			
		}
		case 5->{
			
		}
		case 6->{
			
		}
		default->{
			
		}
		}
	}
	
	/**
	 * Metodo que envia el objeto con los datos necesarios
	 * @return
	 */
	/*public static Viaje pasaObj() {
		Viaje vj = new Viaje();

			System.out.println("Dame el lugar del viaje");
			vj.lugar=sc.nextLine();
			
			try {
				System.out.println("Dame el precio del viaje");
				vj.precio=sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("El tipo no es el correcto");
			}
			
			try {
				System.out.println("Dame la fecha del viaje con el formato dd/mm/aaaa");
				vj.fecha=sc.nextLine();
			} catch (NumberFormatException e) {
				System.out.println("El tipo no es el correcto");
			}
		
		return vj;
	}*/
	
	

}
