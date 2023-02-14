package gasolinera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainGasolinera {

	public static void main(String[] args) {	
		//Inicializar el tipo cuenta
		gestionGasolinera gasolinera = new gestionGasolinera();
		//Listado de cuentas (BD)
		List<gestionGasolinera> listaGasolinera = new ArrayList<>();
				
		// Imprimir el menú por consola
		// Scanner con la opción del usuario
		Scanner entradaOpcion = new Scanner(System.in);		
		Boolean cerrarMenu = false;
		int opcion;
		while(!cerrarMenu) {	
			//Mostramos el menú
			mostrarMenu();
			System.out.println("Introduza la opción deseada: ");
			opcion = entradaOpcion.nextInt();
			System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
					
			switch (opcion) {			
				case 1:
					listaGasolinera.add(gasolinera.repostajeNormal());
					System.out.println("Cuenta creada: " + listaGasolinera.get(listaGasolinera.size()-1).mostrarNormal());
					break;
				case 2:
					listaGasolinera.add(gasolinera.repostajeFactura());
					System.out.println("Cuenta creada: " + listaGasolinera.get(listaGasolinera.size()-1).mostrarFactura());
					break;
				case 3:
					gestionGasolinera.verRepostajes(listaGasolinera);
					
					break;
				case 4:
					cerrarMenu = true;
					break;
				default:

			}
		}		
	}
	
	static void mostrarMenu() {
		System.out.println("1. Repostaje Normal");
		System.out.println("2. Repostaje Factura");
		System.out.println("3. Ver Repostajes");
		System.out.println("4. Salir");
	}

}
